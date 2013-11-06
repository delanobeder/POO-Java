package br.ufscar.si.poo.cap3.conta;

/**
 * Classe Conta Corrente
 *
 * @author Delano Medeiros Beder
 */
public class ContaChequeEspecial extends Conta {
    /*
     * Declaração dos atributos da classe
     */

    private float credito; // Atributo da classe que representa o crédito disponível

    /*
     * Construtor da classe
     */
    public ContaChequeEspecial(float saldo, float credito) {
        super(saldo);
        this.credito = credito;
    }

    /*
     * Declaração dos métodos da classe
     */
    @Override
    public boolean saque(float valor) {
        boolean ok = false;
        if (saldo + credito >= valor) {
            saldo -= valor; // saldo = saldo - valor
            ok = true;
        }
        return ok;
    }
}