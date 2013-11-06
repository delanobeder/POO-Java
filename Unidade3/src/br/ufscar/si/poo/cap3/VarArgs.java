package br.ufscar.si.poo.cap3;

public class VarArgs {
    
    public static int soma(int... valor) {
        int soma = 0;
        for (int v : valor) {
            soma += v;
        }
        return soma;
    }
    
    public static void main(String[] args) {
        System.out.println(VarArgs.soma(1, 3, 5, 7));
        System.out.println(VarArgs.soma(2, 4, 6));
    }
}
