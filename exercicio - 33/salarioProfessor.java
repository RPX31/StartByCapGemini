//A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
//calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
//a. Professor Nível 1 R$12,00 por hora/aula;
//b. Professor Nível 2 R$17,00 por hora/aula;
//c. Professor Nível 3 R$25,00 por hora/aula.

import java.util.Scanner;

public class salarioProfessor {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura dos dados
        Scanner leia = new Scanner(System.in);
        
        // Solicita o nome do professor
        System.out.print("Informe o nome do professor: ");
        String nome = leia.nextLine();
        
        // Solicita o nível do professor
        System.out.print("Informe o nível do professor (1, 2 ou 3): ");
        int nivel = leia.nextInt();
        
        // Solicita o número de horas/aula trabalhadas
        System.out.print("Informe o número de horas/aula trabalhadas: ");
        int horasAula = leia.nextInt();
        
        // Variável para armazenar o valor da hora/aula
        double valorHora = 0;
        
        // Verifica o nível do professor e atribui o valor da hora/aula
        if (nivel == 1) {
            valorHora = 12.00;
        } else if (nivel == 2) {
            valorHora = 17.00;
        } else if (nivel == 3) {
            valorHora = 25.00;
        } else {
            System.out.println("Nível inválido! Os níveis válidos são 1, 2 ou 3.");
            leia.close();
            return;
        }
        
        // Calcula o salário
        double salario = valorHora * horasAula;
        
        // Exibe o salário do professor
        System.out.printf("Professor %s, seu salário é: R$ %.2f%n", nome, salario);
        
        // Fecha o Scanner
        leia.close();
    }
}
