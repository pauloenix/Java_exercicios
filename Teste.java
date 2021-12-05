package av2;

public class Teste {

	public static void main(String[] args) {
		IbancoGeral c1= new BancoNovaRoma();
		c1.abrirConta("joao", "1111", 50, "ContaCorrente");
		c1.depositar(100, 50);
		
		
		
		
		IbancoGeral c2 = new BancoNovaRoma();
		c2.abrirConta("Maria","2222" , 100, "Poupanca");
		c2.depositar(1000, 10);
		c2.sacar(900, 0);
	}

}
