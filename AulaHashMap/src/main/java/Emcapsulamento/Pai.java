package Emcapsulamento;

public class Pai {
    private String nome;

    public Pai(String nome) {
        this.nome = nome;
    }
    public Pai() {
        nome = "";
    }
    // get e set
    public String getNome() {
        return nome;
    }
    protected void setNome(String nome) {
        this.nome = nome;
    }
}
