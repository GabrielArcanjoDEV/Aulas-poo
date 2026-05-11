package academy.DevGabriel.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};
        int[] numeros3 = new int[]{10,9,8,7,6,5,4,3,2,1};

        for (int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        for (int num : numeros3){
            System.out.println(num);
        }
    }
}
