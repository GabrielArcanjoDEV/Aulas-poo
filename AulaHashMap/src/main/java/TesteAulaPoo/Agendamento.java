package TesteAulaPoo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agendamento {
//    Crie a classe Agendamento para o sistema de uma oficina mecânica.
//    Um agendamento pode ser criado de três formas:
//            1. Sem nenhum dado — agendamento em branco para ser preenchido depois
//2. Com nome do cliente — cliente identificado, serviço e data ainda indefinidos
//3. Com nome do cliente, nome do serviço e data — agendamento completo
//    Use this() para que os construtores mais simples deleguem para o mais completo.

    private String nomeCliente;
    private String servico;
    private LocalDateTime data;

    public Agendamento() {
        this("Cliente indefinido");
    }

    public Agendamento(String nomeCliente) {
        this(nomeCliente, null, LocalDateTime.now());
    }

    public Agendamento(String nomeCliente, String servico, LocalDateTime data) {
        this.nomeCliente = nomeCliente;
        this.servico = servico;
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");
        return String.format("Cliente: %s, Serviço: %s, Data: %s",
                nomeCliente, servico, df.format(data));
    }

    static void main() {
        Agendamento a1 = new Agendamento();
        Agendamento a2 = new Agendamento("Antonio");
        Agendamento a3 = new Agendamento("Antonio", "Balanceamento", LocalDateTime.of(2026, 4, 6, 0, 0));

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
