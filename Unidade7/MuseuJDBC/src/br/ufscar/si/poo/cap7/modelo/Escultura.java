package br.ufscar.si.poo.cap7.modelo;

/**
 * Classe Escultura
 *
 * @author Delano Medeiros Beder
 */
public class Escultura extends ObraDeArte {

    /*
     * Declaração dos atributos da classe
     */
    private double altura;

    /*
     * Declaração do construtor da classe
     */
    public Escultura(String titulo, String artista, String material,
            int ano, double altura) {
        super(titulo, artista, material, ano);
        this.altura = altura;
    }

    /*
     * Declaração dos métodos da classe
     */
    public double getAltura() {
        return altura;
    }

    @Override
    public void imprime() {
        System.out.println("=======================================");
        System.out.println("=            ESCULTURA                =");
        System.out.println("=======================================");
        System.out.println("Título   : " + this.getTítulo());
        System.out.println("Artista  : " + this.getArtista());
        System.out.println("Material : " + this.getMaterial());
        System.out.println("Ano      : " + this.getAno());
        System.out.printf("Altura   : %-4.2f\n", this.altura);
    }
}
