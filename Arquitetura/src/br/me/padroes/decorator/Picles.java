package br.me.padroes.decorator;

public class Picles extends HamburguerDecorator {
	public Picles(Hamburguer hamburguer) {
		super(hamburguer);
		nome = "Picles";
		preco = 2.5;
	}
}
