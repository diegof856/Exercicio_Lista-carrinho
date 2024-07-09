package Ordenacao_Set;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private Long matricula;
	private Double nota;

	public Aluno(String nome, Long matricula, Double nota) {

		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}

	@Override
	public int compareTo(Aluno a) {
		
		return  this.nome.compareToIgnoreCase(a.getNome());
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}

	
	
}
