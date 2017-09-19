package abstractfactory;
import java.util.LinkedList;
import java.util.List;

public class DadosVoo {
	
	List <Voo> listaVoo = new LinkedList<>();
	
	 static DadosVoo dadosVoo = new DadosVoo();
	
	public static DadosVoo getInstance() {
		if (dadosVoo == null) {
			dadosVoo = new DadosVoo();
		}
		return dadosVoo;
	}
}
