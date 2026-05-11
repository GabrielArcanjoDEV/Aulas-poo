package academy.DevGabriel.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double,float,char,byte, short, long, boolean
        int idade = 155;
        long numerogrande = 200000000;
        double salarioDouble = 20000.0;
        float salarioFloat = 2500.0f;
        byte idadebyte = 10;
        short idadeshort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 63;
        String nome = "gabriel";

        System.out.println(("a IDADE de gabriel Arcanjo é " + idade + " anos"));
        System.out.println((numerogrande));
        System.out.println((salarioDouble));
        System.out.println((salarioFloat));
        System.out.println((idadebyte));
        System.out.println((idadeshort));
        System.out.println((verdadeiro));
        System.out.println((falso));
        System.out.println((caractere));
        System.out.println("oi meu nome é " + nome);
    }
}