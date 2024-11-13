//Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
//ou não para cumprir o serviço militar obrigatório. Informe os totais;

import java.util.Scanner;

public class servicoMilitar {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        
        System.out.print("Informe o número de pessoas: ");
        int N = leia.nextInt();

        // Variáveis para contagem dos totais
        int totalAptos = 0;
        int totalNaoAptos = 0;

        // Laço para ler os dados de cada pessoa
        for (int i = 1; i <= N; i++) {
            leia.nextLine(); 
            System.out.print("Informe o nome da " + i + "ª pessoa: ");
            String nome = leia.nextLine();

            System.out.print("Informe o sexo da pessoa (M/F): ");
            char sexo = leia.next().charAt(0);

            System.out.print("Informe a idade da pessoa: ");
            int idade = leia.nextInt();

            System.out.print("Informe o estado de saúde da pessoa (1 para boa, 0 para ruim): ");
            int saude = leia.nextInt();

            // Verifica se a pessoa está apta ou não
            if (sexo == 'M' || sexo == 'm') {
                if (idade >= 18 && idade <= 45 && saude == 1) {
                    System.out.println(nome + " está apto para o serviço militar.");
                    totalAptos++;
                } else {
                    System.out.println(nome + " não está apto para o serviço militar.");
                    totalNaoAptos++;
                }
            } else {
                System.out.println(nome + " não está apto para o serviço militar (sexo feminino).");
                totalNaoAptos++;
            }
        }

        
        System.out.println("\nTotal de pessoas aptas para o serviço militar: " + totalAptos);
        System.out.println("Total de pessoas não aptas para o serviço militar: " + totalNaoAptos);

        leia.close();
    }
}
