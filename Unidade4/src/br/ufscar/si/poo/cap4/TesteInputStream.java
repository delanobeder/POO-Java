package br.ufscar.si.poo.cap4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Exemplo de código que utiliza InputStream e suas subclasses para ler a partir
 * de um arquivo de entrada ou teclado. O teclado (System.in) é "mapeado" em 
 * java como um  InputStream. É importante  salientar que leitura,  nesse 
 * programa, é bufferizada.  Dessa forma, é possível ler vários bytes em um 
 * único acesso ao dispositivo de entrada.
 * 
 * @author Delano Medeiros Beder
 */
public class TesteInputStream {

    public static void readStream (InputStream is) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(is);
        int i = bis.read();
        while (i != -1) {
            System.out.print((char) i);
            i = bis.read();
        }
        System.out.println();
    }
    
    public static void main(String[] args) throws IOException {

        InputStream is;

        if (args.length == 0) {
            is = System.in; // Lê do teclado
        } else {
            is = new FileInputStream(args[0]); // Lê de um arquivo
        }
        
        readStream(is);
        is.close();
    }
}
