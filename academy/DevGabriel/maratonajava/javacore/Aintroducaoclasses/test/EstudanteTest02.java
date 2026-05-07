package academy.DevGabriel.maratonajava.javacore.Aintroducaoclasses.test;

import academy.DevGabriel.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante02 =new Estudante();
        estudante02.nome = "nobinho";
        estudante02.idade = 46;
        estudante02.sexo = 'M';

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
    }
}
