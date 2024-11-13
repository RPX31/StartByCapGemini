//Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;



import java.util.Scanner;

public class verificaNumero {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        System.out.print("Informe um número: ");
        int numero = leia.nextInt();
        
        
        if (numero > 10) {
            System.out.println("O número informado é maior que 10.");
        }
        
        leia.close();
    }
}
