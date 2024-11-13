//Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
//No finalinformar o nome do aluno e a sua média (aritmética);
import java.util.Scanner;
public class notasMedia{
	public static void main(String[] args) {
	    
		 Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe sua primeira nota: ");
        double notaUm = leia.nextDouble();
        
        System.out.print("Informe sua segunda nota: ");
        double notaDois = leia.nextDouble();
        
        System.out.print("Informe sua terceira nota: ");
        double notaTres = leia.nextDouble();
        
        double media = (notaUm + notaDois + notaTres ) / 3;
        
        
        
         
        System.out.printf("a média foi de  %.2f: " , media );
        
        leia.close();
	}
}