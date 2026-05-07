package CodigoPoo;

public class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;

    public Veiculo(String placa, String modelo, int anoFabricacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return modelo + " - " + placa + " (" + anoFabricacao + ")";
    }
}