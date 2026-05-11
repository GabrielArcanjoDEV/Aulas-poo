package academy.DevGabriel.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        byte dia = 1;
        switch (dia){
            case 1:
                System.out.println("Domingo, final de semana");
                break;
            case 2:
                System.out.println("Segunda, dia util");
                break;
            case 3:
                System.out.println("Terça, dia util");
                break;
            case 4:
                System.out.println("Quarta, dia util");
                break;
            case 5:
                System.out.println("Quinta, dia util");
                break;
            case 6:
                System.out.println("Sexta, dia util");
                break;
            case 7:
                System.out.println("Sabado, Final de semana");
                break;
            default:
                System.out.println("numero digitado não condiz com o dia da semana");
                break;


        }
    }
}
