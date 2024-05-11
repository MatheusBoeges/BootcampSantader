package EstruturasDeRepeticao;

public class UtilizandoForEach {
	
	public static void main(String[] args) {
		
		// O uso do for / each está fortemente relacionado com um cenário onde contenha um array ou coleção, e assim, a interação é baseada aos elementos da coleção.
		
		String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
		
        //Forma abreviada
		
		for(String aluno : alunos) {
			
			System.out.println("Nome do aluno é : " + aluno);
		
		}
		
	}

}
