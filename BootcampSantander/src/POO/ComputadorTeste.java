package POO;

public class ComputadorTeste {
	
	public static void main(String[] args) {
		
		/*
		 * Polimorfismo: São as inúmeras maneiras de se realizar uma mesma ação.
		 * 
		 * Exemplo: SistemaMensagemInstantanea determina quatro ações como verificar se está conectado a internet, enviar e receber mensagens e salvar o histórico,
		 * primeiramente, precisamos identificar se estaremos nos referindo a MSN Messenger, Facebook Menseger ou Telegram,
		 * para determinar a lógica de enviar e receber mensagens dos respectivos serviços de menssagem.
		 * 
		 */
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="msn"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
		
	}

}
