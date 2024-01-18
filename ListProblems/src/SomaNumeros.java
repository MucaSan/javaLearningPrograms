import java.util.List;
import java.util.ArrayList;
public class SomaNumeros {
	private List <Integer> listaNumero = new ArrayList<>();
	
	public void adicionarNumero(int num) {
		listaNumero.add(num);
	}
	public int calcularSoma() {
		int soma = 0;
		for (Integer e : listaNumero) {
			soma += e;
		}
		return soma;
	}
	public int encontrarMaiorNumero() {
		int temp = Integer.MIN_VALUE;
		for (Integer e : listaNumero) {
			if (e >= temp) {
				temp = e;
			}
			else {
				System.out.println("Erro! Você passou um parâmetro errado, não existe um número valido!");
			}
		}
		return temp;
	}
	public int encontrarMenorNumero() {
		int temp = Integer.MAX_VALUE;
		for (Integer e : listaNumero) {
			if (e <= temp) {
				temp = e;
			}
			else {
				System.out.println("Erro! Você passou um parâmetro errado, não existe um número valido!");
			}
		}
		return temp;
	}
	public void exibirNumero() {
		System.out.println(listaNumero);
	}
	
	public void main (String args[]) {
		SomaNumeros numeros = new SomaNumeros();
		numeros.adicionarNumero(1);
		numeros.adicionarNumero(20);
		numeros.adicionarNumero(32);
		numeros.adicionarNumero(64);
		numeros.adicionarNumero(128);
		numeros.adicionarNumero(130);
		System.out.println(numeros.encontrarMaiorNumero());
		
	}
}

