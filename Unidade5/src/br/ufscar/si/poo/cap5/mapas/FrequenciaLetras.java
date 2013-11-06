package br.ufscar.si.poo.cap5.mapas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Classe FrequenciaLetras
 * 
 * @author Delano Medeiros Beder
 */
public class FrequenciaLetras {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new FileInputStream("texto.txt"));
        
        Map<Character, Integer> mapa = new TreeMap<Character, Integer>();

        while (sc.hasNext()) {
            String s = sc.next();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetter(c)) {
                    c = Character.toUpperCase(c);
                    Integer qtde = mapa.get(c);
                    if (qtde != null) {
                        qtde = qtde + 1;
                    } else {
                        qtde = 1;
                    }
                    mapa.put(c, qtde);
                }
            }
        }

        Iterator<Entry<Character, Integer>> it = mapa.entrySet().iterator();

        int i = 1;
        while (it.hasNext()) {
            Entry<Character, Integer> entry = it.next();
            System.out.print(entry.getKey() + " " + entry.getValue() + "\t");
            if (i % 5 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}