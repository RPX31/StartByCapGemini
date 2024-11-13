//Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
//se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
//de venda de cada produto, amédia de preço de custo e do preço de venda
import java.util.Scanner;

public class controleProdutos {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        double totalCusto = 0;
        double totalVenda = 0;
        
        // Número de produtos
        int quantidadeProdutos = 40;
        
        // Laço de repetição para processar os dados de cada produto
        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.println("\nProduto " + i + ":");
            
            // Solicita o preço de custo e preço de venda
            System.out.print("Informe o preço de custo: R$ ");
            double precoCusto = leia.nextDouble();
            
            System.out.print("Informe o preço de venda: R$ ");
            double precoVenda = leia.nextDouble();
            
            // Calcula o total de custo e venda
            totalCusto += precoCusto;
            totalVenda += precoVenda;
            
            // Verifica se houve lucro, prejuízo ou empate
            if (precoVenda > precoCusto) {
                System.out.println("Houve lucro.");
            } else if (precoVenda < precoCusto) {
                System.out.println("Houve prejuízo.");
            } else {
                System.out.println("Houve empate.");
            }
            
            
            System.out.printf("Preço de custo: R$ %.2f\n", precoCusto);
            System.out.printf("Preço de venda: R$ %.2f\n", precoVenda);
        }
        
        // Calcula e exibe as médias dos preços de custo e venda
        double mediaCusto = totalCusto / quantidadeProdutos;
        double mediaVenda = totalVenda / quantidadeProdutos;
        
        System.out.printf("\nMédia do preço de custo: R$ %.2f\n", mediaCusto);
        System.out.printf("Média do preço de venda: R$ %.2f\n", mediaVenda);
        
        leia.close();
    }
}
