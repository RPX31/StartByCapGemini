//Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número
//que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;
import java.util.Scanner;

public class compararNumeross {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados
        Scanner leia = new Scanner(System.in);
        
        // Solicita os dois números ao usuário
        System.out.print("Informe o primeiro número: ");
        int numero1 = leia.nextInt();
        
        System.out.print("Informe o segundo número: ");
        int numero2 = leia.nextInt();
        
        // Verifica se os números são iguais ou diferentes
        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else {
            // Se forem diferentes, informa qual é o maior
            if (numero1 > numero2) {
                System.out.println("Os números são diferentes. O maior é: " + numero1);
            } else {
                System.out.println("Os números são diferentes. O maior é: " + numero2);
            }
        }
        
        // Fecha o Scanner
        leia.close();
    }
}
