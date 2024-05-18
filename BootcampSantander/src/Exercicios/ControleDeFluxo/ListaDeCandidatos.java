package Exercicios.ControleDeFluxo;

public class ListaDeCandidatos {
	
	public static void main(String[] args) {
		
		// Agora é hora de imprimir a lista dos candidatos selecionados para disponibilizar para o RH entrar em contato.
		
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
		
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi : " + candidato);
		}
	}

}
