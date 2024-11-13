//Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
//“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;

import java.util.Scanner;

public class verificaIdade {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        // Laço de repetição para ler as idades das 75 pessoas
        for (int i = 1; i <= 75; i++) {
            System.out.print("Informe a idade da " + i + "ª pessoa: ");
            int idade = leia.nextInt();
            
            // Verifica se a pessoa é maior ou menor de idade
            if (idade >= 18) {
                System.out.println("Pessoa " + i + ": Maior de idade");
            } else {
                System.out.println("Pessoa " + i + ": Menor de idade");
            }
        }
        
        leia.close();
    }
}
