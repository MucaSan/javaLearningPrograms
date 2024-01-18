import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	List <Livro> catalogoLivros = new ArrayList<>();
	
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		this.catalogoLivros.add(new	Livro(titulo, autor, anoPublicacao));
	}
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> pesquisarLivros = new ArrayList<>();
		for(Livro e: catalogoLivros) {
			if (e.getAutor().equals(autor)) {
				pesquisarLivros.add(e);
			}
		}
		return pesquisarLivros;
	}
	public Livro pesquisarPorTitulo(String titulo){
		for(Livro e: catalogoLivros) {
			if (e.getTitulo().equals(titulo)) {
				return e;
			}
		}
		return new Livro("NÃO HÁ TITULO" , "NÃO HÁ AUTOR", 0);
		
	}
	public List<Livro>	pesquisaPorIntervalo(int anoInicial, int anoFinal) {
		List <Livro> pesquisadoPorIntervalo = new ArrayList<>();
		for (Livro e : catalogoLivros) {
			if (e.getAnoPublicacao() >= anoInicial && e.getAnoPublicacao() <= anoFinal) {
				pesquisadoPorIntervalo.add(e);
			}
		}
		return pesquisadoPorIntervalo;
	}
	
	public static void main(String[] args) {
		

	}

}
