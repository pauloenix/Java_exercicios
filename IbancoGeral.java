package av2;

public interface IbancoGeral {
	ContaAbstrata abrirConta(String cliente, String numConta, double saldoInicial, String tipo);
	public boolean depositar(double ContaAbstrata ,double valor);
	public boolean sacar(double ContaAbstrata ,double valor);

	



}
