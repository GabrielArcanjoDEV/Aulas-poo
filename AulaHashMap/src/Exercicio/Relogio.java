package Exercicio;

public class Relogio {

        int horas;
        int minutos;
        int segundos;

        public void tick() {
            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;

                if (minutos == 60) {
                    minutos = 0;
                    horas++;

                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }
        }

        public void adicionarSegundos(int n) {
            for (int i = 0; i < n; i++) {
                tick();
                System.out.println(exibirHorario());
            }
        }

        public String exibirHorario() {
            return String.format("%02d:%02d:%02d", horas, minutos, segundos);
        }

        public boolean isMaiorQue(Relogio outro) {
            if (this.horas > outro.horas) return true;
            if (this.horas == outro.horas && this.minutos > outro.minutos) return true;
            if (this.horas == outro.horas && this.minutos == outro.minutos && this.segundos > outro.segundos) return true;
            return false;
        }

        public static void main(String[] args) {

            Relogio r1 = new Relogio();
            r1.horas = 23;
            r1.minutos = 59;
            r1.segundos = 57;

            System.out.println("Horário inicial: " + r1.exibirHorario());
            System.out.println("Adicionando 5 segundos:");

            r1.adicionarSegundos(5);
        }
    }

