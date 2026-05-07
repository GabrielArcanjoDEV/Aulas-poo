package Interfaces;

public class Gato  implements Animal {

    @Override
    public void comunicar() {
        System.out.println("miau");
    }

    @Override
    public void mover() {
        System.out.println("se move lentamente" );
    }
}
