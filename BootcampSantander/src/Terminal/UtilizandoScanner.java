package Terminal;

import java.util.Locale;
import java.util.Scanner;

public class UtilizandoScanner {
	
	public static void main(String[] args) {
		
		// A classe Scanner permite que o usuário tenha uma interação mais assertiva com o nosso programa, veja como vamos mudar o nosso programa AboutMe para deixar mais intuitivo aos usuários.
		
		
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //criando o objeto scanner
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        
        //imprimindo os dados obtidos pelo usuario
        
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
		
		scanner.close();
		
	}

}
