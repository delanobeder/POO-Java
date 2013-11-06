package br.ufscar.si.poo.cap4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Exemplo de programa que lê dois inteiros x e y (digitados pelo teclado) e
 * imprime a soma deles
 *
 * @author Delano Medeiros Beder
 */
public class EntradaSoma {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner(new FileInputStream("soma.txt"));
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x + " + " + y + " = " + (x + y));
    }
}