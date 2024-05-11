package EstruturasDeRepeticao;

public class UtilizandoContinue {
	
	public static void main(String[] args) {
		
		// Continue, como o nome diz, ele 'continua' o laço. O comando break interrompe o laço, já o continue interrompe somente a iteração atual.
		
		for(int numero = 1; numero <=5; numero ++){
			
			if(numero==3)
				continue;
			
			System.out.println(numero);
			
		}
		
	}

}
