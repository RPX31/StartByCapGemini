//Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80,
//menor que 25 ou igual a 40;

import java.util.Scanner;

public class verificaNumero {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados
        Scanner leia = new Scanner(System.in);
        
        // Solicita o número ao usuário
        System.out.print("Informe um número: ");
        int numero = leia.nextInt();
        
        // Verifica as condições e exibe a mensagem correspondente
        if (numero > 80) {
            System.out.println("O número é maior que 80.");
        } else if (numero < 25) {
            System.out.println("O número é menor que 25.");
        } else if (numero == 40) {
            System.out.println("O número é igual a 40.");
        }
        
        // Fecha o Scanner
        leia.close();
    }
}
