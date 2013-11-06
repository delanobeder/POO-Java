package br.ufscar.si.poo.cap4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * Exemplo de código que utiliza FileInputStream + InputStreamReader +
 * BufferedReader para ler e imprimir o conteúdo de um arquivo. É importante
 * salientar que leitura é bufferizada. Dessa forma, é possível ler vários
 * caracteres (String) em um único acesso ao disco.
 *
 * @author Delano Medeiros Beder
 */
public class TesteReader {

    public static void main(String[] args) throws IOException {
        FileInputStream is = new FileInputStream("entrada.txt");
        InputStreamReader isr = new InputStreamReader(is);
        LineNumberReader br = new LineNumberReader(isr);

        String s = br.readLine();

        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }
        
        System.out.println();
        System.out.println("Foram lidas " + br.getLineNumber() + " linhas.");
    }
}