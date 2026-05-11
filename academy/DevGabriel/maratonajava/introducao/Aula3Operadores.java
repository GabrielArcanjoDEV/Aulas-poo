package academy.DevGabriel.maratonajava.introducao;

public class Aula3Operadores {
    public static void main(String[] args) {
        // * - + /
        int numero1 = 10;
        double numero2 = 20;
        double resultado = numero1 / numero2;

        System.out.println("o resultado é " + resultado);
        // RESTO %

        int resto = 20 % 2;
        System.out.println(resto);

        // < > , <= >=, ==, !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferentelVinte = 10 != 20;
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferentelVinte);
        // && (AND) || (OR) ! (NOT)


        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMenorQueTrinta);
        System.out.println(isDentroDaLeiMaiorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorplaytation = 5000f;


        boolean isPlaytantionCincoCompravel = valorTotalContaCorrente > valorplaytation ||  valorTotalContaPoupança > valorplaytation;
        System.out.println(isPlaytantionCincoCompravel);
        // += -= /= %= *=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 500;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);
        int contador = 0;
        contador += 1;
        contador++; // primeiro roda o contador depois adiciona
        contador--;
        --contador; // primeiro adiciona, depois roda
        ++contador;
        System.out.println(contador);


    }

}
