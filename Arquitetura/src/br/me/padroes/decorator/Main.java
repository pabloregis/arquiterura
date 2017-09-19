package br.me.padroes.decorator;

public class Main {

	public static void main(String[] args) {
		Hamburguer meuHamburguer = new BlendPorco();
		System.out.println(meuHamburguer.getNomePreco() + " = " + meuHamburguer.getPreco());
		
		meuHamburguer = new PaoAustraliano(meuHamburguer);
		System.out.println(meuHamburguer.getNomePreco() + " = " + meuHamburguer.getPreco());
		
		meuHamburguer = new QueijoMussarela(meuHamburguer);
		System.out.println(meuHamburguer.getNomePreco() + " = " + meuHamburguer.getPreco());
		
		meuHamburguer = new Bacon(meuHamburguer);
		System.out.println(meuHamburguer.getNomePreco() + " = " + meuHamburguer.getPreco());
		
		meuHamburguer = new Picles(meuHamburguer);
		System.out.println(meuHamburguer.getNomePreco() + " = " + meuHamburguer.getPreco());
	}

}
