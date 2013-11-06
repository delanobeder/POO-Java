package br.ufscar.si.poo.cap3.figura2D;

/**
 * Classe Retângulo
 *
 * @author Delano Medeiros Beder
 */
public class Retângulo implements Figura2D {

    /*
     * Declaração dos atributos da classe
     */
    private double[] lado;

    /*
     * Construtor da classe
     */
    public Retângulo(double ... l) {
        if (l.length != 4 || l[0] != l[2] || l[1] != l[3]) {
            throw new RuntimeException("Não é Retângulo");
        }

        this.lado = l;
    }

    /*
     * Declaração dos métodos da classe
     */
    @Override
    public double área() {
        return lado[0] * lado[1];
    }

    @Override
    public double perímetro() {
        return 2 * lado[0] + 2 * lado[1];
    }
}
