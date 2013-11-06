package br.ufscar.si.poo.cap2.fluxo;

/**
 * Exemplo sobre o comando de repetição "for"
 *
 * @author Delano Medeiros Beder
 */
public class ExemploContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
