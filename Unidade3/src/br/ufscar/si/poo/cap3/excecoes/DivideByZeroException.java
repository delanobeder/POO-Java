package br.ufscar.si.poo.cap3.excecoes;


/**
 * Classe DivideByZeroException
 *
 * @author Delano Medeiros Beder
 */
public class DivideByZeroException extends ArithmeticException {

    public DivideByZeroException() {
        super("O denominador na divisão inteira tem valor zero");
    }
}