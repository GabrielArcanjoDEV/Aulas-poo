package TesteAulaPoo;
import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.next();


        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();


        System.out.print("Digite seu cpf: ");
        String cpf = sc.next();

        System.out.println("\nOlá " + nome + ", sua idade é " + idade + " e seu CPF é " + cpf);

        sc.close();
    }
}
