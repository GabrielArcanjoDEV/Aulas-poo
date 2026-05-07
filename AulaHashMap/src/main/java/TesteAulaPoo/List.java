package TesteAulaPoo;

import java.util.ArrayList;

public class List<A> {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // adicionar elementos
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        // tamanho do arrey = quantidade de elementos

        int quantidade = numeros.size();

        // recuperar ou acessar elementos

        int primeiro = numeros.get(0);
        int ultimo = numeros.get(quantidade - 1);

        // remover elementos
        numeros.remove(2);

        // apresentar todos os elementos de arrey list
        for (Integer numero : numeros) {
            System.out.println(numero);

        }
        for (int i = 0; i <numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        System.out.println("Aula arreylist");
    }

}