package EstruturasDeRepeticao;

public class For3 {
	
	public static void main(String[] args) {
		
		// Também usamos o controle de fluxo for para interagir sobre arrays e coleções:
		
		String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

		for (int x=0; x<alunos.length; x++) {
			
			System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
		
		}
		
		// Observe que como os arrays começam com indice igual a 0 (zero), iniciamos a nossa variável x também com valor zero e validamos a quantidade de repetições a partir da quantidade de elementos do array.
	
	}

}
