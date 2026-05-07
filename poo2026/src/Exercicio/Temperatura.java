package Exercicio;

public class Temperatura {

    private double valor;
    private String escala;

    // Construtor
    public Temperatura(double valor, String escala) {

        if (!escala.equals("C") && !escala.equals("F") && !escala.equals("K")) {
            System.out.println("Escala inválida");
            return;
        }

        if (escala.equals("K") && valor < 0) {
            System.out.println("Erro: Temperatura em Kelvin não pode ser negativa.");
            return;
        }

        this.valor = valor;
        this.escala = escala;
    }

    // Convertendo para Celsius
    public Temperatura toCelsius() {

        if (escala.equals("C")) {
            return new Temperatura(valor, "C");
        }

        if (escala.equals("F")) {
            return new Temperatura((valor - 32) * 5 / 9, "C");
        }

        // de kelvin pra celcios
        return new Temperatura(valor - 273.15, "C");
    }

    // Convertendo para Fahrenheit
    public Temperatura toFahrenheit() {

        if (escala.equals("F")) {
            return new Temperatura(valor, "F");
        }

        if (escala.equals("C")) {
            return new Temperatura((valor * 9 / 5) + 32, "F");
        }

        // de Kelvin para Fahrenheit
        return new Temperatura((valor - 273.15) * 9 / 5 + 32, "F");
    }

    // Convertendo pra Kelvin
    public Temperatura toKelvin() {

        if (escala.equals("K")) {
            return new Temperatura(valor, "K");
        }

        if (escala.equals("C")) {
            double k = valor + 273.15;
            if (k < 0) {
                System.out.println("Erro: Temperatura em Kelvin não pode ser negativa.");
            }
            return new Temperatura(k, "K");
        }

        // de Fahrenheit pra, Kelvin
        double k = (valor - 32) * 5 / 9 + 273.15;
        if (k < 0) {
            System.out.println("Erro: Temperatura em Kelvin não pode ser negativa.");
        }
        return new Temperatura(k, "K");
    }

    // Imprimindo temperatura
    public void imprimeComEscala() {
        System.out.println(valor + "° " + escala);
    }


    public static void main(String[] args) {

        Temperatura temp = new Temperatura(25, "C");

        Temperatura emC = temp.toCelsius();
        Temperatura emF = temp.toFahrenheit();
        Temperatura emK = temp.toKelvin();

        System.out.println("Temperatura original:");
        temp.imprimeComEscala();

        System.out.println("Convertida para Celsius:");
        emC.imprimeComEscala();

        System.out.println("Convertida para Fahrenheit:");
        emF.imprimeComEscala();

        System.out.println("Convertida para Kelvin:");
        emK.imprimeComEscala();
    }
}