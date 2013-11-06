package br.ufscar.si.poo.cap4;

import java.io.Serializable;

/**
 * Classe Conta Corrente
 *
 * @author Delano Medeiros Beder
 */
public class Conta implements Serializable {
    /*
     * Declaração dos atributos da classe
     */

    protected float saldo; // Atributo da classe que representa o saldo da conta
    private static int quantidade; // Armazena a quantidade de contas criadas

    /*
     * Construtor da classe
     */
    public Conta() {
        Conta.quantidade++;
    }

    public Conta(float saldo) {
        Conta.quantidade++;
        this.saldo = saldo;
    }

    /*
     * Declaração dos métodos da classe
     */
    public float getSaldo() {
        return saldo;
    }

    public void deposito(float valor) {
        saldo += valor; // saldo = saldo + valor
    }

    public boolean saque(float valor) {
        boolean ok = false;
        if (saldo >= valor) {
            saldo -= valor; // saldo = saldo - valor
            ok = true;
        }
        return ok;
    }

    public static int getQuantidade() {
        return Conta.quantidade;
    }
}