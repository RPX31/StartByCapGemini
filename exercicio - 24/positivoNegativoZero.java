//Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número
import java.util.Scanner;

public class positivoNegativoZero {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados
        Scanner leia = new Scanner(System.in);
        
        // Solicita o número de entradas
        System.out.print("Quantos números você deseja verificar? ");
        int N = leia.nextInt();
        
        // Laço para receber "N" números
        for (int i = 1; i <= N; i++) {
            System.out.print("Informe o " + i + "º número: ");
            int numero = leia.nextInt();
            
            // Verifica se o número é positivo, negativo ou zero
            if (numero > 0) {
                System.out.println("O número " + numero + " é positivo.");
            } else if (numero < 0) {
                System.out.println("O número " + numero + " é negativo.");
            } else {
                System.out.println("O número " + numero + " é zero.");
            }
        }
        
        // Fecha o Scanner
        leia.close();
    }
}
