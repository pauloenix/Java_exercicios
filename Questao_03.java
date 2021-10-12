package av1;

public class Questao_03 {

	public static void main(String[] args) {
		Copo c1 = new Copo(350,350,"roxo");
		Copo c2 = new Copo(350,0, "azul");
		
		c1.retirarLiquido(350);
		c2.adicionarLiquido(350);
		
		c1.obterInformacoes();
		c2.obterInformacoes();
		
			
	}

}
