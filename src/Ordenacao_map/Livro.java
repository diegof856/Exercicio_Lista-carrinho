package Ordenacao_map;

import java.util.Objects;

public class Livro implements Comparable<Livro> {
	private String titulo;
	private String autor;
	private Double preco;

	public Livro(String titulo, String autor, Double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}
	@Override
	public int compareTo(Livro l) {
		
		return this.preco.compareTo(l.getPreco());
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	@Override
	public int hashCode() {
		return Objects.hash(preco);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(preco, other.preco);
	}

	
	
	

}
