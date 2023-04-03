package br.com.fiap.exercicio;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	
		
		Scanner S = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();
		
		System.out.println("Qual o valor á ser depositado: ");
		double valor = S.nextDouble();
		
		conta.setDepositar(valor);
		
		conta.setRetornarSaldo(valor);
		System.out.println("O saldo da conta é : " + conta.saldo);
		
		conta.setRetirar(valor);
		
	}


}
