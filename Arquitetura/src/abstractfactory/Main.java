package abstractfactory;

public class Main {

	public static void main(String[] args) {
		DadosVoo dadoVoo = DadosVoo.getInstance();
		
		//Passageiro humano = Passageiro.lerPassageiro();
	
		FabricaVooAbstrata fabricavoo = new FabricaVoo();
										
		
		Voo voo = fabricavoo.criarVooNacional();
		
		voo.lerVoo();
		
		dadoVoo.listaVoo.add(voo);
		System.out.println(dadoVoo.listaVoo);
		
	}
	

}
