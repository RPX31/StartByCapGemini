//Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
//imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
//maior, e uma mensagem que são diferentes;
import java.util.Scanner;

public class compararNumeros {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        System.out.print("Informe o primeiro número: ");
        int numero1 = leia.nextInt();
        
        System.out.print("Informe o segundo número: ");
        int numero2 = leia.nextInt();
        
        // Verifica se os números são iguais ou diferentes
        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else {
            // Se forem diferentes, informa qual é o maior
            if (numero1 > numero2) {
                System.out.println("Os números são diferentes. O maior é: " + numero1);
            } else {
                System.out.println("Os números são diferentes. O maior é: " + numero2);
            }
        }
        
        // Fecha o Scanner
        leia.close();
    }
}
