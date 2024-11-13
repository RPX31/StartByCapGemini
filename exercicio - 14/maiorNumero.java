//Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
import java.util.Scanner;

public class maiorNumero {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
       
        System.out.print("Informe o primeiro número: ");
        int numero1 = leia.nextInt();
        
        System.out.print("Informe o segundo número: ");
        int numero2 = leia.nextInt();
        
        // Verifica qual número é maior
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os dois números são iguais.");
        }
        
        leia.close();
    }
}
