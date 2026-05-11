package CodigoPoo;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Antonio", "83996895015");
        Servico servico = new Servico("Troca de óleo", 250.0);
        Veiculo veiculo = new Veiculo("ABC-1234", "Gol", 2020);

        Agendamento urgente = new AgendamentoUrgente(cliente, servico, veiculo, 50);
        Agendamento retorno = new AgendamentoRetorno(cliente, servico, veiculo);

        Oficina oficina = new Oficina();
        oficina.adicionar(urgente);
        oficina.adicionar(retorno);

        oficina.gerarRelatorio();
    }
}