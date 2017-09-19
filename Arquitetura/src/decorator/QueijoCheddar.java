package decorator;

public class QueijoCheddar extends HamburguerDecorator {
	public QueijoCheddar(Hamburguer hamburguer) {
		super(hamburguer);
		nome = "Queijo cheddar";
		preco = 2.5;
	}
}
