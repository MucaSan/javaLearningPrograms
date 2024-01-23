import java.util.*;

public class GerenciadorAlunos {
	public class Aluno{
		private String nome;
		private int matricula;
		private double media;
		
		public Aluno (String nome, int matricula, double media) {
			this.nome = nome;
			this.matricula = matricula;
			this.media = media;
		}
		
		public String getNome() {
			return nome;
		}
		public int getMatricula() {
			return matricula;
		}
		public double getMedia() {
			return media;
		}
		public boolean equals(Object o) {
			if (this == o) return true;
			if (!(o instanceof Aluno a)) return false;
			return Objects.equals(a.getNome(), getNome()) && Objects.equals(getMatricula(), a.getMatricula());
		}
		public int hashCode() {
			return Objects.hash(getNome(), getMatricula());
		}
		
	}
	Set <Aluno> conjuntoAluno = new HashSet<>();
	
	public void adicionarAluno(String nome, int matricula, double media) {
		conjuntoAluno.add(new Aluno(nome,matricula, media));
	}
	public void removerAluno(int matricula) {
		for (Aluno e : conjuntoAluno) {
			if (e.getMatricula() == matricula) {
				conjuntoAluno.remove(e);
			}
		}
	}
	public void exibeAlunosPorNome() {
		List<Aluno> ordernarPorNome = new ArrayList<>(conjuntoAluno);
		Collections.sort(ordernarPorNome, new CompararPorNome());
		System.out.println(ordernarPorNome);
	}
	public void exibeAlunosPorMedia() {
		List<Aluno> ordernarPorMedia = new ArrayList<>(conjuntoAluno);
		Collections.sort(ordernarPorMedia, new CompararPorNota());
		System.out.println(ordernarPorMedia);
	}
	public class CompararPorNome implements Comparator<Aluno>{
		@Override
		public int compare(Aluno o1, Aluno o2) {
			// TODO Auto-generated method stub
			return o1.getNome().compareTo(o2.getNome());
		}
	}
	public class ComparePorNota implements Comparator<Aluno>{
		public int compare(Aluno o1, Aluno o2) {
			return Double.compare(o1.getMedia(), o2.getMedia());
		}
	}
}

