package praticaApostila4;

public class Endereco {
	

	String logradouro;
	short numero;
	String complemento;
	String cep;
	
	public String retornarEndereco(String dadoEndereco) {

		System.out.println(logradouro + " " + numero + " " + complemento + " " + cep + " ");
		return dadoEndereco;
	}
}
