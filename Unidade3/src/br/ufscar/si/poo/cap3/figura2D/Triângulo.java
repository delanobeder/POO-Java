package br.ufscar.si.poo.cap3.figura2D;

/**
 * Classe Triângulo
 *
 * @author Delano Medeiros Beder
 */
public class Triângulo implements Figura2D {

    protected double[] lado;
    
    public Triângulo(double... l) {
        if (l.length != 3 || l[0] > l[1] + l[2] || l[1] > l[0] + l[2] || l[2] > l[0] + l[1]) {
            throw new RuntimeException("Não é Triângulo");
        }
        
        this.lado = l;
    }

    @Override
    public double área() {
        double s = perímetro() / 2;
        return Math.sqrt(s * (s - lado[0]) * (s - lado[1]) * (s - lado[2]));
    }

    @Override
    public double perímetro() {
        return lado[0] + lado[1] + lado[2];
    }
}