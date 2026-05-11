package academy.DevGabriel.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoExercicio2 {
    public static void main(String[] args) {
        // imprima 25 numeros com o inicial 50
        int numerosMax = 50;
        for (int i = 0; i < numerosMax; i++ ) {
            if (i > 25) {
               break;
            }
            System.out.println("o numero digitado sendo ele = " + i + " estão no padrão esperado");
        }
    }
}
