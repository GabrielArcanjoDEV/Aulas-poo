package CodigoPoo;

public abstract class Agendamento {

    private Cliente cliente;
    private Servico servico;
    private Veiculo veiculo;

    public Agendamento(Cliente cliente, Servico servico, Veiculo veiculo) {
        this.cliente = cliente;
        this.servico = servico;
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public abstract double calcularCusto();

    public abstract double calcularDesconto();

    public double calcularCustoTotal() {
        return calcularCusto() - calcularDesconto();
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente +
                "\nServico: " + servico +
                "\nVeiculo: " + veiculo +
                "\nCusto final: " + calcularCustoTotal() + "\n";
    }
}