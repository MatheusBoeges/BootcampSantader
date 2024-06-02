package Collections.List.CatalogoDeLivros;

public class Livro {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public Livro(String livro, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}
	
	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
	}

	
	
}
