package br.me.padroes.decorator;

public abstract class Hamburguer {
	String nome;
	double preco;
	
	public String getNome() {
		return this.nome;
	}

	public double getPreco() {
		return this.preco;
	}
	
	public String getNomePreco() {
		return this.nome + " (" + this.preco + ")";
	}
}
