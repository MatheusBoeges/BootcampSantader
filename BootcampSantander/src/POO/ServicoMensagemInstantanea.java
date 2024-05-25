package POO;

/*
 * Programação orientada a objetos (POO, ou OOP segundo as suas siglas em inglês), é um paradigma de programação baseado no conceito de "objetos",
 * que podem conter dados na forma de campos, também conhecidos como atributos e códigos, na forma de procedimentos, também conhecidos como métodos.
 * 
 */

public class ServicoMensagemInstantanea {
	
	/*
	 * Encapsulamento: Nem tudo precisa estar visível, grande parte do nosso algoritmo pode ser distribuído em métodos,
	 * com finalidades específicas que complementam uma ação em nossa aplicação.
	 * 
	 * Exemplo: Enviar uma mensagem, exige muitas etapas para o sistema, mas o usuário só visualiza enviar e a "magia" acontece.
	 * 
	 */
	
	
	// Metodo Encapsulado:
	public void enviarMensagem() {
		//primeiro confirmar se esta conectado a internet
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		//depois de enviada, salva o histórico da mensagem
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	//métodos privadas, visíveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}

}
