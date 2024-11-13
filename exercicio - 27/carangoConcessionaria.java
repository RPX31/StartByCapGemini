//A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
//algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
//calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
//–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
//clientes;


import java.util.Scanner;

public class carangoConcessionaria {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados
        Scanner leia = new Scanner(System.in);
        
        // Variáveis para acumular os totais de desconto e valor pago
        double totalDesconto = 0;
        double totalPago = 0;
        
        while (true) {
            // Solicita o valor do veículo
            System.out.print("Informe o valor do veículo (ou 0 para encerrar): R$ ");
            double valorVeiculo = leia.nextDouble();
            
            // Se o valor do veículo for zero, encerra o programa
            if (valorVeiculo == 0) {
                break;
            }
            
            // Solicita o tipo de combustível
            System.out.print("Informe o tipo de combustível (álcool, gasolina, diesel): ");
            String combustivel = leia.next().toLowerCase();
            
            // Variáveis para calcular o desconto e o valor pago
            double desconto = 0;
            double valorPago = valorVeiculo;
            
            // Calcula o desconto com base no tipo de combustível
            switch (combustivel) {
                case "alcool":
                    desconto = valorVeiculo * 0.25;  // 25% de desconto
                    break;
                case "gasolina":
                    desconto = valorVeiculo * 0.21;  // 21% de desconto
                    break;
                case "diesel":
                    desconto = valorVeiculo * 0.14;  // 14% de desconto
                    b
