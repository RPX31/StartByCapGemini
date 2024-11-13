//O custo de um carro novo ao consumidoré a soma do custo de fábrica mais o percentual do distribuidor e
//dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
//do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
//45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
//mesmo;


import java.util.Scanner;

public class custoCarro {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        System.out.print("Informe o custo de fábrica do carro: R$ ");
        double custoFabrica = leia.nextDouble();
        
        
        double percentualImpostos = 45.0 / 100;  // 45% de impostos
        double percentualDistribuidor = 28.0 / 100;  // 28% do distribuidor
        
        
        double custoComImpostos = custoFabrica * (1 + percentualImpostos);
        
        
        double custoFinal = custoComImpostos * (1 + percentualDistribuidor);
        
        
        System.out.printf("O custo ao consumidor do carro é: R$ %.2f\n", custoFinal);
        
        leia.close();
    }
}
