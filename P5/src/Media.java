import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		/* Leia 2 valores de ponto flutuante de dupla precisão A e B, 
		 * que correspondem a 2 notas de um aluno. A seguir, calcule a 
		 * média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 
		 * (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, 
		 * sempre com uma casa decimal.
		 */

		Scanner insere = new Scanner(System.in);
	      
	       double A = insere.nextDouble();
	       double B = insere.nextDouble();
	       
	       //calculo da media ponderada
	       double nota1 = A * 3.5;
	       double nota2 = B * 7.5;
	       double media = nota1 + nota2 / 11;
	       
	            System.out.println(String.format("MEDIA = %.5f", (media = (nota1+nota2)/11)));
	}

}
