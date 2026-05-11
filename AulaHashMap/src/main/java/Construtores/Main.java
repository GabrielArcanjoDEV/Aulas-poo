package Construtores;

public class Main {
    public static void main(String[] args) {
        Professor p = new Professor();

        System.out.println("Seja bem vindo a aula");

        System.out.println(p.getNome());
        System.out.println(p.getIdade());
        System.out.println(p.getCpf());
        System.out.println(p.getSalario());
    }
}
