package abstractfactory;

// a abstrata serve para que ao inves de criar o new na sua classe, 
// voce cria uma nova classe que ira ficar todos os new do sistema. 
// Oferecendo ate uma boa leitura do codigo.
public interface FabricaVooAbstrata {
	
	public Voo criarVooNacional();
	public Voo criarVooInternacional();
}
