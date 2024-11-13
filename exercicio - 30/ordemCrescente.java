//Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;

import java.util.Scanner;

public class ordemCrescente {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados
        Scanner leia = new Scanner(System.in);
        
        // Solicita os três valores inteiros
        System.out.print("Informe o primeiro valor: ");
        int a = leia.nextInt();
        
        System.out.print("Informe o segundo valor: ");
        int b = leia.nextInt();
        
        System.out.print("Informe o terceiro valor: ");
        int c = leia.nextInt();
        
        // Verifica e escreve os valores em ordem crescente
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        
        // Exibe os valores em ordem crescente
        System.out.println("Valores em ordem crescente: " + a + ", " + b + ", " + c);
        
        // Fecha o Scanner
        leia.close();
    }
}
