package StreamAPI.Optional;

import java.util.Optional;

public class EmptyExemplo {
	
	/*
	 * .empty(): Retorna um Optional vazio (sem valor). 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Optional<String> optionalValue = Optional.empty();
		System.out.println(optionalValue.isPresent());
	
	}

}
