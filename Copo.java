package av1;

public class Copo {
	//Atributos
			public int capacidadeMaxima;
			public int capacidadeAtual;
			public String Cor;
			
	//construtor	
	public Copo(int capacidadeMaxima, int capacidadeAtual, String cor) {
			this.capacidadeMaxima = capacidadeMaxima;
			this.capacidadeAtual = capacidadeAtual;
			Cor = cor;
		}

		}
	
	public int getCapacidadeMaxima() {
				return capacidadeMaxima;
			}

			public void setCapacidadeMaxima(int capacidadeMaxima) {
				this.capacidadeMaxima = capacidadeMaxima;
			}

			public int getCapacidadeAtual() {
				return capacidadeAtual;
			}

			public void setCapacidadeAtual(int capacidadeAtual) {
				this.capacidadeAtual = capacidadeAtual;
			}

			public String getCor() {
				return Cor;
			}

			public void setCor(String cor) {
				Cor = cor;
			}

	//Metodos
	public void adicionarLiquido(int qtd) {
		qtd += this.getCapacidadeAtual();
			if(this.capacidadeAtual + qtd > this.capacidadeMaxima) {
		System.out.println("O liquido esborrou!");
			}				
	}
	public void retirarLiquido(int qtd) {
		 this.capacidadeAtual -= qtd;
				
							
	}
	
	public void obterInformacoes() {
		System.out.println("o copo de cor:"+ " "+ this.Cor + " "+ " "+"armazena ate:" +" "+this.capacidadeMaxima+" "
				+"e atualmente contem:"+""+ this.capacidadeAtual);
				
	}
	
	public void esvaziar() {
		this.capacidadeAtual = 0;
			System.out.println("O copo esta totalmente vazio!");
		
	}
}


