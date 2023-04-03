package br.com.fiap.exercicio;

public class ContaCorrente {
	
		double saldo = 500;
		double valor = 0;
		Cliente titular = new Cliente();
		double saldoD;
		double saldoR;
		
		public void setDepositar(double valor) {
			saldo = saldo + valor;
		}
		public double getDeposito() {
			return saldoD;
		}
	
		public void setRetirar(double valor) {
			saldo = saldo - valor;
		}
		public double getRetirar() {
			return saldoR;
		}
	
		public double setRetornarSaldo(double saldo) {
			return saldoR;

	
		}
	}
