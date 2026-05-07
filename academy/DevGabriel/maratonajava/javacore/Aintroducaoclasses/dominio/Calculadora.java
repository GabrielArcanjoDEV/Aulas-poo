package academy.DevGabriel.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Calculadora {
    public static void main(String[] args) {

    }

    public void alterarDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("dentro do Alteradoisnumeros");
        System.out.println("num1 " + numero1);
        System.out.println("num2 " + numero2);
    }
    public void somaArrey ( int[] numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
        System.out.println(soma);

    }
    public double divideDoisNumeros(double numero1, double numero2){
        return numero1/numero2;
    }
}
