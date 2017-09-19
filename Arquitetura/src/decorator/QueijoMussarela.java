package decorator;

public class QueijoMussarela extends HamburguerDecorator {
	public QueijoMussarela(Hamburguer hamburguer) {
		super(hamburguer);
		nome = "Queijo mussarela";
		preco = 2.0;
	}
}
