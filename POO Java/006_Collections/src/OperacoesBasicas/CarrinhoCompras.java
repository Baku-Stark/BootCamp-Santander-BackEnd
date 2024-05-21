package OperacoesBasicas;
import java.util.*;

public class CarrinhoCompras {
	List<Item> items; 
	
	public CarrinhoCompras() {
		 this.items = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quant) {
		items.add(new Item(nome, preco, quant));
		System.out.println("== Item adicionado com sucesso! ==" + "{ " + nome + " }");
	}
	
	public void exibirItems() {
		if(!items.isEmpty()) {
			for(Item item : items) {
				System.out.println(item);
			}
		}
		
		else {
			System.out.println("A lista está vazia...");
		}
	}
	
	public void removerItem(String nome) {
		List<Item> itemsParaRemover = new ArrayList<Item>();
		
		if(!items.isEmpty()) {
			for(Item item : items) {
				if(item.getNome().equalsIgnoreCase(nome)) {
					itemsParaRemover.add(item);
				}
			}
			
			items.removeAll(itemsParaRemover);
			System.out.println("== Item removido do carrinho! ==" + "{ " + nome + " }");
		}
		
		else {
			System.out.println("A lista está vazia...");
		}
	}
	
	public double exibirPrecoTotal() {
		double preco_total = 0;
		
		if(!items.isEmpty()) {
			for(Item item : items) {
				preco_total += item.getPreco() * item.getQuant();
			}
		}
		
		else {
			System.out.println("A lista está vazia...");
		}
		
		return preco_total;
	}
	
	public Integer size() {
		int quant_total = 0;
		
		if(!items.isEmpty()) {
			for(Item item : items) {
				quant_total += item.getQuant();
			}
		}
		
		else {
			System.out.println("A lista está vazia...");
		}
		
		return quant_total;
	}
}


class Item {
		private String nome;
		private double preco;
		private int quant;

		public Item(String nome, double preco, int quant) {
			this.nome = nome;
			this.preco = preco;
			this.quant = quant;
		}

		public String getNome() {
			return nome;
		}

		public double getPreco() {
			return preco;
		}

		public int getQuant() {
			return quant;
		}

		@Override
		public String toString() {
			return "Item{" + "nome='" + nome + '\'' + ", preco=" + preco + ", quant=" + quant + '}';
		}
	}