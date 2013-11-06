package br.ufscar.si.poo.cap3.relacionamentos;

/**
 * Classe Carro
 *
 * @author Delano Medeiros Beder
 */
public class Carro {

    /*
     * Declaração dos atributos da classe
     */
    private String marca, cor;
    private int ano;
    private Pessoa dono;

    public Carro(String marca, String cor, int ano) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    
    @Override
    public String toString() {
        return marca + " " + cor + " (" + ano + ")";
    } 
}
