package br.ufscar.si.poo.cap4;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Exemplo de código que utiliza Scanner e PrintStream para ler a partir do
 * teclado e escrever em um arquivo.
 *
 * O teclado (System.in) é "mapeado" em java como um InputStream. O console
 * (System.out) é "mapeado" em java como um OutputStream.
 *
 * A classe Scanner facilita a leitura de Streams pois possui uma série de
 * métodos que permite a leitura de diferentes tipos de dados (booleanos,
 * doubles, inteiros, etc).
 *
 * A classe PrintStream facilita a escrita de Streams pois possui uma série de
 * métodos que permite a escrita de diferentes tipos de dados (booleanos,
 * doubles, inteiros, etc).
 * @author Delano Medeiros Beder
 */
public class EntradaSaida {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        //PrintStream ps = new PrintStream("saida.txt");
        // Sugestão: comente a linha anterior e utilize a próxima
        // e veja o comportamento. Ao invés de gravar em um arquivo
        // o resultado é impresso no console (tela).
        PrintStream ps = System.out;
        String s = sc.nextLine();
        while (!s.equals("sai")) {
            ps.println(s);
            s = sc.nextLine();
        }
    }
}