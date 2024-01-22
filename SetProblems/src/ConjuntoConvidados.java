import java.util.*;
public class ConjuntoConvidados {
	private Set<Convidado> conjuntoConvidado;
	
	public ConjuntoConvidados() {
		this.conjuntoConvidado = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		conjuntoConvidado.add(new Convidado(nome, codigoConvite));
	}
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		for (Convidado e : conjuntoConvidado) {
			if (e.getCodigoConvite() == codigoConvite) {
				conjuntoConvidado.remove(e);
			}
		}
	}
	public int contarConvidados() {
		return conjuntoConvidado.size();
	}
	public void exibirConvidados() {
		System.out.println(conjuntoConvidado);
	}
	
}
