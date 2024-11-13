//Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
//Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
//Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos
//outros dois lados. 


import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados
        Scanner leia = new Scanner(System.in);
        
        // Solicita os três valores dos lados
        System.out.print("Informe o primeiro lado: ");
        int a = leia.nextInt();
        
        System.out.print("Informe o segundo lado: ");
        int b = leia.nextInt();
        
        System.out.print("Informe o terceiro lado: ");
        int c = leia.nextInt();
        
        // Verifica se os lados podem formar um triângulo
        if (a + b > c && a + c > b && b + c > a) {
            // Determina o tipo de triângulo
            if (a == b && b == c) {
                System.out.println("O triângulo é equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }
        
        // Fecha o Scanner
        leia.close();
    }
}