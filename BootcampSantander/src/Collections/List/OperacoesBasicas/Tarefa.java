package Collections.List.OperacoesBasicas;

public class Tarefa {
	
	private String descricao;
	
	public Tarefa(String decscricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}
	
}
