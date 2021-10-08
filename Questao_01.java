package av1;

import java.util.Scanner;

public class Questao_01 {
	
	static int soma (int numA, int numB) {
		int s = numA+numB;
		return s;
	  }
	
	static int subtracao (int numA, int numB) {
		int su = numA - numB;
		return su;
	}
	
	static int multiplicacao (int numA, int numB) {
		int m = numA*numB;
		return m;
	  }
	
	static int divisao (int numA, int numB) {
		int d = numA/numB;
		return d;
	  }

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite dois numeros inteiros");
		int numA = teclado.nextInt(),numB = teclado.nextInt();
			
			
	    System.out.println("Qual operacao voce gostaria de realizar? \n 1. Soma \n 2. Subtracao"
					+ " \n 3. Multiplicacao\n 4. Divisao");
					
				int c = teclado.nextInt();
				;
			
		switch(c) {
		case 1:
			System.out.println(soma(numA,numB));
			break;
		case 2:
		System.out.println(subtracao(numA,numB));
		break;
		case 3:
		System.out.println(multiplicacao(numA,numB));
		break;
		case 4:
		System.out.println(divisao(numA,numB));
		break;
		}
		
		teclado.close();
		}
	}


