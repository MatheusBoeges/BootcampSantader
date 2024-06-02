package Collections.List.SomaNumeros;

public class Reusltado {
	
	public static void main(String[] args) {
		
		SomarNumeros somarNumeros = new SomarNumeros();
		
		somarNumeros.adicionarNumero(2);
		somarNumeros.adicionarNumero(3);
		
		System.out.println("Números adicionados: ");
		somarNumeros.exibirNumeros();
		
		System.out.println(somarNumeros.calcularSoma());
		System.out.println(somarNumeros.encontrarMaiorNumero());
		System.out.println(somarNumeros.encontrarMenorNumero());	
		
	}
	
}
