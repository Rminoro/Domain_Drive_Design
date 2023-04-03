package praticaApostila4;

public class ContaCorrente {

	private double saldo;
	private Cliente titular;
	private double valor;
	private double depositar;
	private double retirar;
	private double retornarSaldo;
	
	public void depositarS(double valor) {
		double saldoFinal = saldo + valor;
	}
	
	public void retirar(double valor) {
		double saldoSaque = saldo - valor;
	}
	
	public static double retornarSaldo(double saldo) {
		System.out.println(saldo);
		return saldo;
	}

	public double getSaldo(double saldo){
		return saldo;
	}
	
	public Cliente getCliente(Cliente titular) {
		return titular;
	}
	
	public double getValor(double valor) {
		return valor;
	}
	
	public double getDepositar(double depositar) {
		return depositar;	
	}
	
	public double getRetirar(double retirar) {
		return retirar;
	}
	
	public double getRetornarSaldo(double retornarSaldo) {
		return retornarSaldo;
	}
	}
	
}
