package teste;

import vetor.Lista;

public class Aula11 {

    public static void main(String[] args) throws Exception {

        Lista<Contato> vetor = new Lista<>(1);

        Contato c1 = new Contato("Contato 1", "1234-5678", "j1@j.com");

        vetor.adiciona(c1);

    }
}
