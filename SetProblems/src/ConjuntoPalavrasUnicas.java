import java.util.*;
public class ConjuntoPalavrasUnicas {
	private Set<String> palavras;
	
	public ConjuntoPalavrasUnicas() {
		this.palavras = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavras.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		for (String e : palavras) {
			if (e.equals(palavra)) {
				palavras.remove(e);
			}
		}
	}
	public boolean verificaPalavra(String palavra) {
		for (String e: palavras) {
			if (e.equals(palavra)) {
				return true;
			}
		}
		return false;
	}
	public void exibirPalavrasUnicas() {
		System.out.println(palavras);
	}
	
}
