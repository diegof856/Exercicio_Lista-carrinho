package Ordenacao_Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	private Set<Aluno> listaAlunos;

	public GerenciadorAlunos() {
		this.listaAlunos = new HashSet<>();
	}

	public void adicionarAluno(String nome, Long matricula, double media) {
		this.listaAlunos.add(new Aluno(nome, matricula, media));
	}

	public void removerAluno(long matricula) {
		Aluno alunoParaRemover = null;
		for (Aluno a : this.listaAlunos) {
			if (a.getMatricula() == matricula) {
				alunoParaRemover = a;
			}
		}
		this.listaAlunos.remove(alunoParaRemover);
	}

	public void exibirAlunosPorNome() {
		Set<Aluno> listaAlunosNome = new TreeSet<>(this.listaAlunos);
		for (Aluno a : listaAlunosNome) {
			System.out.println(
					"Aluno " + a.getNome() + " Matricula " + a.getMatricula() + " E sua media é de " + a.getNota());
		}
	}

	public void exibirAlunosPorNota() {
		Set<Aluno> listaAlunosNota = new TreeSet<>(new ComparatorSetAluno());
		listaAlunosNota.addAll(this.listaAlunos);
		for (Aluno a : listaAlunosNota) {
			System.out.println(
					"Aluno " + a.getNome() + " Matricula " + a.getMatricula() + " E sua media é de " + a.getNota());
		}
	}

	public void exibirAlunos() {
		for (Aluno a : this.listaAlunos) {
			System.out.println(
					"Aluno " + a.getNome() + " Matricula " + a.getMatricula() + " E sua media é de " + a.getNota());
		}
	}

	public static void main(String[] args) {
		GerenciadorAlunos aluno = new GerenciadorAlunos();
		aluno.adicionarAluno("Diego", 4625L, 6.8);
		aluno.adicionarAluno("Mirella", 4626L, 9.8);
		aluno.adicionarAluno("Isabella", 4624L, 8.8);
		aluno.adicionarAluno("Diego Souza", 4622L, 7.8);
		aluno.adicionarAluno("Barata", 4627L, 7.5);

		aluno.exibirAlunos();
		System.out.println("-------------");
		aluno.exibirAlunosPorNome();
		System.out.println("-------------");
		aluno.exibirAlunosPorNota();
		System.out.println("-------------");
		aluno.removerAluno(4627L);
		aluno.exibirAlunosPorNome();
	}
}
