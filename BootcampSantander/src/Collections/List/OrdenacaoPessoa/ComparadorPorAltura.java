package Collections.List.OrdenacaoPessoa;

import java.util.Comparator;

public class ComparadorPorAltura implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		return Double.compare(p1.getAltura(), p2.getAltura());
	}
	
	

}
