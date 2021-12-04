package av2;

public class BancoNovaRoma implements IbancoGeral {

	@Override
	public ContaAbstrata abrirConta(String cliente, String numConta, double saldoInicial, String tipo) {
		System.out.println("Conta Criada com sucesso!!!");
		return null;
	}
	@Override
	public boolean depositar(double ContaAbstrata , double valor) {
		if (ContaAbstrata > 0) {
			System.out.println("Deposito realizado com sucesso!!!"+"" + 
					"O valor em conta e:"+(ContaAbstrata+valor));
					
		} else {
			System.out.println("Insita um valor valido para deposito");
		}

		return false;
	}

	@Override
	public boolean sacar(double ContaAbstrata , double valor) {
		if (valor <= ContaAbstrata) {
			System.out.println("O valor sacado foi:"+(ContaAbstrata-valor));
			
		} else {
			System.out.println("Valor maior que o permitido para saque!!!");
		} 	
			return false;
	}
	

}
	 

	


