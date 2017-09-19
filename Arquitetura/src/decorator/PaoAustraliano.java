package decorator;

public class PaoAustraliano extends HamburguerDecorator {
	public PaoAustraliano(Hamburguer hamburguer) {
		super(hamburguer);
		nome = "Pão Australiano";
		preco = 0;
	}
}
