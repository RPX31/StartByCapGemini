//Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
//(inclusive);

import java.util.Scanner;

public class intervaloNumeros {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        int contador = 0;
        
        // Laço de repetição para ler 80 números
        for (int i = 1; i <= 80; i++) {
            System.out.print("Informe o " + i + "º número: ");
            int numero = leia.nextInt();
            
            // Verifica se o número está no intervalo entre 10 e 150
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }
        
       
        System.out.println("Quantidade de números no intervalo entre 10 e 150: " + contador);
        
        leia.close();
    }
}
