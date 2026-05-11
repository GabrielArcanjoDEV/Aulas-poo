package academy.DevGabriel.maratonajava.javacore.Aintroducaoclasses.test;

import academy.DevGabriel.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante01;
import academy.DevGabriel.maratonajava.javacore.Aintroducaoclasses.dominio.ImpressoraEstudante;

public class estudantetest03 {
    public static void main(String[] args) {
        Estudante01 estudante01 = new Estudante01();
        Estudante01 estudante02 = new Estudante01();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "galo frito";
        estudante01.sexo = 'm';
        estudante01.idade = 12;


        estudante02.nome = "boyka";
        estudante02.sexo = 'm';
        estudante02.idade = 43;

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);


    }
    
}

