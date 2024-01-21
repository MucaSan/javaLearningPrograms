import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
	public class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>>{
		public int compare(Map.Entry<String, Livro> e1, Map.Entry<String, Livro> e2) {
			return Double.compare(e1.getValue().getPreco(), e2.getValue().getPreco());
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
		List<Map.Entry<String, Livro>> entryList = new ArrayList<>(livraria.entrySet());
		Collections.sort(entryList, new ComparatorPorPreco());
		Map<String, Livro> livroOrdenadoPorPreco = new LinkedHashMap<>();
		for (Map.Entry<String, Livro> entry : entryList) {
			livroOrdenadoPorPreco.put(entry.getKey(), entry.getValue());
		}
		System.out.println(livroOrdenadoPorPreco);
	}
	public List<Livro> pesquisarLivrosPorAutor(String autor){
		List<Livro> livroAutor = new ArrayList<>();
		
		for (Livro e : livraria.values()) {
			if (e.getAutor() == autor) {
				livroAutor.add(e);
			}
		}
		return livroAutor;
	}
	public Livro obterLivroMaisCaro() {
		List<Map.Entry<String, Livro>> entryList = new ArrayList<>(livraria.entrySet());
		Collections.sort(entryList, new ComparatorPorPreco());
		Collections.reverse(entryList);
		return entryList.get(0).getValue();
		
	}
	public Livro obterLivroMaisBarato() {
		List<Map.Entry<String, Livro>> entryList = new ArrayList<>(livraria.entrySet());
		Collections.sort(entryList, new ComparatorPorPreco());
		return entryList.get(0).getValue();
	}
}
