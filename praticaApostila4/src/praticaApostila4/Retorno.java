package praticaApostila4;
import java.util.Scanner;

public class Retorno {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
			Cliente cliente = new Cliente();
			Endereco endereco = new Endereco();
			ContaCorrente Conta = new ContaCorrente();
		
		System.out.println("Digite seu nome");
		cliente.nome = S.next();
		
		System.out.println("Digite seu CPF");
		cliente.cpf = S.next();
		
		System.out.println("Digite o endereco ");
		cliente.endereco = S.next();
		
		System.out.println(" Digite o seu logradouro ");
		endereco.logradouro = S.next();
		
		System.out.println("Digite o numero do endereco");
		endereco.numero = S.nextShort();
		
		System.out.println("Digite um complemento (ap,andar)");
		endereco.complemento = S.next();
		
		System.out.println("Digite o CEP");
		endereco.cep = S.next();
		
		System.out.println("Digite o valor a ser depositado");
		ContaCorrente.valor = S.nextDouble();
		double D = ContaCorrente.depositar();
		
	
	}
}
