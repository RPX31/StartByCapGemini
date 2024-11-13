//Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;

import java.util.Scanner;

public class verificaIntervalo {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        System.out.print("Informe um número: ");
        int numero = leia.nextInt();
        
        // Verifica se o número está no intervalo entre 100 e 200
        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O número não está no intervalo entre 100 e 200.");
        }
        
        leia.close();
    }
}
