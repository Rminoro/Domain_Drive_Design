package br.com.fiap.exercicio;

public class Cliente {
	String nome;
	String cpf;
	Endereco endereco = new Endereco();
	
	
	String retornarDados() {
		
		String dados= (nome + " " + cpf + " " + endereco);
		return dados;
		
		
	}
	
}
