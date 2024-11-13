//Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido;
import java.util.Scanner;

public class mesCorrespondente {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados
        Scanner leia = new Scanner(System.in);
        
        // Solicita o número do mês
        System.out.print("Informe o número do mês (1-12): ");
        int mes = leia.nextInt();
        
        // Variável para o nome do mês
        String nomeMes = "";
        
        // Verifica o número do mês e atribui o nome correspondente
        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Março";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;
            default:
                System.out.println("Mês inválido!");
                leia.close();
                return;  // Encerra o programa caso o mês seja inválido
        }
        
       
        System.out.println("Mês correspondente: " + nomeMes);
        
        // Fecha o Scanner
        leia.close();
    }
}
