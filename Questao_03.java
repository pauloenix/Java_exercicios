package av1;

public class Questao_03 {

	public static void main(String[] args) {
		Copo c1 = new Copo();
		Copo c2 = new Copo();
		
		
		c1.setCor("roxo");
		c2.setCor("amarelo");
		
		c1.setCapacidadeAtual(350);
		c2.setCapacidadeAtual(0);
		
		c1.retirarLiquido(350);
		c2.adicionarLiquido(350);
		
		
		
		c1.obterInformacoes();
		
		
		c2.obterInformacoes();
		
				

	}

}
