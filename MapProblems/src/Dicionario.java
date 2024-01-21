import java.util.HashMap;
import java.util.Map;
public class Dicionario {
	private Map<String, String> dicionario;
	
	public Dicionario(){
		this.dicionario = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionario.put(palavra, definicao);
	}
	public void removerPalavra(String palavra) {
		dicionario.remove(palavra);
	}
	public void exibirPalavras() {
		System.out.println(dicionario);
	}
	public String pesquisaPorPalavra(String palavra) {
		return dicionario.get(palavra);
	}
}
