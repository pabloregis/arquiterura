package decorator;

public class PaoBatata extends HamburguerDecorator {
	public PaoBatata(Hamburguer hamburguer) {
		super(hamburguer);
		nome = "P�o de Batata";
		preco = 0;
	}
}
