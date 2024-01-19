import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class OrdenacaoPessoas {
	
	List<Pessoa> listaPessoas;
	
	public OrdenacaoPessoas() {
		this.listaPessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		listaPessoas.add(new Pessoa(nome, idade, altura));
	}
	public List<Pessoa> ordenarPorIdade(){
		List <Pessoa> ordenarPessoas = new ArrayList<>(listaPessoas);
		Collections.sort(ordenarPessoas);
		return ordenarPessoas;
	}
	public List<Pessoa> ordenarPorAltura(){
		List <Pessoa> ordenarPessoas = new ArrayList<>(listaPessoas);
		Collections.sort(ordenarPessoas, new Pessoa.OrdenarAltura());
		return ordenarPessoas;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
