package br.ufscar.si.poo.cap3.museu;

/**
 * Classe Pintura
 *
 * @author Delano Medeiros Beder
 */
public class Pintura extends ObraDeArte {

    /*
     * Declaração dos atributos da classe
     */
    private String tipo;

    /*
     * Declaração do construtor da classe
     */
    public Pintura(String título, String artista, String material, int ano, 
            String tipo) {
        super(título, artista, material, ano);
        this.tipo = tipo;
    }

    /*
     * Declaração dos métodos da classe
     */
    @Override
    public void imprime() {
        System.out.println("=======================================");
        System.out.println("=             PINTURA                 =");
        System.out.println("=======================================");
        System.out.println("Título   : " + this.getTítulo());
        System.out.println("Artista  : " + this.getArtista());
        System.out.println("Material : " + this.getMaterial());
        System.out.println("Ano      : " + this.getAno());
        System.out.println("Tipo     : " + this.tipo);
    }
}
