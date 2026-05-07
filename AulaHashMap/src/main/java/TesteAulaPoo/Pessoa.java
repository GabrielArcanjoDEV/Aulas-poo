package TesteAulaPoo;

class Pessoa {
private String nome;
private String sobrenome;
private int idade;
private String sexo;
private String email;
private String telefone;

public Pessoa() {
    this.nome = "";
    this.sobrenome = "";
    this.idade = 0;
    this.sexo = "";
    this.email = "";

    this.telefone = "";
}
public Pessoa(String nome, String sobrenome, int idade, String sexo, String email, String telefone) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.idade = idade;
    this.sexo = sexo;
    this.email = email;
    this.telefone = telefone;
}
    public void setNome(String nome) {
    this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
    }
    public void setIdade(int idade) {
    this.idade = idade;
    }
    public void setSexo(String sexo) {
    this.sexo = sexo;
    }
    public void setEmail(String email) {
    this.email = email;
    }
    public void setTelefone(String telefone) {
    this.telefone = telefone;
    }
    public String getNome() {
    return nome;
    }
    public String getSobrenome() {
    return sobrenome;
    }
    public int getIdade() {
    return idade;
    }
    public String getSexo() {
    return sexo;
    }
    public String getEmail() {
    return email;
    }
    public String getTelefone() {
    return telefone;
    }
}
