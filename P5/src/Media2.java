import java.util.Locale;
import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {
		/*Leia 3 valores, no caso, variáveis A, B e C, que são as três 
		 * notas de um aluno. A seguir, calcule a média do aluno, sabendo 
		 * que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
		 * Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa 
		 * decimal.
		 */
		
		Locale.setDefault(Locale.US);
	    Scanner insere = new Scanner(System.in);
	 
	       double A = insere.nextDouble();
	       double B = insere.nextDouble();
	       double C = insere.nextDouble();
	       
	       //calculo media ponderada
	       double media = ((A*2) + (B*3) + (C*5))/10;;
	       
	        System.out.println(String.format("MEDIA = %.1f",media));

	}

}
