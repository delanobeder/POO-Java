package br.ufscar.si.poo.cap2.fluxo;

/**
 * Exemplo sobre o comando de seleção "if"
 *
 * @author Delano Medeiros Beder
 */
public class ExemploIf {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println("Valores: " + a + "," + b + "," + c);
        int maior;
        if (a > b & a > c) {
            maior = a;
        } else if (b > c) {
            maior = b;
        } else {
            maior = c;
        }

        System.out.println("Maior é " + maior);
    }
}
