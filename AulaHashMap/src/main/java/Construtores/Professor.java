package Construtores;

public class Professor {
    // atributos
    private String nome;
    private int idade;
    private float salario;
    private String cpf;

    public Professor() {
        nome = "Miguel dos Santos";
        idade = 38;
        salario = 4000;
        cpf = "108.802.974-41";
    }
    public Professor(String nome, int idade, float salario, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public float getSalario() {
        return salario;
    }
    public String getCpf() {
        return cpf;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
