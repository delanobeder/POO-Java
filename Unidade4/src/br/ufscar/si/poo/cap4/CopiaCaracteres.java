package br.ufscar.si.poo.cap4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Exemplo  de   código  que  utiliza   Reader  (e  suas   subclasses) e 
 * Writer (e suas subclasses) para realizar a cópia de um arquivo de 
 * entrada. Ou seja, um  arquivo de entrada é lido e seu  conteúdo é escrito em
 * um arquivo de  saída. É importante  salientar que a leitura e a escrita, 
 * nesse programa, são bufferizadas.  Dessa forma, é possível ler/escrever 
 * vários bytes em um único acesso ao dispositivo de entrada/saída.
 * 
 * @author Delano Medeiros Beder
 */
public class CopiaCaracteres {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("entrada.txt");
        BufferedReader br = new BufferedReader(fr);
        
        FileWriter fw = new FileWriter("saida.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        String s = br.readLine();
        while (s != null) {
            bw.write(s);
            bw.write("\n");
            s = br.readLine();
        }
        
        br.close();
        bw.close();
    }
}