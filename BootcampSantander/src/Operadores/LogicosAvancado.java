package Operadores;

public class LogicosAvancado {
	
	public static void main(String[] args) {
		
		/*
		 * Nós acabamos de aprender que existem os operadores lógicos & (E) e || (OU), mas por quê no exemplo acima, foram ilustradas as condições:
		 * 
		 * if (condicao1 && condicao2) e if(condicao1 || condicao2) ?
		 * 
		 * A duplicidade nos operadores lógicos é um recurso conhecido como Operador Abreviado,
		 *  isso quer que se a condição1 atender aos critérios não será necessário validar a condição2.
		 * 
		 */
		
		int numero1 = 1;
		int numero2 = 1;

		if(numero1== 2 & numero2 ++ == 2 )
		    System.out.println("As 2 condições são verdadeiras");

		System.out.println("O numero 1 agora é " + numero1);
		System.out.println("O numero 2 agora é " + numero2);
		
		// O mesmo acontece com o operador | e || considerando que operador agora representa que, se uma das alternativas for verdadeira, a outra nem precisa ser avaliada.
		
	}

}
