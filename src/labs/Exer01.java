package labs;

import vetor.Lista;

public class Exer01 {

    public static void main(String[] args) throws Exception {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("E"));

    }

}
