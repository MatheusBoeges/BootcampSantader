package Collections.List.OrdenacaoPessoa;

public class TesteOrdencao {
	
	public static void main(String[] args) {
		
		OrdencaoPessoas ordenacaoPessoas = new OrdencaoPessoas();
		
		 ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
		 ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
		 ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
		 ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

		 System.out.println(ordenacaoPessoas.pessoasList);

		 System.out.println(ordenacaoPessoas.ordenarPorIdade());

		 System.out.println(ordenacaoPessoas.ordenarPorAltura());
		
	}

}
