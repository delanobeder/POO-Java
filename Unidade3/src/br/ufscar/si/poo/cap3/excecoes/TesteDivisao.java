package br.ufscar.si.poo.cap3.excecoes;


/**
 * Classe TesteDivisao
 *
 * @author Delano Medeiros Beder
 */
public class TesteDivisao {

    public double divisao(double num, int den) throws DivideByZeroException {
        if (den == 0) {
            throw new DivideByZeroException();
        }
        return num / den;
    }

    public void usaDivisao(double x, int y) throws DivideByZeroException {
        try {
            divisao(x, y);
        } catch (DivideByZeroException dbze) {
            throw dbze;
        }
    }
}
