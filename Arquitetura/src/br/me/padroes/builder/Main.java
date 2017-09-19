package br.me.padroes.builder;

import br.me.padroes.builder.Usuario.UsuarioBuilder;

public class Main {

	public static void main(String[] args) {
		Usuario user = new Usuario.UsuarioBuilder("Joao", "12345")
				.dataNascimento("01/01/1990")
				.endereco("Rua Araua")
				.bairro("Centro")
				.cidade("Aracaju")
				.estado("SE")
				.build();
		
		System.out.println("Usuário: "+user.getNome());
		System.out.println("CPF: "+user.getCpf());
		System.out.println("Data de nasc: "+user.getDataNascimento());
		
	}
	
	
	
}
