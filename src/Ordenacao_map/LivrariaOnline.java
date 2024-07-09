package Ordenacao_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LivrariaOnline {
	private Map<String, Livro> lista_Livraria;

	public LivrariaOnline() {
		this.lista_Livraria = new HashMap<>();
	}

	public void adicionarLivro(String isbn, String titulo, String autor, double preco) {
		this.lista_Livraria.put(isbn, new Livro(titulo, autor, preco));
	}

	public void removerLivro(String titulo) {

		if (!this.lista_Livraria.isEmpty()) {
			this.lista_Livraria.remove(titulo);

		} else {
			System.out.println("A lista está vazia");
		}
	}

	public void exibirLivrosOrdenadosPorPreco() {
		Set<Livro> livrosOrdenados = new TreeSet<>(new ComparatorMap());
		livrosOrdenados.addAll(this.lista_Livraria.values());
		String titulo, autor, isbn;
		Double preco;
		for(Livro l : livrosOrdenados) {
			titulo = l.getTitulo();
			autor = l.getAutor();
			isbn = getValorChave(this.lista_Livraria,l);
			preco = l.getPreco();
			System.out.printf("Titulo : %s%nNome do autor: %s%nO seu ISBN é: %s%ne seu preco é de exatamente %.2f%n%n"
					, titulo, autor,isbn,preco);
		}
	}
	private String getValorChave(Map<String, Livro> lista_Livraria2, Livro livro) {
		
		for(Map.Entry<String, Livro> entry : lista_Livraria2.entrySet()) {
			if(entry.getValue().equals(livro)) {
				return entry.getKey();
				
			}
		}
		return null;
	}

	public Set<Livro> pesquisarLivrosPorAutor(String autor){
		Set<Livro> listaLivrosAutor = new TreeSet<>();
		
		if(!this.lista_Livraria.isEmpty()) {
			for(Livro l : this.lista_Livraria.values()) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					listaLivrosAutor.add(l);
				}
			}
		}
		return listaLivrosAutor;
	}
	public Livro obterLivroMaisCaro() {
		double preco = 0.0;
		Livro livroRetonar = null; 
		if(!this.lista_Livraria.isEmpty()) {
			for(Livro l : this.lista_Livraria.values()) {
				if(l.getPreco() > preco) {
					preco = l.getPreco();
					livroRetonar = l;
				}
			}
		}
		return livroRetonar;
	}
	public Livro exibirLivroMaisBarato() {
		double preco = Double.MAX_VALUE;
		Livro livroRetonar = null; 
		if(!this.lista_Livraria.isEmpty()) {
			for(Livro l : this.lista_Livraria.values()) {
				if(l.getPreco() < preco) {
					preco = l.getPreco();
					livroRetonar = l;
				}
			}
		}
		return livroRetonar;
	}
	
	public static void main(String[] args) {
		LivrariaOnline livraria = new LivrariaOnline();
		livraria.adicionarLivro("B08YN21JDC", "Marketplace: Teoria e Prática", "Alexandre Villar", 0.0);
		livraria.adicionarLivro("978-8544101117", "O Mundo de Gelo e Fogo", "George R. R. Martin", 650.0);
		livraria.adicionarLivro("978-8556511546", "O cavaleiro dos Sete Reinos", "George R. R. Martin", 76.20);
		livraria.adicionarLivro("978-6558380542", "A Biblioteca da Meia-Noite", "Matt Haig ", 41.99);
		livraria.adicionarLivro("978-8535938913", "Como enfrentar o ódio: A internet e a luta pela democracia", "Felipe Neto", 69.90);
		livraria.adicionarLivro("978-8556510785", "As Crônicas de Gelo e Fogo, volume 1", "George R. R. Martin", 72.10);
		livraria.adicionarLivro("978-8556510792", "A fúria dos reis: As Crônicas de Gelo e Fogo, volume 2", "George R. R. Martin", 68.94);
		
		livraria.exibirLivrosOrdenadosPorPreco();
		livraria.removerLivro("A Biblioteca da Meia-Noite");
		System.out.println("-----------");
		livraria.exibirLivrosOrdenadosPorPreco();
		System.out.println("-----------");
		System.out.println("Lista de livro deste mesmo autor: ");
		for(Livro l : livraria.pesquisarLivrosPorAutor("George R. R. Martin")) {
		System.out.println("Titulo: "+ l.getTitulo()+" O seu preço é de: "+ l.getPreco());
		}
		System.out.println("-----------");
		System.out.println("O livro mais caro é "+livraria.obterLivroMaisCaro().getTitulo()
				+ " e seu preco é de: "+livraria.obterLivroMaisCaro().getPreco()
				+ " e seu autor é : "+ livraria.obterLivroMaisCaro().getAutor());
		
		System.out.println("O livro mais barato é "+livraria.exibirLivroMaisBarato().getTitulo()
				+ " e seu preco é de: "+livraria.exibirLivroMaisBarato().getPreco()
				+ " e seu autor é : "+ livraria.exibirLivroMaisBarato().getAutor());
	}
}
