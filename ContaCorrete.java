package av2;

public class ContaCorrete extends ContaAbstrata{
	private String numconta;
	private double saldo;
	private String cliente;
	private double ChequeEspecial;
	
	
	@Override
	public void obterLimite() {
		this.getSaldo();
		System.out.println("o saldo da conta e :" +" " + this.getSaldo());
	}

	public double getChequeEspecial() {
		return ChequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		ChequeEspecial = this.saldo +chequeEspecial;
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
