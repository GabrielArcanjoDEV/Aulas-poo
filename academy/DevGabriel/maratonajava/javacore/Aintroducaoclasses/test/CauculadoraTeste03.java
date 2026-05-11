package academy.DevGabriel.maratonajava.javacore.Aintroducaoclasses.test;

import academy.DevGabriel.maratonajava.javacore.Aintroducaoclasses.dominio.Calculadora;

public class CauculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5,};
        calculadora.somaArrey(numeros);

        calculadora.somaVarArgs(1,2,3,4,5);



    }

}
