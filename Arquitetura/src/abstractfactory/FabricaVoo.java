package abstractfactory;

public class FabricaVoo implements FabricaVooAbstrata {

	@Override
	public Voo criarVooNacional() {
		// TODO Auto-generated method stub
		return new VooNacional();
	}

	@Override
	public Voo criarVooInternacional() {
		// TODO Auto-generated method stub
		return new VooInternacional();
	}
	
}
