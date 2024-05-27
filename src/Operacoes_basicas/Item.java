package Operacoes_basicas;

public class Item {
	private String nome;
	private Double preco;
	private Integer quantidade;

	public Item(String nome, Double preco, Integer quantidade) {

		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}
	public String toString() {
		return "Nome do produto: "+nome +" Preco do produto: "+ preco +" e sua quantidade foi: "+ quantidade;
	}

}
