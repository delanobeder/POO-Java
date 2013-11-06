package br.ufscar.si.poo.cap4;

import java.io.File;

/**
 * Classe ListaDiretório
 *
 * @author Delano Medeiros Beder
 */
public class ListaDiretório {

    public static void main(String args[]) {

        String nomeDir = args[0];
        File f1 = new File(nomeDir);
        if (f1.isDirectory()) {
            System.out.println("Diretório " + nomeDir);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(nomeDir + "/" + s[i]);
                System.out.print(s[i]);
                if (f.isDirectory()) {
                    System.out.println(" <dir> ");
                } else {
                    System.out.println(" <file>");
                }
            }
        } else {
            System.out.println(nomeDir + " não é um diretório.");
        }
    }
}
