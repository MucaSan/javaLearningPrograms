import java.util.ArrayList;
import java.util.List;


public class CarrinhoCompras {

	List <Item> carrinhoCompras = new ArrayList<>(); 
	
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		this.carrinhoCompras.add(new Item(nome,preco,quantidade));
	}
	public void removerItem(String nome) {
		List <Item> removerCarrinhoItems = new ArrayList<>();
		
		for(Item e : this.carrinhoCompras) {
			if (e.getNome().equals(nome)) {
				removerCarrinhoItems.add(e);
			}
		}
		this.carrinhoCompras.removeAll(removerCarrinhoItems);
	
	}
	public double calcularValorTotal() {
		double valorTotal = 0;
		for (Item e : this.carrinhoCompras) {
			valorTotal += e.getPreco() * e.getQuantidade();
		}
		return valorTotal;
	}
	public void exibirItems() {
		for (Item e : this.carrinhoCompras) {
			System.out.println("Produto - " + e.getNome() );
			System.out.println("Quantidade comprada - " + e.getQuantidade());
			System.out.println("Preço unidade - " + e.getPreco());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarrinhoCompras carrinho = new CarrinhoCompras();
		carrinho.adicionarItem("Nome1", 8, 3);
		carrinho.adicionarItem("Nome2", 21, 3);
		carrinho.adicionarItem("Nome3", 11, 9);
		System.out.println("O total e: "+carrinho.calcularValorTotal());
		carrinho.exibirItems();
		carrinho.removerItem("Nome1");
		carrinho.exibirItems();
	}

}
