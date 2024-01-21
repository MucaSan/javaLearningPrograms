import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class LivrariaOnline {
	
	public static class Livro implements Comparable<Livro>{
		private String titulo;
		private String autor;
		private double preco;
		
		public Livro(String titulo, String autor, double preco) {
			this.titulo = titulo;
			this.autor = autor;
			this.preco = preco;
		}
		public String getTitulo() {
			return this.titulo;
		}
		public String getAutor() {
			return this.autor;
		}
		public double getPreco() {
			return this.preco;
		}
		public int compareTo(Livro e) {
			return Double.compare(this.preco, e.getPreco());
		}
	}
	Map<String, Livro> livraria; 
	public LivrariaOnline() {
		this.livraria = new HashMap<>();
	}
	
	public void adicionarLivro(String link, String titulo, String autor, double preco) {
		livraria.put(link, new Livro(titulo, autor, preco));
	}
	public void removerLivro(String titulo) {
		for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
			if (entry.getValue().getTitulo() == titulo) {
				livraria.remove(entry.getKey());
			}
		}
	}
	public void exibirLivrosOrdenadosPorPreco() {
		List <Livro> ordernarLivros = new ArrayList<>(livraria.values());
		Collections.sort(ordernarLivros);
		List <String> linkOrdenado = new ArrayList<>();
		for(Livro e : ordernarLivros ) {
			
		}
		
	}
}
