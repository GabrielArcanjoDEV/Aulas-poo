package CodigoPoo;

public class AgendamentoUrgente extends Agendamento {

    private double taxaUrgencia;

    public AgendamentoUrgente(Cliente cliente, Servico servico, Veiculo veiculo, double taxaUrgencia) {
        super(cliente, servico, veiculo);
        this.taxaUrgencia = taxaUrgencia;
    }

    @Override
    public double calcularCusto() {
        return getServico().getPrecoServico() + taxaUrgencia;
    }

    @Override
    public double calcularDesconto() {
        return 0; // não tem desconto
    }
}