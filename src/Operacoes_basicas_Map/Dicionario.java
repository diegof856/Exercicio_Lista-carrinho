package Operacoes_basicas_Map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String,String> lista_Map;
	
	public Dicionario() {
		this.lista_Map = new HashMap<>();
	}
	public void adicionarPalavra(String palavra, String definicao) {
		this.lista_Map.put(palavra, definicao);
	}
	public void removerPalavra(String palavra) {
		if(!this.lista_Map.isEmpty()) {
			this.lista_Map.remove(palavra);
		}
		System.out.println("A " + palavra + " foi removida");
	}
	public void exibirPalavras() {
		if(!this.lista_Map.isEmpty()) {
			 for (Map.Entry<String, String> palavraEDefinicao : this.lista_Map.entrySet()) {
				System.out.println("Palavra " + palavraEDefinicao.getKey()+ " E sua definicao é "+ palavraEDefinicao.getValue());
				
			}
		}
	}
	public void pesquisarPorPalavra(String palavra) {
		if(!this.lista_Map.isEmpty()) {
			for(Map.Entry<String, String> p: this.lista_Map.entrySet()) {
				if(p.getKey().equalsIgnoreCase(palavra)) {
					System.out.println("Palavra " + p.getKey() + " sua definição é "+p.getValue());
				}
				
			}
		}
	}
	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		dicionario.adicionarPalavra("Epifania", "Manifestação de uma divindade ou súbita percepção da essência ou significado de algo.");
		dicionario.adicionarPalavra("Inócuo", "Que não causa dano ou prejuízo; inofensivo.");
		dicionario.adicionarPalavra("Melancolia", "Estado de tristeza profunda, muitas vezes sem uma razão aparente.");
		dicionario.adicionarPalavra("Pletora", "Grande quantidade ou excesso de algo.");
		dicionario.adicionarPalavra("Sublime", "De uma beleza ou grandeza excepcional que inspira admiração ou reverência.");


		dicionario.exibirPalavras();
		System.out.println("---------");
		dicionario.removerPalavra("Epifania");
		System.out.println("---------");
		dicionario.exibirPalavras();
		System.out.println("---------");
		dicionario.pesquisarPorPalavra("Sublime");
		
		
	}
}
