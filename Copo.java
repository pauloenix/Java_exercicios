package av1;

public class Copo {
	//Construtor	
	public Copo() {
	this.capacidadeMaxima = 350;
	this.Cor="verde";
	this.capacidadeAtual = capacidadeAtual;
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
	public boolean getCopoVazio() {
		return copoVazio;
	}
	public void setCopoVazio(boolean b) {
		this.copoVazio = b;
	}




	//Atributos
	int capacidadeMaxima;
	int capacidadeAtual;
	String Cor;
	boolean copoVazio;
	private int setesvaziar;
	private int a;
	public int qdt ;
	
	
	//Metodos
	public void adicionarLiquido(int a) {
		int qtd = this.getCapacidadeAtual() + a ;
			if(this.capacidadeAtual>this.capacidadeMaxima) {
		System.out.println("O liquido esborrou!");
			}				
	}
	public void retirarLiquido(int r) {
		int qtd = this.capacidadeAtual-r;
				
					
		
	}
	
	public void obterInformacoes() {
		System.out.println("o copo de cor:"+ " "+ this.Cor + " "+ " "+"armazena ate:" +" "+this.capacidadeMaxima+" "
				+"e atualmente contem:"+""+ this.capacidadeAtual);
				
	}
	
	public void esvaziar() {
		this.setesvaziar =(this.getCapacidadeMaxima() - getCapacidadeMaxima());
		
	
		System.out.println("O copo esta totalmente vazio!");
		
	}
	
	
	
	
	
	
	
	
	

}


