package br.ufscar.si.poo.cap4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Exemplo  de   código  que  utiliza   InputStream  (e  suas   subclasses) e 
 * OutputStream (e suas subclasses) para realizar a cópia de um arquivo de 
 * entrada. Ou seja, um  arquivo de entrada é lido e seu  conteúdo é escrito em
 * um arquivo de  saída. É importante  salientar que a leitura e a escrita, 
 * nesse programa, são bufferizadas.  Dessa forma, é possível ler/escrever 
 * vários bytes em um único acesso ao dispositivo de entrada/saída.
 * 
 * @author Delano Medeiros Beder
 */
public class CopiaBytes {

    public static void main(String[] args) throws IOException {

        FileInputStream is = new FileInputStream("entrada.txt");
        BufferedInputStream bis = new BufferedInputStream(is);

        FileOutputStream os = new FileOutputStream("saida.txt");
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int i = bis.read();
        while (i != -1) {
            bos.write((char) i);
            i = bis.read();
        }
        bis.close();
        bos.close();
    }
}
