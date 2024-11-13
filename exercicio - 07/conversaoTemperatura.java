//Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
//conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius; 
import java.util.Scanner;

public class conversaoTemperatura {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
       
        System.out.print("Informe a temperatura em graus Celsius: ");
        double celsius = leia.nextDouble();
        
        
        double fahrenheit = (9 * celsius + 160) / 5;
        
        
        System.out.printf("A temperatura em Fahrenheit é: %.2f°F\n", fahrenheit);
        
        leia.close();
    }
}
