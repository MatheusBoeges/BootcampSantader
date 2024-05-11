package EstruturasDeRepeticao;

import java.util.Random;

public class UtilizandoDoWhile {
	
	public static void main(String[] args) {
		
		/*
		 * O laço do / while (na tradução literal para a língua portuguesa “faça…enquanto”), assim como o laço while,
		 * considera que enquanto uma determinada condição for válida o bloco de código será executado. 
		 * Entretanto, do / while testa a condição após executar o código,sendo assim,
		 * mesmo que a condição seja considerada inválida no primeiro teste o bloco será executado pelo menos uma vez.
		 * 
		 */
		
		System.out.println("Discando...");
		
		do {
			
			//excutando repetidas vezes até alguém atender
			
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
		
	}
	
		private static boolean tocando() {
		
			boolean atendeu = new Random().nextInt(3)==1;
		
			System.out.println("Atendeu? " + atendeu);
		
			//negando o ato de continuar tocando
		
			return ! atendeu;
			
		}
		
}		
