package TiposPrimitivos;

public class TiposDeDados {
	
	public static void main(String[] args) {
		
		/*
		 * No Java, existem algumas palavras reservadas para a representação dos tipos de dados básicos que precisam ser manipulados para a construção de programas.
		 * Estes tipos de dados são conhecidos como tipos primitivos (Primitive Types).
		 * 
		 */
		
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		
		// Os tipos primitivos que podem conter partes fracionárias podem ser representados por dois tipos:
		
		float pi = 3.14F;
		double salario = 1275.33;
		
		/*
		 * Apesar de o tipo float ocupar metade da memória consumida do que um tipo double, ele é menos utilizado.
		 * Ele sofre de uma limitação que compromete seu uso em determinadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.
		 * 
		 * Atualmente, com os computadores modernos, se tornou desnecessário utilizar os tipos short e byte,
		 * pois não precisamos nos preocupar tanto assim com o espaço de memória reduzido.
		 * 
		 * Da mesma forma, dificilmente utilizaremos o tipo long, pois não é tão comum trabalharmos com valores tão grandes.
		 * 
		 * Portanto, para representar números, na grande maioria das vezes utilizaremos o tipo int para representar números inteiros ou double para representar números fracionados.
		 * 
		 */
		
	}

}
