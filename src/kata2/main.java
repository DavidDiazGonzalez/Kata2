package kata2;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println("De la lista: ");
        for (Integer value : list) {
            System.out.println(value);
        }
        ArrayList<Integer> listaPares = new ArrayList<>();
        for (Integer value : list) {
            if (value % 2 == 0) {
                listaPares.add(value);
            }
        }
        for (Integer value : listaPares) {
            System.out.println("Los numeros pares son: " + value);
        }
    }
}
