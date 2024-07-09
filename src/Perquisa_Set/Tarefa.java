package Perquisa_Set;

import java.util.Objects;

public class Tarefa {

	private String descricao;
	private boolean tarefaConcluida;

	public Tarefa(String descricao, boolean tarefaConcluida) {

		this.descricao = descricao;
		this.tarefaConcluida = tarefaConcluida;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isTarefaConcluida() {
		return tarefaConcluida;
	}

	public void setTarefaConcluida(boolean tarefaConcluida) {
		this.tarefaConcluida = tarefaConcluida;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}

}
