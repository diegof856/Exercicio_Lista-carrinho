package Operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
	private List<Item> listaCompra;

	public CarrinhoDeCompra() {

		this.listaCompra = new ArrayList<>();
	}

	public void adicionarItem(Item item) {
		this.listaCompra.add(item);
	}
	public void removerItem(String nome) {
		List<Item> itensParaRemocao = new ArrayList<>();
		for(Item i:listaCompra) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itensParaRemocao.add(i);
			}
		}
		listaCompra.removeAll(itensParaRemocao);
	}
	public void calcularValorTotal() {
		double aux = 0;
		double total = 0;
		for(Item i: listaCompra) {
			total = i.getPreco() * i.getQuantidade();
			aux += total;
		}
		total = aux;
		System.out.println("O preco total da lista é: "+total );
	}
	public void exibirItens() {
		System.out.println(listaCompra);
	}
	public static void main(String[] args) {
		Item item = new Item("TV", 2500.0, 2);
		Item item2 = new Item("Computador", 4500.0, 1);
		Item item3 = new Item("Ventilador", 500.0, 4);
		
		CarrinhoDeCompra c = new CarrinhoDeCompra();
		
		c.adicionarItem(item);
		c.adicionarItem(item2);
		c.adicionarItem(item);
		c.adicionarItem(item3);
		c.calcularValorTotal();
		c.exibirItens();
		c.removerItem("TV");
		c.exibirItens();
		c.calcularValorTotal();
		
		
	}
}
