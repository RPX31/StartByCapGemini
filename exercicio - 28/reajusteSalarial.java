//Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo
//com os seguintes critérios:
//a. 50% para aqueles que ganham menos do que três salários mínimos;
//b. 20% para aqueles que ganham entre três até dez salários mínimos;
//c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
//d. 10% para os demais funcionários

//Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
//reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa
//vai aumentar sua folha de pagamento;


import java.util.Scanner;

public class reajusteSalarial {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados
        Scanner leia = new Scanner(System.in);
        
        // Variável para o número de funcionários
        int totalFuncionarios = 584;
        
        // Variável para o total de aumento na folha de pagamento
        double aumentoTotalFolha = 0;
        
        // Solicita o valor do salário mínimo
        System.out.print("Informe o valor do salário mínimo: R$ ");
        double salarioMinimo = leia.nextDouble();
        
        // Laço para processar todos os funcionários
        for (int i = 1; i <= totalFuncionarios; i++) {
            // Solicita o nome do funcionário e o salário
            System.out.print("Informe o nome do funcionário " + i + ": ");
            String nome = leia.next();
            
            System.out.print("Informe o salário do funcionário " + nome + ": R$ ");
            double salario = leia.nextDouble();
            
            // Variáveis para o reajuste e novo salário
            double reajuste = 0;
            double novoSalario = salario;
            
            // Calcula o reajuste de acordo com o salário em relação ao salário mínimo
            if (salario < 3 * salarioMinimo) {  // Menos de 3 salários mínimos
                reajuste = salario * 0.50;  // 50% de reajuste
            } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {  // Entre 3 e 10 salários mínimos
                reajuste = salario * 0.20;  // 20% de reajuste
            } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {  // Entre 10 e 20 salários mínimos
                reajuste = salario * 0.15;  // 15% de reajuste
            } else {  // Acima de 20 salários mínimos
                reajuste = salario * 0.10;  // 10% de reajuste
            }
            
            // Calcula o novo salário após o reajuste
            novoSalario = salario + reajuste;
            
            // Exibe o reajuste e o novo salário
            System.out.printf("Funcionário %d: Nome: %s, Salário original: R$ %.2f, Reajuste: R$ %.2f, Novo salário: R$ %.2f\n", 
                              i, nome, salario, reajuste, novoSalario);
            
            // Soma o aumento da folha de pagamento
            aumentoTotalFolha += reajuste;
        }
        
        // Exibe o aumento total da folha de pagamento
        System.out.printf("Aumento total na folha de pagamento: R$ %.2f\n", aumentoTotalFolha);
        
        // Fecha o Scanner
        leia.close();
    }
}
