package academy.DevGabriel.maratonajava.javacore.Aintroducaoclasses.test;

import academy.DevGabriel.maratonajava.javacore.Aintroducaoclasses.dominio.Calculadora;

public class Calculadora04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;

        calculadora.alterarDoisNumeros(a, b);
        System.out.println(b);
        System.out.println(a);

    }
}
