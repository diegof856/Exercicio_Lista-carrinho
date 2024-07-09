package Perquisa_Set;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	private Set<Tarefa> listaTarefasSet;

	public ListaTarefas() {
		this.listaTarefasSet = new HashSet<>();
	}

	public void adicionarTarefa(Tarefa tarefa) {
		this.listaTarefasSet.add(tarefa);
	}

	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		for (Tarefa t : this.listaTarefasSet) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover = t;
			}
		}
		this.listaTarefasSet.remove(tarefaParaRemover);
	}

	public void exibirTarefas() {
		for (Tarefa t : this.listaTarefasSet) {
			if (t.isTarefaConcluida()) {
				System.out.println("Descrição da tarefa " + t.getDescricao() + " e status desta é concluida");
			} else {
				System.out.println("Descrição da tarefa " + t.getDescricao() + " e status desta é pendente");
			}

		}
	}

	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for (Tarefa t : this.listaTarefasSet) {
			if (t.isTarefaConcluida()) {
				tarefasConcluidas.add(t);
			}
		}
		return tarefasConcluidas;
	}

	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for (Tarefa t : this.listaTarefasSet) {
			if (!t.isTarefaConcluida()) {
				tarefasConcluidas.add(t);
			}
		}
		return tarefasConcluidas;
	}

	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa t : this.listaTarefasSet) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setTarefaConcluida(true);
			}
		}
	}

	public void marcarTarefaPendente(String descricao) {
		for (Tarefa t : this.listaTarefasSet) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setTarefaConcluida(false);
			}
		}
	}

	public void limparListaTarefas() {
		this.listaTarefasSet.clear();
	}

	public static void main(String[] args) {
		ListaTarefas lista = new ListaTarefas();
		lista.adicionarTarefa(new Tarefa("Lavar roupa", false));
		lista.adicionarTarefa(new Tarefa("Lavar Louça", true));
		lista.adicionarTarefa(new Tarefa("Jogar Football manager", false));
		lista.adicionarTarefa(new Tarefa("Ir a academia", false));
		lista.adicionarTarefa(new Tarefa("Comprar Whey", true));

		lista.exibirTarefas();

		lista.removerTarefa("Comprar Whey");
		lista.exibirTarefas();

		System.out.println("Concluidas");
		exibirTarefasConcluidas(lista.obterTarefasConcluidas());
		System.out.println("--------------");
		System.out.println("Pendentes");
		exibirTarefasPendentes(lista.obterTarefasPendentes());

		lista.marcarTarefaConcluida("Lavar roupa");
		System.out.println("Concluidas");
		exibirTarefasConcluidas(lista.obterTarefasConcluidas());
		System.out.println("--------------");
		System.out.println("Pendentes");
		exibirTarefasPendentes(lista.obterTarefasPendentes());
		lista.marcarTarefaPendente("Lavar Louça");
		System.out.println("Concluidas");
		exibirTarefasConcluidas(lista.obterTarefasConcluidas());
		System.out.println("--------------");
		System.out.println("Pendentes");
		exibirTarefasPendentes(lista.obterTarefasPendentes());
		lista.limparListaTarefas();
		lista.exibirTarefas();

	}

	public static void exibirTarefasConcluidas(Set<Tarefa> listaDeTarefasConcluidas) {
		for (Tarefa t : listaDeTarefasConcluidas) {
			System.out.println(t.getDescricao());
		}
	}

	public static void exibirTarefasPendentes(Set<Tarefa> listaDeTarefasPendentes) {
		for (Tarefa t : listaDeTarefasPendentes) {
			System.out.println(t.getDescricao());
		}
	}
}
