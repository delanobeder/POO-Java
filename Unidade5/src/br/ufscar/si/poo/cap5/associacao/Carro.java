package br.ufscar.si.poo.cap5.associacao;

/**
 * Classe Carro
 *
 * @author Delano Medeiros Beder
 */
public class Carro implements Comparable<Carro>{

    /*
     * Declaração dos atributos da classe
     */
    private String marca, cor;
    private int ano;
    private Pessoa dono;

    /* 
     * Declaração do Construtor 
     */
    
    public Carro(String marca, String cor, int ano) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    /*
     * Declaração dos métodos
     */
    // Demais métodos omitidos
    
    @Override
    public int compareTo(Carro o) {
        return this.marca.compareTo(o.marca);
    }

    
    @Override
    public String toString() {
        return marca + " " + cor + " (" + ano + ")";
    }  
}
