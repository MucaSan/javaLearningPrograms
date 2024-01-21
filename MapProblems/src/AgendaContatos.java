import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {
	private Map<String, Integer> map;
	
	public AgendaContatos() {
		this.map = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer numero) {
		map.put(nome, numero);
	}
	public void removerContato(String nome) {
		map.remove(nome);
	}
	public void exibirContatos() {
		System.out.println(map);
	}
	public Integer pesquisarPorNome(String nome) {
		return map.get(nome);
	}
	
}
