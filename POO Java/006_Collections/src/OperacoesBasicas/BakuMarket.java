package OperacoesBasicas;

public class BakuMarket {
	public static void main(String[] args) {
		CarrinhoCompras carrinho = new CarrinhoCompras();
		
		System.out.println("BEM-VINDO AO BAKU-MARKET!!\n");
		
		carrinho.adicionarItem("Celular Samsung", 1050.50, 1);
		carrinho.adicionarItem("Bateria de celular", 50, 5);
		carrinho.adicionarItem("Fones de ouvido", 100, 2);
		carrinho.adicionarItem("Placa de Vídeo", 5000, 1);
		
		carrinho.removerItem("Placa de Vídeo");
		
		carrinho.exibirItems();
		System.out.println("====================================================");
		System.out.println("Valor Total: R$" + carrinho.exibirPrecoTotal() + " | Quantidade de Items: " + carrinho.size());
	}
}
