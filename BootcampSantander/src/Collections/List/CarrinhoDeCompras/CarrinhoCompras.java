package Collections.List.CarrinhoDeCompras;

public class CarrinhoCompras {
	
	public static void main(String[] args) {
		
		ListaItem carrinhoDeCompras = new ListaItem();
		
		carrinhoDeCompras.adicionarItem("Lápis", 2, 3);
		carrinhoDeCompras.adicionarItem("Borracha", 4, 6);
		carrinhoDeCompras.adicionarItem("Apontador", 3, 4);
		
		carrinhoDeCompras.exibirItens();
		
		carrinhoDeCompras.removerItem("Lápis");
		
		carrinhoDeCompras.exibirItens();
		
		System.out.println("O valor total de compra é R$:" + carrinhoDeCompras.calcularValorTotal());
		
	}

}
