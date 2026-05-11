package Exercicio;

public class Circulo {

        double raio;

        public double calcularArea() {
            return Math.PI * raio * raio;
        }

        public double calcularCircunferencia() {
            return 2 * Math.PI * raio;
        }

        public boolean contemOutro(Circulo outro) {
            return this.raio > outro.raio;
        }

        public Circulo maior(Circulo outro) {
            if (this.raio > outro.raio) {
                return this;
            } else {
                return outro;
            }
        }

        public void exibirDados() {
            System.out.println("Raio: " + String.format("%.2f", raio));
            System.out.println("Área: " + String.format("%.2f", calcularArea()));
            System.out.println("Circunferência: " + String.format("%.2f", calcularCircunferencia()));
            System.out.println("----------------------------");
        }

        public static void main(String[] args) {


            Circulo c1 = new Circulo();
            c1.raio = 5.0;

            System.out.println("Primeiro círculo:");
            c1.exibirDados();

            c1.raio = c1.raio * 2;

            System.out.println("Após dobrar o raio:");
            c1.exibirDados();

            Circulo c2 = new Circulo();
            c2.raio = 3.0;

            if (c1.contemOutro(c2)) {
                System.out.println("O primeiro círculo contém o segundo.");
            } else if (c2.contemOutro(c1)) {
                System.out.println("O segundo círculo contém o primeiro.");
            } else {
                System.out.println("Os círculos têm o mesmo raio.");
            }


            Circulo maior = c1.maior(c2);
            System.out.println("O maior círculo tem raio: " + maior.raio);
        }
    }

