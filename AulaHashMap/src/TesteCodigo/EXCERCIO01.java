package TesteCodigo;

import java.util.Scanner;

public class EXCERCIO01{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("QuestÃ£o: ");
        int q = sc.nextInt();

        switch (q) {
            case 1 -> questao1();
            case 2 -> questao2();
            case 3 -> questao3();
            case 4 -> questao4();
            case 5 -> questao5();
            case 6 -> questao6();
            case 7 -> questao7();
            case 8 -> questao8();
            case 9 -> questao9();
            case 10 -> questao10();
            case 11 -> questao11();
            case 12 -> questao12();
            case 13 -> questao13();
            case 14 -> questao14();
            case 15 -> questao15();
            case 16 -> questao16();
            default -> System.out.println("QuestÃ£o invÃ¡lida");
        }
    }

    // QuestÃµes
    // Desenvolva cada questÃ£o dentro dos mÃ©todos a seguir
    static void questao1() {
        int idade = sc.nextInt();
        if (idade >= 18){
            System.out.println("Maior");

        }else{
            System.out.println("Menor");
        }

    }

    static void questao2() {
        int numero = sc.nextInt();
        if (numero % 2 == 0){
            System.out.println("Par");

        }else{
            System.out.println("Impar");
        }
    }

    static void questao3() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > y){
            System.out.println("X é Maior");

        } else if (y > x ) {
            System.out.println("Y é Maior");

        }else{
            System.out.println("Os numeros são iguais");
        }
    }

    static void questao4() {
        int celcios = sc.nextInt();
        if (celcios > 20){
            System.out.println("Quente");

        } else if (celcios < 20) {
            System.out.println("Frio");

        }
    }

    static void questao5() {
        double NotaAluno = sc.nextDouble();
        if (NotaAluno >= 6.8){
            System.out.println("Aprovado");

        }else{
            System.out.println("Reprovado");
        }
    }

    static void questao6() {
        double consumo = sc.nextDouble();
        double precoUnitario;

        if (consumo <= 100) {
            precoUnitario = 0.50;
        } else {
            precoUnitario = 0.70;
        }

        double valortotal = consumo * precoUnitario;

        System.out.println("consumo: " + consumo + "KWh");
        System.out.println("Preço por KWh" + precoUnitario);
        System.out.println("Valor total a pagar: " + valortotal);
    }

    static void questao7() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    static void questao8() {
        int soma = sc.nextInt();
        int i = 1;
        while (i <= 100){
            if (i % 2 == 0){
                soma += i;
            }
            i ++;
        }
        System.out.println("soma dos pares: " + soma);
    }

    static void questao9() {
        int numero = sc.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(numero + " x " + j + " = " + (numero * j));
        }
    }

    static void questao10() {
        int num = sc.nextInt();
        boolean Eprimo = true;

        if (num <= 1) Eprimo = false;
        for(int i = 2; i <= Math.sqrt(num); i ++){
            if (num % i ==0){
                Eprimo = false;
                break;
            }
        }
        System.out.println(num + (Eprimo ? "é primo." : "não é primo"));
    }

    static void questao11() {
        String letra = sc.next();

        switch (letra) {
            case "a", "A",
                 "e", "E",
                 "i", "I",
                 "o", "O",
                 "u", "U" ->
                    System.out.println("Vogal");


            default ->
                    System.out.println("Consoante");
        }

    }

    static void questao12() {
        String frase = "Java é top!";
        int contador = 0;

        for (char c : frase.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        System.out.println("A letra 'a' aparece " + contador + " vezes.");

    }

    static void questao13() {
        int[] numeros = {10, 20, 30, 40, 50, 60, 65};
        int busca = 65;
        boolean encontrar = false;

        for (int n : numeros) {
            if (n == busca) {
                encontrar = true;
                break;
            }
        }
        System.out.println("Número encontrado? " + encontrar);
    }

    static void questao14() {
        double[] notas = {8.5, 7.0, 9.2, 6.8, 10.0};
        double somaNotas = 0;

        for (double nota : notas) {
            somaNotas += nota;
        }
        System.out.printf("Média das notas:" + (somaNotas / notas.length));

    }

    static void questao15() {
        String[] frutas = {"Maçã", "Mamão", "Morango", "Uva", "Acerola"};

        System.out.println("Lista de Frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

    static void questao16() {
        String[] frutas = {"Maçã", "Pera", "Morango", "Uva", "Acerola"};

        System.out.println("Frutas que começam com 'M':");

        for (String fruta : frutas) {
            if (fruta.toUpperCase().startsWith("M")) {
                System.out.println(fruta);
            }
        }
    }
}

