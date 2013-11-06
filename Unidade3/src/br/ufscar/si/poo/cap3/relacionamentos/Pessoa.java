package br.ufscar.si.poo.cap3.relacionamentos;

/**
 * Classe Pessoa
 *
 * @author Delano Medeiros Beder
 */
public class Pessoa {
    
    private String CPF, nome;    
    private Carro[] carros;
    int quantidade;
    
    public Pessoa(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
        this.quantidade = 0;
        carros = new Carro[10];
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public Carro[] getCarros() {
        return carros;
    }
    
    public void adicionaCarro(Carro carro) {
        if (quantidade < 10) {
            carros[quantidade++] = carro;
            carro.setDono(this);
        }
    }
    
    public void imprimeCarros() {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(carros[i]);
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