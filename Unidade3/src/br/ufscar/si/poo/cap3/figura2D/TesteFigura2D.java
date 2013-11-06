package br.ufscar.si.poo.cap3.figura2D;

public class TesteFigura2D {

    public static void main(String[] args) {
        Figura2D[] figuras = new Figura2D[3];

        figuras[0] = new Retângulo(2, 3, 2, 3);
        figuras[1] = new Triângulo(3, 4, 5);
        figuras[2] = new Equilátero(4, 4, 4);

        for (Figura2D figura : figuras) {
            System.out.println(figura.perímetro());
            System.out.println(figura.área());
        }
    }
}
