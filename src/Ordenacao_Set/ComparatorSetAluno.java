package Ordenacao_Set;

import java.util.Comparator;

public class ComparatorSetAluno implements Comparator<Aluno> {

	@Override
	public int compare(Aluno a1, Aluno a2) {

		return Double.compare(a1.getNota(), a2.getNota());
	}

}
