package Collections.List.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomarNumeros {
	
	private List<Integer> numeros;

		public SomarNumeros() {
			this.numeros = new ArrayList<>();
		}

	  public void adicionarNumero(int numero) {
	    this.numeros.add(numero);
	  }

	  public int calcularSoma() {
	    int soma = 0;
	    for (Integer numero : numeros)
	      soma += numero;
	    return soma;
	  }

	  public int encontrarMaiorNumero() {
	    int maiorNumero = Integer.MIN_VALUE;
	    if (!numeros.isEmpty()) {
	      for (Integer numero : numeros) {
	        if (numero >= maiorNumero) {
	          maiorNumero = numero;
	        }
	      }
	    }
	    return maiorNumero;
	  }

	  public int encontrarMenorNumero() {
	    int menorNumero = Integer.MAX_VALUE;
	    if (!numeros.isEmpty()) {
	      for (Integer numero : numeros) {
	        if (numero <= menorNumero) {
	          menorNumero = numero;
	        }
	      }
	    }
	    return menorNumero;
	  }

	  public void exibirNumeros() {
	    if (!numeros.isEmpty()) {
	      System.out.println(this.numeros);
	    }
	  }
	
}