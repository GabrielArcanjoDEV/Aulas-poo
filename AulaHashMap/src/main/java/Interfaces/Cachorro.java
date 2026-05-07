package Interfaces;

public class Cachorro implements Animal {
    @Override
    public void comunicar() {
        System.out.println("auau");
    }

    @Override
    public void mover() {
        System.out.println("Correndo feito louco");
    }
}
