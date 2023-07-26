import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		/* Faça um programa que leia três valores e apresente 
		 o maior dos três valores lidos seguido da mensagem 
		 “eh o maior
		 MaiorAB = (a+b+abs(a-b))/2
		 */

		Scanner insere = new Scanner (System.in);
		
	    int a = insere.nextInt();
		int b = insere.nextInt();
		int c = insere.nextInt();
		int maiorAB;
		int maiorABC;
		
		//formula - ab = a+b + abs (a-b)/2; conceito de math.abs;

		// formula dada p/ descobrir maior entre A e B;
		maiorAB = (a + b + Math.abs(a-b))/2; 
		
		//// descobrir o maior entre AB e o C;
		maiorABC = (maiorAB + c + Math.abs(c - maiorAB))/2;
		
		
		System.out.printf("%d eh o maior%n", maiorABC );
	}

}
