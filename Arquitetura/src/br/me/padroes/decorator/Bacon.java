package br.me.padroes.decorator;

public class Bacon extends HamburguerDecorator {
	public Bacon(Hamburguer hamburguer) {
		super(hamburguer);
		nome = "Bacon";
		preco = 3.5;
	}
}
