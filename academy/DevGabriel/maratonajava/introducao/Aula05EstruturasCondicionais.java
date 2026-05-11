package academy.DevGabriel.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("pode tomar uma");

        }else{
            System.out.println("não pode beber criança kkk");
        }
    }

}