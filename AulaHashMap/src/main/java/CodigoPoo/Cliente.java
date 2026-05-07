package CodigoPoo;

public class Cliente {
    private String nomeCliente;
    private String telefoneCliente;

    public Cliente(String nomeCliente, String telefoneCliente) {
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    @Override
    public String toString() {
        return nomeCliente + " (Tel: " + telefoneCliente + ")";
    }
}