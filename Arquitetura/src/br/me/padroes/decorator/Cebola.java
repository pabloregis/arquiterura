package br.me.padroes.decorator;

public class Cebola extends HamburguerDecorator {
	public Cebola(Hamburguer hamburguer) {
		super(hamburguer);
		nome = "Cebola";
		preco = 1.5;
	}
}
