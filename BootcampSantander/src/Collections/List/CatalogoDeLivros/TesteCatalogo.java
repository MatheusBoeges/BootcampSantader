package Collections.List.CatalogoDeLivros;

public class TesteCatalogo {
	
	public static void main(String[] args) {
		
		CatalogoLivros catalogosLivros = new CatalogoLivros();
		
		catalogosLivros.adicionarLivro("Livro 1", "Autor 1 ", 2020);
		catalogosLivros.adicionarLivro("Livro 1", "Autor 2 ", 2021);
		catalogosLivros.adicionarLivro("Livro 2", "Autor 2 ", 2022);
		catalogosLivros.adicionarLivro("Livro 3", "Autor 3 ", 2023);
		catalogosLivros.adicionarLivro("Livro 4", "Autor 4 ", 1998);
		
		System.out.println(catalogosLivros.pesquisarPorAutor("Autor 2"));
		System.out.println(catalogosLivros.pesquisarPorIntervaloAnos(2020, 2022));
		System.out.println(catalogosLivros.pesquisarPorTitulo("Livro 1"));
		
	}

}
