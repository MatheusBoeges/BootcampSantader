package POO.Lanchonete.atendimento.cozinha;

public class Almoxarife {
	
	/*
	 * Modificador default
	 * 
	 * O modificador default, está fortemente associado a organização das classes por pacotes, algumas implementações,
	 * não precisam estar disponíveis por todo o projeto, e este modificador de acesso, restringe a visibilidade por pacotes.
	 * 
	 */
	
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	
	// Para definir um método visível a nível de pacote, basta NÃO declarar nenhum modificador, exemplo:
	
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
	}
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}

}
