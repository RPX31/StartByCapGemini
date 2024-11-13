//Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valorlido em
//dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
//disponíveis com ousuário;


import java.util.Scanner;

public class conversaoDolarParaReal {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        System.out.print("Informe a cotação do dólar (R$ por 1 US$): ");
        double cotacaoDolar = leia.nextDouble();
        
        
        System.out.print("Informe a quantidade de dólares (US$): ");
        double quantidadeDolares = leia.nextDouble();
        
       
        double valorEmReais = cotacaoDolar * quantidadeDolares;
        
        
        System.out.printf("O valor de R$ %.2f em dólares (US$ %.2f) é equivalente a R$ %.2f\n", 
                          cotacaoDolar, quantidadeDolares, valorEmReais);
        
        leia.close();
    }
}
