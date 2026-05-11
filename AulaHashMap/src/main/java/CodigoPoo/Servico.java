package CodigoPoo;

public class Servico {
    private String nomeServico;
    private double precoServico;

    public Servico(String nomeServico, double precoServico) {
        this.nomeServico = nomeServico;
        this.precoServico = precoServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public double getPrecoServico() {
        return precoServico;
    }

    @Override
    public String toString() {
        return nomeServico + " (R$ " + precoServico + ")";
    }
}