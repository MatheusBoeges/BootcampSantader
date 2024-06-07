package StreamAPI.Optional;

import java.util.Optional;

public class OrElseGetExemplo {
	
	/*
	 * .orElseGet(supplier): Obtém o valor contido no Optional, ou retorna um valor fornecido por um Supplier se o Optional estiver vazio. 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Optional<String> optionalValue = Optional.ofNullable(null);
		String result = optionalValue.orElseGet(() -> "Value from Supplier");
		System.out.println(result);
		
	}

}
