import java.util.Scanner;

public class operacaoAritmetica {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados
        Scanner leia = new Scanner(System.in);
        
        // Solicita os dois números reais
        System.out.print("Informe o valor de A (número real): ");
        double A = leia.nextDouble();
        
        System.out.print("Informe o valor de B (número real): ");
        double B = leia.nextDouble();
        
        // Solicita o operador aritmético
        System.out.print("Informe o operador (+, -, *, /): ");
        char C = leia.next().charAt(0);
        
        // Realiza a operação de acordo com o operador informado
        switch (C) {
            case '+':
                System.out.println("Resultado da soma: " + (A + B));
                break;
            case '-':
                System.out.println("Resultado da subtração: " + (A - B));
                break;
            case '*':
                System.out.println("Resultado da multiplicação: " + (A * B));
                break;
            case '/':
                // Verifica se B é zero para evitar a divisão por zero
                if (B == 0) {
                    System.out.println("Erro: divisão por zero.");
                } else {
                    System.out.println("Resultado da divisão: " + (A / B));
                }
                break;
            default:
                // Caso o operador informado não seja válido
                System.out.println("Operador não definido.");
                break;
        }
        
        // Fecha o Scanner
        leia.close();
    }
}
