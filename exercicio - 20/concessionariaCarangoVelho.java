//A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
//um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
//desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
//sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
//Informar total de carros com ano até 2000 e total geral;

import java.util.Scanner;

public class concessionariaCarangoVelho {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        int totalCarrosAte2000 = 0;
        int totalCarros = 0;
        
        // Laço de repetição para calcular o desconto para vários carros
        while (true) {
            
            System.out.print("Informe o ano do carro: ");
            int anoCarro = leia.nextInt();
            System.out.print("Informe o valor do carro: R$ ");
            double valorCarro = leia.nextDouble();
            
            // Calcula o desconto baseado no ano do carro
            double desconto = 0;
            if (anoCarro <= 2000) {
                desconto = valorCarro * 0.12; // 12% de desconto para carros até 2000
                totalCarrosAte2000++;
            } else {
                desconto = valorCarro * 0.07; // 7% de desconto para carros acima de 2000
            }
            
            
            double valorFinal = valorCarro - desconto;
            
            
            System.out.printf("Desconto: R$ %.2f\n", desconto);
            System.out.printf("Valor a ser pago: R$ %.2f\n", valorFinal);
            
            // Incrementa o total de carros processados
            totalCarros++;
            
            // Pergunta se deseja continuar calculando desconto para outro carro
            System.out.print("Deseja continuar calculando o desconto? (S para sim, N para não): ");
            String resposta = leia.next();
            
            // Se a resposta for 'N' (não), o programa termina
            if (resposta.equalsIgnoreCase("N" || "n")) {
                break;
            }
        }
        
        
        System.out.println("\nTotal de carros com ano até 2000: " + tot
