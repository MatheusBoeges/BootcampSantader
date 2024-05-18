package Exercicios.ControleDeFluxo;

import java.util.Random;

public class EntrandoEmContato {
	
	public static void main(String[] args) {
		
		/*
		 * O RH deverá realizar uma ligação com no máximo 3 tentativas para cada candidato selecioando e caso o candidato atenda, deve - se imprimir:
		 * 
		 * . Conseguimos entrar em contato com o [candidato] após [tentativa]] tentativa(s)
		 * 
		 * . Caso ao contrário imprima: Não conseguimos entrar em contato com o [candidato]
		 * 
		 */
		
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
		
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
			
		}
				
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("Contato realizado com sucesso.");
			
		}while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("Conseguimos entrar em contato com o " + candidato + " na " + tentativasRealizadas + " tentativas\n" );
		else
			System.out.println("Não conseguimos entrar em contato com o " + candidato + " no número máximo " + tentativasRealizadas + " tentativa\n" );
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}

}
