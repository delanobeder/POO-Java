package br.ufscar.si.poo.cap5.associacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe Pessoa
 *
 * @author Delano Medeiros Beder
 */
public class Pessoa {

    /*
     * Declaração dos atributos da classe
     */
    private String CPF, nome;
    private List<Carro> carros;

    /* 
     * Declaração do Construtor
     */
    
    public Pessoa(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
        this.carros = new ArrayList<Carro>();
    }

    /*
     * Declaração dos métodos 
     */
    
    // Demais métodos omitidos
    
    public void adicionaCarro(Carro c) {
        carros.add(c);
    }

    public void removeCarro(Carro c) {
        carros.remove(c);
    }
    
    public void imprimeCarros() {
        Collections.sort(carros);
        for (Carro c: carros) {
            System.out.println(c);
        }
    }
    
    public static void main(String[] args) {
        Pessoa josé = new Pessoa("0123456789", "Fulano de Tal");
        Carro ferrari = new Carro("Ferrari", "Vermelho", 2012);
        Carro audi = new Carro("Audi", "Branco", 2011);
        Carro porsche = new Carro("Porche", "Amarelo", 2013);
        
        josé.adicionaCarro(ferrari);
        josé.adicionaCarro(audi);
        josé.adicionaCarro(porsche);
        
        josé.imprimeCarros();
    }
}