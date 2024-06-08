package StreamAPI;

public class OperacoesIntermediarias {
	
	/*
	 * .Operações Intermediárias: são aquelas que retornam uma nova Stream e permitem encadear várias operações, formando um pipeline de processamento de dados. São elas:
	 * 
	 * .filter(Predicate<T> predicate): Filtra os elementos da Stream com base em um predicado e retorna uma nova Stream contendo apenas os elementos que atendem ao critério do predicado.
	 * Exemplo:  stream.filter(n -> n > 5)
	 * 
	 * .map(Function<T, R> mapper): Transforma cada elemento da Stream usando a função especificada e retorna uma nova Stream contendo os elementos resultantes.
	 * Exemplo: stream.map(s -> s.toUpperCase())
	 * 
	 * .sorted(): Classifica os elementos da Stream em ordem natural (se os elementos forem comparáveis) ou de acordo com um comparador fornecido.
	 * Exemplo: stream.sorted()
	 * 
	 * .distinct(): Remove elementos duplicados da Stream, considerando a implementação do método equals() para comparação.
	 * Exemplo: stream.distinct()
	 * 
	 * .limit(long maxSize): Limita o número de elementos da Stream aos maxSize primeiros elementos Exemplo:
	 * stream.limit(10)
	 * 
	 * .skip(long n): Pula os primeiros n elementos da Stream e retorna uma nova Stream sem eles.
	 * Exemplo: stream.skip(5)
	 * 
	 */

}
