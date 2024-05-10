package ControleDeFluxo;

public class CondicaoTernaria {
	
	public static void main(String[] args) {
		
		/*
		 * Como vimos em operadores, podemos abreviar nosso algorítmico condicional refatorando com o conceito de operador ternário.
		 * Vamos refatorar os exemplos acima para ilustrar o poder deste recurso:
		 * 
		 */
		
		int nota = 7;
		
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		
		System.out.println(resultado);
		
	}

}
