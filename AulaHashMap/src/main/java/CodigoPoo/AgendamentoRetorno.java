package CodigoPoo;

public class AgendamentoRetorno extends Agendamento {

    public AgendamentoRetorno(Cliente cliente, Servico servico, Veiculo veiculo) {
        super(cliente, servico, veiculo);
    }

    @Override
    public double calcularCusto() {
        return getServico().getPrecoServico();
    }

    @Override
    public double calcularDesconto() {
        return calcularCusto() * 0.15; // 15%
    }
}