package br.ufscar.si.poo.cap5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algoritmos {

    public static void main(String[] args) {

        Integer array[] = {9, 1, 2, 8, 7, 3, 4, 6, 5};

        List<Integer> lista = Arrays.asList(array);

        System.out.println(lista);

        System.out.println(Collections.min(lista));

        System.out.println(Collections.max(lista));

        Collections.rotate(lista, 3);

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);

        System.out.println(Collections.binarySearch(lista, 3));

        Collections.sort(lista, Collections.reverseOrder());

        System.out.println(lista);
    }
}
