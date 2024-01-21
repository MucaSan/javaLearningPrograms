import java.util.Map;
import java.util.HashMap;


public class ContagemPalavras {
	private Map<String, Integer> relacaoPalavras;
	
	public ContagemPalavras(){
		this.relacaoPalavras = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, int count) {
		relacaoPalavras.put(palavra, count);
	}
	public void removerPalavra(String palavra) {
		relacaoPalavras.remove(palavra);
	}
	public void exibirContagemPalavras() {
		for(Map.Entry<String,Integer> entry : relacaoPalavras.entrySet()) {
			System.out.println("A palavra " + entry.getKey() + "tem " + entry.getValue() + "aparicoes");
		}
	}
	public String encontrarPalavraMaisFrequente() {
		String palavraMaisFrequente = null;
		int contMaisFrequente = Integer.MIN_VALUE;
		for(Map.Entry<String,Integer> entry : relacaoPalavras.entrySet()) {
			if (entry.getValue() > contMaisFrequente) {
				contMaisFrequente = entry.getValue();
				palavraMaisFrequente = entry.getKey();
			}
		}
		return palavraMaisFrequente;
	}
}
