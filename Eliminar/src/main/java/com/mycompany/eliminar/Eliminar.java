
package com.mycompany.eliminar;

import java.util.ArrayList;
import java.util.List;


public class Eliminar {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>(List.of(1, 3, 2, 5, 4, 6, 7, 3, 3, 8, 9, 3, 9));

        System.out.println(numeros);

        numeros.remove(Integer.valueOf(3));

        System.out.println(numeros);

        while (numeros.contains(3)) {
            numeros.remove(Integer.valueOf(3));
        }

        System.out.println(numeros);

    }
}
