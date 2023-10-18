package teste;

import vetor.Vetor;

public class Aula09 {

    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

        System.out.println("Remover o elemento A");

        int pos = vetor.busca("A");
        if (pos > -1){
            vetor.remove(pos);
        } else {
            System.out.println("Elemento não existe no vetor");
        }
        System.out.println(vetor);
    }
}
