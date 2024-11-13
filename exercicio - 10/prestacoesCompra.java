//A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um
//algoritmo que receba um valor de uma compra e mostre o valor das prestações;


import java.util.Scanner;

public class prestacoesCompra {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
      
        System.out.print("Informe o valor da compra: R$ ");
        double valorCompra = leia.nextDouble();
        
        
        double valorPrestacao = valorCompra / 5;
        
        
        System.out.printf("O valor de cada uma das 5 prestações é: R$ %.2f\n", valorPrestacao);
        
        leia.close();
    }
}
