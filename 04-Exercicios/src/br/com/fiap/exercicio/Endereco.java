package br.com.fiap.exercicio;

public class Endereco {
	String logradouro;
	short numero;
	String complemento;
	String cep;
	
	public String retornarEndereco() {
		String endereco =(logradouro + " " + numero + " " + complemento + " " + cep);
		return endereco;
	}
	
}
