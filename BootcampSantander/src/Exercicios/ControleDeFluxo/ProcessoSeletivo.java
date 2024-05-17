package Exercicios.ControleDeFluxo;

import java.util.Scanner;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		
		/*
		 * Imagine que em um processo seletivo existe o valor base salarial de R$2.000,00 e o salário pretendido pelo candidato.
		 * Vamos elaborar um controle de fluxo onde:
		 * 
		 * . Se o valor do salário base for maior que o valor do salário pretendido, imprima: Ligar para o candidato;
		 * 
		 * . Caso contrario se o valor do salário base for igual ao valor do salário pretendido, imprima: Ligar para o candidato com contra proposta;
		 * 
		 * . Senão imprima: Aguardando o resultado dos demais candidatos.
		 * 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		double salarioBase = 2000;
		
		System.out.println("Informe o seu salário pretendido");
		double salarioPretendido = entrada.nextDouble();
		
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		} else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		}else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
		
		entrada.close();
		
	}

}
