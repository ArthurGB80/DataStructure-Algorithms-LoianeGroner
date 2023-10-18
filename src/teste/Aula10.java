package teste;

import vetor.VetorObjetos;

public class Aula10 {

    public static void main(String[] args) throws Exception {

        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "1234-5678", "j1@j.com");
        Contato c2 = new Contato("Contato 2", "5555-5555", "j2@j.com");
        Contato c3 = new Contato("Contato 3", "6666-6666", "j3@j.com");

        Contato c4 = new Contato("Contato 3", "6666-6666", "j3@j.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(c1);
        if (pos > -1) {
            System.out.println("Contato encontrado na posicao " + pos);
        } else {
            System.out.println("Contato nao encontrado");
        }

        System.out.println(vetor);
    }

}
