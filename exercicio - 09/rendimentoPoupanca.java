//Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
//mês.Considere fixo o juro da poupança em 0,07% a. m
import java.util.Scanner;

public class rendimentoPoupanca {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        System.out.print("Informe o valor do depósito: R$ ");
        double valorDepositado = leia.nextDouble();
        
        
        double taxaJuros = 0.07 / 100;  
        
        
        double valorComRendimento = valorDepositado * (1 + taxaJuros);
        
        
        System.out.printf("Valor com rendimento após um mês: R$ %.2f\n", valorComRendimento);
        
        leia.close();
    }
}
