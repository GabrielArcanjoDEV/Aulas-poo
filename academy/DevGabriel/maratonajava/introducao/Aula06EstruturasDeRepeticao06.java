package academy.DevGabriel.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao06 {
    // while, do while, for
    public static void main(String[] args) {
        int count = 12;
        while (count < 10){
            System.out.println(count);
            count += 3;
        }
        do {
            System.out.println("dentro do do-while");
        }while (count <10);

        for (int i =0 ;i < 10; i++){
            System.out.println("for " +i);
        }
    }

}
