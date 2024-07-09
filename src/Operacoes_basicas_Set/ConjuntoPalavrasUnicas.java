package Operacoes_basicas_Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<String> conjuntoDePalavrasUnicas;

	public ConjuntoPalavrasUnicas() {
		this.conjuntoDePalavrasUnicas = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		this.conjuntoDePalavrasUnicas.add(palavra);
	}

	public void removerPalavra(String palavra) {
		String palavraParaRemover = null;
		for (String p : this.conjuntoDePalavrasUnicas) {
			if (p.equalsIgnoreCase(palavra)) {
				palavraParaRemover = p;
			}
		}
		this.conjuntoDePalavrasUnicas.remove(palavraParaRemover);
	}

	public void verificarPalavra(String palavra) {

		if (this.conjuntoDePalavrasUnicas.contains(palavra)) {
			System.out.println("A palavra " + palavra + " está presente no conjunto");
		} else {
			System.out.println("A palavra " + palavra + " não está presente no conjunto");
		}
	}

	public void exibirPalavrasUnicas() {
		for (String p : this.conjuntoDePalavrasUnicas) {
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
		palavrasUnicas.adicionarPalavra("Sport");
		palavrasUnicas.adicionarPalavra("Lua");
		palavrasUnicas.adicionarPalavra("Nome");
		palavrasUnicas.adicionarPalavra("Governador");
		palavrasUnicas.adicionarPalavra("Prefeiro");
		palavrasUnicas.adicionarPalavra("Vereador");
		
		palavrasUnicas.exibirPalavrasUnicas();
		System.out.println("------------");
		palavrasUnicas.removerPalavra("Prefeiro");
		palavrasUnicas.exibirPalavrasUnicas();
		System.out.println("------------");
		palavrasUnicas.verificarPalavra("Verador");
		palavrasUnicas.verificarPalavra("Vereador");
	}
}
