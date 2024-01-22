import java.util.*;
public class AgendaContatos {
	
	public class Contato{
		private String nome;
		private int numero;
		
		
		public Contato(String nome, int numero){
			this.nome = nome;
			this.numero = numero;
		}
		
		public String getNome() {
			return nome;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public boolean equals(Object o) {
			if (this == o) return true;
			if (!(o instanceof Contato contato)) return false;
			return Objects.equals(getNumero(), contato.getNumero());
		}
		public int hashCode() {
			return Objects.hash(getNumero());
		}
		
	}
	Set <Contato> conjuntoContato = new HashSet<>();
	public void exibirContatos() {
		for(Contato e : conjuntoContato) {
			System.out.println(e.getNome() + "  "  + e.getNumero());
		}
	}
	public void adicionarContato(String nome, int numero) {
		conjuntoContato.add(new Contato(nome, numero));
		
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set <Contato> pesquisadoNome = new HashSet<>();
		
		for (Contato e : conjuntoContato) {
			if (e.getNome() == nome) {
				pesquisadoNome.add(e);
			}
		}
		return pesquisadoNome;
	}
	public void atualizarNumeroContato(String nome, int novoNumero) {
		for (Contato e : conjuntoContato) {
			if (e.getNome().equals(nome)) {
				e.setNumero(novoNumero);
				break;
			}
		}
	}

}
