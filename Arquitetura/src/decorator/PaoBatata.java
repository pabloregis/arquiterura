package decorator;

public class PaoBatata extends HamburguerDecorator {
	public PaoBatata(Hamburguer hamburguer) {
		super(hamburguer);
		nome = "Pão de Batata";
		preco = 0;
	}
}
