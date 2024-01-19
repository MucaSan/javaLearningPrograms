
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class OrdenacaoNumeros {
	List <Integer> listaNumerica;
	
	
	public OrdenacaoNumeros() {
		this.listaNumerica = new ArrayList<>();
	}
	
	public void adicionarNumero(int num) {
		this.listaNumerica.add(num);
	}
	
	public	void  ordenarAscendente() {
		Collections.sort(listaNumerica);
	}
	
	public void ordenarDescendente() {
		listaNumerica.sort(Collections.reverseOrder());
	}
	
	
}
