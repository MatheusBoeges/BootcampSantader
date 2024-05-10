package ControleDeFluxo;

public class CondicaoComposta {
	
	public static void main(String[] args) {
		
		/*
		 * Algumas vezes o nosso programa deverá seguir mais de uma jornada de execução condionado a uma regra de negócio,
		 *  este cenário é demoninado Estrutura Condicional Composta.
		 *  Vejamos o exemplo abaixo:
		 *  
		 */
		
		int nota = 6;
	       
	    if(nota >= 7) {
	    
	    	System.out.println("Aprovado");
	    
	    } else {
	    	
		    System.out.println("Reprovado");

	    }
	    		
		// Vale ressaltar aqui que no Java em uma condição **if/else** as vezes necessitamos adicionar um bloco de **{ }** se a lógica conter mais de uma linha.
		
	}

}
