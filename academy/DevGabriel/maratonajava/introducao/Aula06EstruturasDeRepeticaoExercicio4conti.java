package academy.DevGabriel.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoExercicio4conti {
    public static void main(String[] args) {
        double valortotal = 30000;
        for (int parcela = 0; parcela <= valortotal; parcela++) {
            double valorparcela = valortotal / parcela;
            if (valorparcela < 1000) {
                continue;
            }
            System.out.println("parcela " + parcela + "R$ " + valorparcela);

        }
    }
}
