package Collections.List.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class ListaItem {
	
	private List<Item> itemLista;
	
	public ListaItem() {
		this.itemLista = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		this.itemLista.add(item);
	}
	
	public void removerItem(String nome) {
	    List<Item> itensParaRemover = new ArrayList<>();
	    for (Item i : itemLista) {
	        if (i.getNome().equalsIgnoreCase(nome)) {
	          itensParaRemover.add(i);
	        	}
	    	}
	      itemLista.removeAll(itensParaRemover);
	    }
	
	public double calcularValorTotal() {
	    double valorTotal = 0d;
	    if (!itemLista.isEmpty()) {
	      for (Item item : itemLista) {
	        double valorItem = item.getPreco() * item.getQuantidade();
	        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
	      }
	      return valorTotal;
	    } else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	  }
	
	
	public void exibirItens() {
		System.out.println(itemLista);
	}
	

}
