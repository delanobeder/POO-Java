package br.ufscar.si.poo.cap4;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Classe Testa RandomAcessFile
 *
 * @author Delano Medeiros Beder
 */
public class TesteRAF {

    public static void main(String[] args) throws IOException {

        // Cria um RandomAcessFile e posiciona na posição 0
        RandomAccessFile file = new RandomAccessFile("rand.txt", "rw");

        // Escrevendo no arquivo
        file.writeChar('V'); // um caracter
        file.writeInt(999);  // um inteiro
        file.writeDouble(99.99); // um double

        // Retorna à posição 0
        file.seek(0);
        // Lê do arquivo na ordem em que foi escrito
        System.out.println(file.readChar()); // imprime caracter 'V'
        System.out.println(file.readInt());  // imprime inteiro 999
        System.out.println(file.readDouble()); // imprime double 99.99

        // Posiciona na posição 2
        file.seek(2);
        // Lê o segundo item escrito - o inteiro 999
        System.out.println(file.readInt());

        // Posiciona no fim do arquivo e escreve o booleano true no arquivo
        file.seek(file.length());
        file.writeBoolean(true);

        // Posiciona na posição 4
        file.seek(4);
        // Lê o quarto item escrito - o booleano true
        System.out.println(file.readBoolean());

        // Fecha o arquivo
        file.close();
    }
}