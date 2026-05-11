import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        int idade = input.nextInt();

        if (idade >= 60) {
            System.out.println("Você é um idoso.");
        } else if (idade >= 18) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é uma criança/adolescente.");
        }
        System.out.println("Fim da verificação de idade.");
        
        input.close();
    }
}