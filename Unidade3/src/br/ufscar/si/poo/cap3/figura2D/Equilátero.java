package br.ufscar.si.poo.cap3.figura2D;

/**
 * Classe Equilátero
 *
 * @author Delano Medeiros Beder
 */
public class Equilátero extends Triângulo {

    public Equilátero(double... l) {
        super(l);
        
        if (l.length != 3 || l[0] != l[1] || l[0] != l[1] || l[1] != l[2]) {
            throw new RuntimeException("Não é Triângulo Equilátero");
        }
    }

    @Override
    public double área() {
        return this.lado[0] * this.lado[0] * Math.sqrt(3) / 4;
    }
}
