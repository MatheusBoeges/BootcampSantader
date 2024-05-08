package Operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		/*
		 * O operador aritmético é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.
		 * 
		 * Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).
		 * 
		 */
		
		double soma = 10.5 + 15.7;
		int subtração = 113 - 25;
		int multiplicacao = 20 * 7;
		int divisao = 15 / 3;
		int modulo = 18 % 3;
		double resultado = (10 * 7) + (20/4);
		
		System.out.println(soma);
		System.out.println(subtração);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		System.out.println(modulo);
		System.out.println(resultado + "\n");
		
		// ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.
		
		String nomeCompleto = "LINGUAGEM" + "JAVA";
		
		System.out.println(nomeCompleto + "\n");
		
		//qual o resultado das expressoes abaixo?
		
		String concatenacao ="?"; 

		concatenacao = 1+1+1+"1";

		System.out.println(concatenacao + "\n");
		
		concatenacao = 1+"1"+1+1;
		
		System.out.println(concatenacao + "\n");

		concatenacao = 1+"1"+1+"1";
		
		System.out.println(concatenacao + "\n");

		concatenacao = "1"+1+1+1;

		System.out.println(concatenacao + "\n");
		
		concatenacao = "1"+(1+1+1);
		
		System.out.println(concatenacao + "\n");
		
	}

}
