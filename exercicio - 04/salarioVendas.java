//Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
//por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
//efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
import java.util.Scanner;
public class salarioVendas{
	public static void main(String[] args) {
	    
		 Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe o seu nome: ");
        String nome = leia.nextLine();
        
        System.out.print("Informe o seu Sálario fixo: ");
        double fixoSalario = leia.nextDouble();
        
        System.out.print("Informe os valores das vendas do mês: ");
        double quantidadeVendas = leia.nextDouble();
        
        double comissao = (quantidadeVendas * 0.15);
        double salarioMes = fixoSalario + comissao;
        
        
         
        System.out.println("colaborador: " + nome );
        System.out.println( "comissão de vendas foi de: " + quantidadeVendas);
        System.out.println(" Salario mais comissão é: " + salarioMes);
        
        
        
        leia.close();
	}
}