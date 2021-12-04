package av2;

public abstract class ContaAbstrata {
	private String numconta;
	private double saldo;
	private String cliente;
		
	
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
	//metodo abstrato declarado nas subclasses
	public abstract void  obterLimite();
			

	public double sacar(double valor) {
			this.saldo -= valor;
			if (this.getSaldo()>=valor) {
				this.setSaldo(this.getSaldo()- valor);
				
			} else {
				System.out.println("Saldo insulficiente para saque");
			}
			return valor;

			}
				
	public  double depositar(double valor) {
		 return this.setSaldo(this.getSaldo() + valor);
	}

}


