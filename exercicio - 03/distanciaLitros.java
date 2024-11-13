//Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
//total percorrida pelo automóvel e o total de combustível gasto;
import java.util.Scanner;
public class distanciaLitros{
	public static void main(String[] args) {
	    
		 Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe a distância total percorrida (em km): ");
        double distancia = leia.nextDouble();
        
        System.out.print("Informe o total de combustível gasto (em litros): ");
        double combustivelGasto = leia.nextDouble();
        
        double consumoMedio = 0;
        
        if (combustivelGasto > 0){
        
         consumoMedio = distancia / combustivelGasto;
        }
        else{
            System.out.println("Voce está sem gasolina!");
        }
        
        
        System.out.printf("O consumo médio do automóvel é: %.2f km/l%n", consumoMedio);
        
        leia.close();
	}
}