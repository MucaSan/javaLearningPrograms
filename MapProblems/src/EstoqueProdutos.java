import java.util.Map;
import java.util.HashMap;
public class EstoqueProdutos {
	public static class Produto{
		private String nome;
		private int quantidade;
		private double preco;
		
		public Produto(String nome, int quantidade, double preco){
			this.nome = nome;
			this.quantidade = quantidade;
			this.preco = preco;
		}
		public String getNome() {
			return this.nome;
		}
		public int getQuantidade() {
			return this.quantidade;
		}
		public double getPreco() {
			return this.preco;
		}
	}
	Map<Long, Produto> estoqueProdutos;
	
	public EstoqueProdutos() {
		this.estoqueProdutos = new HashMap<>();
	}
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutos.put(cod, new Produto(nome, quantidade, preco));
	}
	public void exibirProdutos() {
		System.out.println(estoqueProdutos);
	}
	public double calcularValorTotalEstoque() {
		double total = 0;
		for (Produto e : estoqueProdutos.values()) {
			total +=  (double) e.getQuantidade() * e.getPreco();
		}
		return total;
	}
	public Produto obterProdutoMaisCaro() {
		double precoCaro =  Double.MIN_VALUE;
		Produto produtoCaro = null;
		for(Produto e : estoqueProdutos.values()) {
			if (e.getPreco() > precoCaro) {
				precoCaro = e.getPreco();
				produtoCaro = e;
			}
		}
		return  produtoCaro;
	}
	public Produto obterProdutoMaisBarato() {
		double precoBarato =  Double.MAX_VALUE;
		Produto produtoBarato = null;
		for(Produto e : estoqueProdutos.values()) {
			if (e.getPreco() < precoBarato) {
				precoBarato = e.getPreco();
				produtoBarato = e;
			}
		}
		return  produtoBarato;
	}
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		double maiorQuantidadeValorTotal = Double.MIN_VALUE;
		Produto produtoMaiorQuantideValorTotal = null;
		for (Produto e : estoqueProdutos.values()) {
			double tempQuantidadeValorTotal = e.getPreco() * (double) e.getQuantidade();
			if (tempQuantidadeValorTotal > maiorQuantidadeValorTotal) {
				maiorQuantidadeValorTotal = tempQuantidadeValorTotal;
				produtoMaiorQuantideValorTotal = e;
			}
		}
		return produtoMaiorQuantideValorTotal;
	}
	
}
