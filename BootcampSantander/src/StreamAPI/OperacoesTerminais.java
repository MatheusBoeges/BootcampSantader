package StreamAPI;

public class OperacoesTerminais {
	
	/*
	 * .Operações Terminais: são aquelas que encerram o pipeline e produzem um resultado final. São elas:
	 * 
	 * .forEach(Consumer<T> action): Executa uma ação para cada elemento da Stream.
	 * Exemplo: stream.forEach(System.out::println)
	 * 
	 * .toArray(): Converte a Stream em um array contendo os elementos da Stream.
	 * Exemplo: stream.toArray()
	 * 
	 * .collect(Collector<T, A, R> collector): Coleta os elementos da Stream em uma estrutura de dados específica, como uma lista ou um mapa.
	 * Exemplo: stream.collect(Collectors.toList())
	 * 
	 * .count(): Retorna o número de elementos na Stream.
	 * Exemplo: stream.count()
	 * 
	 * .anyMatch(Predicate<T> predicate): Verifica se algum elemento da Stream atende ao predicado especificado.
	 * Exemplo: stream.anyMatch(s -> s.startsWith("A"))
	 * 
	 * .allMatch(Predicate<T> predicate): Verifica se todos os elementos da Stream atendem ao predicado especificado.
	 * Exemplo: stream.allMatch(n -> n > 0)
	 * 
	 * .noneMatch(Predicate<T> predicate): Verifica se nenhum elemento da Stream atende ao predicado especificado.
	 * Exemplo: stream.noneMatch(s -> s.isEmpty())
	 * 
	 * .min(Comparator<T> comparator) e max(Comparator<T> comparator): Encontra o elemento mínimo e máximo da Stream, respectivamente, de acordo com o comparador fornecido.
	 * Exemplo: stream.min(Comparator.naturalOrder()) ou stream.max(Comparator.naturalOrder())
	 * 
	 * .reduce(T identity, BinaryOperator<T> accumulator): Combina os elementos da Stream usando o acumulador especificado e retorna o resultado final.
	 * Exemplo: stream.reduce(0, (a, b) -> a + b)  
	 * 
	 */

}
