package teste;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) throws Exception {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");
        if (existe) {
            System.out.println("Elemento existe no arrayList");
        } else {
            System.out.println("Elemento não existe no arrayList");
        }

        int pos = arrayList.indexOf("B");
        if (pos > -1) {
            System.out.println("Elemento existe no arrayList na posicao " + pos);
        } else {
            System.out.println("Elemento não existe no arrayList na posicao " + pos);
        }

        System.out.println(arrayList.get(3));

        arrayList.remove(1);

    }

}
