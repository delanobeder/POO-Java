package br.ufscar.si.poo.cap2.fluxo;

import java.util.Scanner;

/**
 * Exemplo sobre o comando de repetição "do..while"
 *
 * @author Delano Medeiros Beder
 */
public class ExemploDoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte n;
        do {
            System.out.print("Digite um número entre 1 e 10: ");
            n = scanner.nextByte();
        } while (n < 1 || n > 10);
    }
}
