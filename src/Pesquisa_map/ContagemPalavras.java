package Pesquisa_map;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	private Map<String, Integer> listaDeContagem;

	public ContagemPalavras() {
		this.listaDeContagem = new HashMap<>();
	}
	public void adicionarPalavra(String palavra, Integer contagem) {
		this.listaDeContagem.put(palavra, contagem);
	}
	public void removerPalavra(String palavra) {
		if(!this.listaDeContagem.isEmpty()) {
		this.listaDeContagem.remove(palavra);
		}
	}
	public void exibirContagemPalavras() {
		if(!this.listaDeContagem.isEmpty()) {
			for(Map.Entry<String, Integer> p: this.listaDeContagem.entrySet()) {
				System.out.println("Contagem "+p.getValue());
			}
		}else {
			System.out.println("A lista está vazia");
		}
	}
	public void encontrarPalavraMaisFrequente() {
		int valorInicial = 0;
		if(!this.listaDeContagem.isEmpty()) {
			
			for(Map.Entry<String, Integer> p : this.listaDeContagem.entrySet()) {
				valorInicial = p.getValue();
				if(valorInicial > p.getValue()) {
					valorInicial = p.getValue();
				}
			}
			for(Map.Entry<String, Integer> p : this.listaDeContagem.entrySet()) {
				if(p.getValue() == valorInicial) {
					System.out.println("A palavra que mais aparece é: " + p.getKey());
				}
			}
		}
	}
	public static void main(String[] args) {
		ContagemPalavras contagem = new ContagemPalavras();
		contagem.adicionarPalavra("Skyrim", 5);
		contagem.adicionarPalavra("Sol", 4);
		contagem.adicionarPalavra("Beleza", 7);
		contagem.adicionarPalavra("Aquariano nato", 10);
		
		contagem.exibirContagemPalavras();
		System.out.println("---------");
		contagem.encontrarPalavraMaisFrequente();
		System.out.println("---------");
		contagem.removerPalavra("Skyrim");
		contagem.exibirContagemPalavras();
	}
}
