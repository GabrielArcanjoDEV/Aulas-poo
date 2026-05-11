package CodigoPoo;

import java.util.ArrayList;
import java.util.List;

public class Oficina {

    private List<Agendamento> agendamentos = new ArrayList<>();

    public void adicionar(Agendamento a) {
        agendamentos.add(a);
    }

    public void gerarRelatorio() {
        for (Agendamento a : agendamentos) {
            System.out.println(a);
        }
    }
}