import java.util.Scanner;

public class notaAluno {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        System.out.print("Informe o nome do aluno: ");
        String nome = leia.nextLine();
        
        
        System.out.print("Informe a primeira nota: ");
        double nota1 = leia.nextDouble();
        
        System.out.print("Informe a segunda nota: ");
        double nota2 = leia.nextDouble();
        
        System.out.print("Informe a terceira nota: ");
        double nota3 = leia.nextDouble();
        
        
        double media = (nota1 + nota2 + nota3) / 3;
        
       
        System.out.printf("Nome do aluno: %s\n", nome);
        System.out.printf("Média do aluno: %.2f\n", media);
        
        // Determina a menção com base na média
        if (media >= 7) {
            System.out.println("Menção: Aprovado");
        } else if (media <= 5) {
            System.out.println("Menção: Reprovado");
        } else {
            System.out.println("Menção: Recuperação");
        }
        
        leia.close();
    }
}
