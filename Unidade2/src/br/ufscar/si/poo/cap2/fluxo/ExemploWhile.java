package br.ufscar.si.poo.cap2.fluxo;

import java.util.Scanner;

/**
 * Exemplo sobre o uso do comando de repetição "while"
 *
 * @author Delano Medeiros Beder
 */
public class ExemploWhile {

    public static void main(String[] args) {

        // Encontrar a potência de 2 que é maior que um número digitado (positivo)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        int x = 1;
        while (x < n) {
            x = x * 2;
        }

        System.out.println("A 1a potência de 2 maior ou igual que " + n + " é " + x);
    }
}
