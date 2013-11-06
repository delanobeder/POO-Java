package br.ufscar.si.poo.cap7.modelo;

/**
 * Classe ObraDeArte
 *
 * @author Delano Medeiros Beder
 */
public abstract class ObraDeArte extends ObjectDTO implements Comparable<ObraDeArte> {
    
    /*
     * Declaração dos atributos da classe
     */
    private String título, artista, material;
    private int ano;

    /*
     * Declaração do construtor da classe
     */
    public ObraDeArte(String título, String artista, String material, int ano) {
        this.título = título;
        this.artista = artista;
        this.material = material;
        this.ano = ano;
    }

    /*
     * Declaração dos métodos da classe
     */
    public abstract void imprime();

    public String getTítulo() {
        return título;
    }

    public String getArtista() {
        return artista;
    }

    public String getMaterial() {
        return material;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public final int compareTo(ObraDeArte o) {
        return this.getId() - o.getId();
    }
}
