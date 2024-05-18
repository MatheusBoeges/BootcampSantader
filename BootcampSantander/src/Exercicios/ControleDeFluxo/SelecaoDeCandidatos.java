package Exercicios.ControleDeFluxo;

import java.util.concurrent.ThreadLocalRandom;

public class SelecaoDeCandidatos {
	
	public static void main(String[] args) {
		
		/*
		 * Foi solicitado que nosso sistema garanta que diante das inúmeras candidaturas sejam selecionados apenas no máximo 5 candidatos,
		 * para entrevista onde o salário pretendido seja menor ou igual ao salário base.
		 * 
		 */
		
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "jorge"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		
		double salarioBase = 2000;
		double valorPretendido = ThreadLocalRandom.current().nextDouble(1800, 2200);
		
		while(candidatosSelecionados < 5 && candidatosSelecionados < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido;
		
			System.out.println("O candidato " + candidato + " Solicitou este valor de salário: R$" + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga.\n");
				candidatosSelecionados++;
			} else {
				System.out.println("O candidato " + candidato + " não foi selecionado para a vaga.\n");
			}
			candidatosAtual++;
		}
		
	}
	
}
