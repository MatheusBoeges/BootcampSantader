package Collections.List.OperacoesBasicas;

public class TesteListaTarefa {
	
	public static void main(String[] args) {
		
		ListaTarefa listaTarefa = new ListaTarefa();
		
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumetoTotalDeTarefas());
		
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 1");		
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumetoTotalDeTarefas());
		
		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumetoTotalDeTarefas());
		
		listaTarefa.obterDescricoesTarefas();
		
		
		
	}

}
