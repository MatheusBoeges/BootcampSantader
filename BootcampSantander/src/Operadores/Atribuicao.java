package Operadores;

import java.util.Date;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		/*
		 * Representado pelo símbolo de igualdade =.
		 * 
		 * O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável.
		 * em Java definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição.
		 * 
		 * Exemplos abaixo:
		 * 
		 */
		
		String nome = "Matheus";
		int idade = 25;
		double peso = 87.0;
		char sexo = 'M';
		boolean doadorOrgao = true;
		Date dataNascimento = new Date();
		
		System.out.println("Meu nome é " + nome + " tenho " + idade + " anos." + "\nO meu peso é " + peso + " Kg" + " sou do sexo " + sexo + "." 
				+ "\nEu sou doador de orgão " + doadorOrgao + " eu nasci no dia " + dataNascimento);
	}

}
