package Pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaNumeros {
	private List<Integer> listaNumeros;

	public SomaNumeros() {
		this.listaNumeros = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		this.listaNumeros.add(numero);
	}

	public Integer calcularSoma() {
		int soma = 0;
		for (Integer n : listaNumeros) {
			soma += n;
		}
		return soma;
	}
	public Integer encontrarMaiorNumero() {
		int maiorNumero = listaNumeros.get(0);
		for(int i = 1; i < listaNumeros.size(); i++) {
			if(listaNumeros.get(i) > maiorNumero) {
				maiorNumero = listaNumeros.get(i);
			}
			
		}
	return maiorNumero;
	
		
	}
	public Integer encontrarMenorNumero() {
		int menorNumero = listaNumeros.get(0);
		for(int i = 1; i < listaNumeros.size(); i++) {
			if(listaNumeros.get(i) < menorNumero) {
				menorNumero = listaNumeros.get(i);
			}
			
		}
	return menorNumero;
	
		
	}
	public List<Integer> exibirNumeros() {

		return listaNumeros;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SomaNumeros soma = new SomaNumeros();
		System.out.print("Digite os numeros para a lista: ");
		int n1 = sc.nextInt();
		soma.adicionarNumero(n1);
		boolean parar = true;
		while(parar) {
			
				System.out.print("Digite outro numero: ");
				n1 = sc.nextInt();
				soma.adicionarNumero(n1);
				if(soma.listaNumeros.size() >= 2) {
					System.out.println("Deseja parar(s/n): ");
					char resposta = sc.next().charAt(0);
					if(resposta == 's') {
						parar = false;
					}
				}
			
		}
		System.out.println("Soma de todos os numeros é: " + soma.calcularSoma());
		System.out.println("O maior numero é : " + soma.encontrarMaiorNumero());
		System.out.println("E o menor numero é: "+ soma.encontrarMenorNumero());
		System.out.println("Lista dos numeros: ");
		for(Integer n : soma.exibirNumeros()) {
			System.out.print(n+" ");
		}
		
		sc.close();
	}
}
