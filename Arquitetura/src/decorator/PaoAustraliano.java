package decorator;

public class PaoAustraliano extends HamburguerDecorator {
	public PaoAustraliano(Hamburguer hamburguer) {
		super(hamburguer);
		nome = "P�o Australiano";
		preco = 0;
	}
}
