package EstruturasDeRepeticao;

public class UtilizandoFor {
	
	public static void main(String[] args) {
		
		/*
		 * O comando for (na tradução literal para a língua portuguesa “para”) permite que uma variável contadora seja testada e incrementada a cada iteração,
		 *  sendo essas informações definidas na chamada do comando.
		 *  O comando for recebe como entrada uma variável contadora, a condição para continuar a execução e o valor de incrementação.
		 *  
		 */
		
		
		// Vamos imaginar que Joãozinho precisa contar até 20 carneirinhos para pegar no sono:
		
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			
			System.out.println(carneirinhos + " - Carneirinho(s)");
		
		}
		
		/*
		 * Vamos explicar a estrutura do código acima:
		 * 
		 * For position
		 * 
		 * 1 - int carneirinhos = 1; -> O programa entende que a variável carneirinhos começa com o valor igual a 1 e isso acontece somente uma vez;
		 * 
		 * 2 - carneirinhos < = 20; -> O programa verifica se a variável carneirinhos ainda é menor que 20;
		 * 
		 * 3 - O programa começa a executar o algorítimo, no nosso caso imprimir a quantidade de carneirinhos em contagem;
		 * 
		 * 4 - carneirinhos ++ -> O programa aumenta em mais 1 o valor da variável carneirinhos;
		 * 
		 * 5 - O fluxo é finalizado quando a variável carneirinhos for igual a 20.
		 * 
		 */
		
	}

}
