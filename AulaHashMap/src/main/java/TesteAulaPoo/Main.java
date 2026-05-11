package TesteAulaPoo;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("gabriel", "arcanjo", 18, "m", "gvuhucbhbc", "255985229589");
        p2.setNome("miguel");
        p2.setSobrenome("araujo");
        p2.setIdade(86);
        p2.setTelefone("255985229589");
        p2.setEmail("gvuhucbhbc");
        p2.setSexo("m");
        System.out.println(p2.getNome());
        System.out.println(p2.getSobrenome());
        System.out.println(p2.getIdade());
        System.out.println(p2.getTelefone());
        System.out.println(p2.getEmail());
        System.out.println(p2.getSexo());
    }
}
