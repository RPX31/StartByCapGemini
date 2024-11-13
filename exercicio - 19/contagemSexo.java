//Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
//mulher. No final informe total de homens e de mulheres;
import java.util.Scanner;

public class contagemSexo {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados de entrada
        Scanner leia = new Scanner(System.in);
        
        // Variáveis para contar o número de homens e mulheres
        int totalHomens = 0;
        int totalMulheres = 0;
        
        // Laço de repetição para ler os dados das 56 pessoas
        for (int i = 1; i <= 56; i++) {
            
            System.out.print("Informe o nome da " + i + "ª pessoa: ");
            String nome = leia.nextLine();
            
            System.out.print("Informe o sexo (M para homem ou F para mulher) da " + i + "ª pessoa: ");
            char sexo = leia.next().charAt(0);
            
            // Verifica se a pessoa é homem ou mulher e atualiza o contador
            if (sexo == 'M' || sexo == 'm') {
                System.out.println(nome + " é homem.");
                totalHomens++;
            } else if (sexo == 'F' || sexo == 'f') {
                System.out.println(nome + " é mulher.");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido! Digite 'M' para homem ou 'F' para mulher.");
            }
            
            
            leia.nextLine();
        }
        
        
        System.out.println("\nTotal de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
        
        leia.close();
    }
}
