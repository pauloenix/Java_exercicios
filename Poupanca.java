package av2;

public class Poupanca extends ContaAbstrata {
	private String numconta;
	private double saldo;
	private String cliente;
	
		
	@Override
	public void obterLimite() {
		this.getSaldo();
	}


	public String getNumconta() {
		return numconta;
	}


	public void setNumconta(String numconta) {
		this.numconta = numconta;
	}


	public double getSaldo() {
		return saldo;
	}


	public double setSaldo(double saldo) {
		return this.saldo = saldo;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	

}
