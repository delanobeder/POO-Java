package br.ufscar.si.poo.cap2.fluxo;

import java.util.Scanner;

/**
 * Exemplo sobre o comando de repetição "for"
 *
 * @author Delano Medeiros Beder
 */
public class ExemploFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma = soma + i;
            // soma += i;
        }

        System.out.println("A soma dos " + n + " primeiros números inteiros é " + soma);
    }
}
