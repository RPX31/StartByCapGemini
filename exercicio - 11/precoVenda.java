import java.util.Scanner;

public class precoVenda {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        System.out.print("Informe o preço de custo do produto: R$ ");
        double precoCusto = leia.nextDouble();
        
       
        System.out.print("Informe o percentual de acréscimo: ");
        double percentualAcrecimo = leia.nextDouble();
        
        
        double precoVenda = precoCusto * (1 + percentualAcrecimo / 100);
        
        
        System.out.printf("O preço de venda do produto é: R$ %.2f\n", precoVenda);
        
        leia.close();
    }
}
