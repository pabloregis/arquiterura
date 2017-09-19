package br.me.padroes.decorator;

public abstract class HamburguerDecorator extends Hamburguer {
	Hamburguer hamburguer;
	
	public HamburguerDecorator(Hamburguer hamburguer) {
		this.hamburguer = hamburguer;
	}
	
	@Override
	public String getNome() {
		return hamburguer.getNome() + " + " + this.nome;
	}
	
	@Override
	public double getPreco() {
		return hamburguer.getPreco() + this.preco;
	}
	
	public String getNomePreco() {
		return hamburguer.getNomePreco() + " + " + this.nome + " (" + this.preco + ")";
	}
}