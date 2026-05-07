package academy.DevGabriel.maratonajava.javacore.Aintroducaoclasses.test;

import academy.DevGabriel.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro01 = new Carro();

        carro01.nome = "toyota civic";
        carro01.modelo = "toyota";
        carro01.ano = 2001;
        System.out.println("o nome do carro é: " + carro01.nome + " seu modelo é: " + carro01.modelo +" seu ano de fabricação é: " + carro01.ano);

        Carro carro02 = new Carro();

        carro02.nome = "maclarem sena";
        carro02.modelo = "maclarem";
        carro02.ano = 2019;
        System.out.println("o nome do carro é: " + carro02.nome + " seu modelo é: " + carro02.modelo +" seu ano de fabricação é: " + carro02.ano);
    }
}
