package br.com.fiap.exercicio;

public class ContaCorrente {
	
		double saldo = 0;
		double valor = 0;
		Cliente titular = new Cliente();
	
		
		public void setDepositar(double valor) {
			saldo += valor;
		}
	
		public void setRetirar(double valor) {
			saldo -= valor;
		}
	
		public double setRetornarSaldo(double saldo) {
			System.out.println(saldo);	
			return saldo;	
		}
	}
