//Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de
//luz segue a tabela abaixo:
//Tipo de Cliente Valor do KW/h
//a. (Residência) 0,60;
//b. (Comércio) 0,48;
//c. (Indústria) 1,29.



import java.util.Scanner;

public class contaDeLuz {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura dos dados
        Scanner leia = new Scanner(System.in);
        
        // Solicita o tipo de cliente
        System.out.println("Informe o tipo de cliente (1 para Residência, 2 para Comércio, 3 para Indústria): ");
        int tipoCliente = leia.nextInt();
        
        // Solicita a quantidade de KW/h consumidos
        System.out.print("Informe a quantidade de KW/h consumidos: ");
        double consumoKw = leia.nextDouble();
        
        // Variável para armazenar o valor do KW/h
        double valorKw = 0;
        
        // Define o valor do KW/h de acordo com o tipo de cliente
        switch (tipoCliente) {
            case 1: // Residência
                valorKw = 0.60;
                break;
            case 2: // Comércio
                valorKw = 0.48;
                break;
            case 3: // Indústria
                valorKw = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
                leia.close();
                return; // Encerra o programa caso o tipo seja inválido
        }
        
        // Calcula o valor da conta de luz
        double valorConta = consumoKw * valorKw;
        
        // Exibe o valor a ser pago
        System.out.printf("O valor da conta de luz é: R$ %.2f%n", valorConta);
        
        // Fecha o Scanner
        leia.close();
    }
}
