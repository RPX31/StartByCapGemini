//Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
// dos dois números lidos;
import java.util.Scanner;
public class operacoesAritmeticas
{
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite primeiro numero");
		int numero1 = leia.nextInt();
		System.out.println("Digite primeiro numero");
		int numero2 = leia.nextInt();
		
		
		System.out.println("Resultado da soma é: " + (numero1 + numero2));
		System.out.println("Resultado da Subtração é: " + (numero1 - numero2));
		System.out.println("Resultado da multiplicação é: " + (numero1 * numero2));
		System.out.println("Resultado da divisão é: " + (numero1 / numero2));
		System.out.println("Resultado da  resto da divisão é: " + (numero1 % numero2));

		leia.close;
	}
}