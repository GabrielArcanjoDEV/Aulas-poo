package Exercicio;

public class Estudante {

        String nome;
        String matricula;
        double[] notas;

        public Estudante(String nome, String matricula, double... notas) {
            this.nome = nome;
            this.matricula = matricula;
            this.notas = notas;
        }

        public double getMedia() {
            if (notas.length == 0) {
                return 0;
            }

            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }

            return soma / notas.length;
        }

        public void setNotas(double... notas) {
            this.notas = notas;
        }

        public double getNota(int indice) {
            if (indice >= 0 && indice < notas.length) {
                return notas[indice];
            }
            return -1;
        }

        public String getSituacao() {
            double media = getMedia();

            if (media >= 70) {
                return "Aprovado";
            } else if (media >= 50) {
                return "Final";
            } else {
                return "Reprovado";
            }
        }

        public void imprimirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.println("Média: " + getMedia());
            System.out.println("Situação: " + getSituacao());
            System.out.println("------------------------");
        }

        public static void main(String[] args) {

            Estudante e1 = new Estudante("Gabriel", "2026001", 80, 75, 90);
            Estudante e2 = new Estudante("Maria", "2026002", 60, 55, 58);
            Estudante e3 = new Estudante("João", "2026003", 40, 45, 50);

            e1.imprimirInformacoes();
            e2.imprimirInformacoes();
            e3.imprimirInformacoes();

            System.out.println("Nota 1 de Gabriel: " + e1.getNota(0));
            System.out.println("Nota inválida: " + e1.getNota(10));
        }
    }

