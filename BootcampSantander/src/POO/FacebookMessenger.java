package POO;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	
	/*
	 *  Abstração: É a indisponibilidade, para determinar a lógica de um ou vários comportamentos, em um objeto.
	 *  
	 *  Exemplo: ServicoMensagemInstantanea** ** determina duas ações como enviar e receber mensagens,
	 *  logo, estes comportamentos deverão ser abstratos, pois existem mais de uma maneira de se realizar a mesma operação. 
	 * 
	 */
	
	public void enviarMensagem() {
		//primeiro confirmar se esta conectado a internet
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
		//depois de enviada, salva o histórico da mensagem
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}

}
