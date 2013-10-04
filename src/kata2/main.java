package kata2;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        
        int[] vector = new int[54];
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
        for (int i = 0; i < vector.length; i++) {
             vector[i] = (int)(Math.random()*100);
             
        }
        System.out.println("Tras una encuesta para saber la edad de la población se han recogido las siguientes edades: ");
        
        for (Integer value : vector) {
            System.out.println(value);
            
        }
        System.out.println("Los que están jubilados tienen: ");
        for (Integer value : vector) {
            if (value > 57) 
                System.out.println(value + " años");
        }
    }
}
