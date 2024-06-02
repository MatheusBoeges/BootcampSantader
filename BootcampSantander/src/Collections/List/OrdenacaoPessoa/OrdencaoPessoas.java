package Collections.List.OrdenacaoPessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdencaoPessoas {

	List<Pessoa> pessoasList;
	
	public OrdencaoPessoas() {
		this.pessoasList = new ArrayList<>();
	}
	
	 public void adicionarPessoa(String nome, int idade, double altura) {
		    pessoasList.add(new Pessoa(nome, idade, altura));
		  }

		  public List<Pessoa> ordenarPorIdade() {
		    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
		    if (!pessoasList.isEmpty()) {
		      Collections.sort(pessoasPorIdade);
		      return pessoasPorIdade;
		    } else {
		      throw new RuntimeException("A lista está vazia!");
		    }
		  }

		  public List<Pessoa> ordenarPorAltura() {
		    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
		    if (!pessoasList.isEmpty()) {
		      Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		      return pessoasPorAltura;
		    } else {
		      throw new RuntimeException("A lista está vazia!");
		    }

}
