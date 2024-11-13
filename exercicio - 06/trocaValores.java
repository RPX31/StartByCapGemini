//Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
//possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
//trocados; 


import java.util.Scanner;


public class trocaValores {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
      
        System.out.print("Informe o valor de A: ");
        int A = leia.nextInt();
        
        System.out.print("Informe o valor de B: ");
        int B = leia.nextInt();
        
        
        int temp = A;  
        A = B;          
        B = temp;       
        
        
        System.out.println("\nValores trocados:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        
        leia.close();
    }
}
