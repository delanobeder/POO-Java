package br.ufscar.si.poo.cap5.filas;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Classe Processo
 *
 * @author Delano Medeiros Beder
 */
public class Processo implements Comparable<Processo> {

    /*
     * Declaração dos atributos da classe
     */
    private int prioridade;

    /* 
     * Declaração do Construtor
     */
    public Processo(int prioridade) {
        this.prioridade = prioridade;
    }

    /*
     * Declaração dos métodos 
     */
    @Override
    public int compareTo(Processo o) {
        return o.prioridade - this.prioridade;
    }

    @Override
    public String toString() {
        return "Processo de prioridade " + prioridade;
    }

    public static void main(String[] args) {
        Processo p;
        Queue<Processo> fila = new PriorityQueue<Processo>();

        p = new Processo(58);
        fila.add(p);
        System.out.println(p + " foi colocado na fila.");

        p = new Processo(74);
        fila.add(p);
        System.out.println(p + " foi colocado na fila.");

        p = new Processo(27);
        fila.add(p); 
        System.out.println(p + " foi colocado na fila.");
        p = fila.poll();
        System.out.println(p + " foi atendido.");
        
        p = new Processo(29);
        fila.add(p); 
        System.out.println(p + " foi colocado na fila.");
        p = fila.poll();
        System.out.println(p + " foi atendido.");
        
        p = new Processo(18);
        fila.add(p); 
        System.out.println(p + " foi colocado na fila.");
        p = fila.poll();
        System.out.println(p + " foi atendido.");
        
        p = fila.poll();
        System.out.println(p + " foi atendido.");
        
        p = fila.poll();
        System.out.println(p + " foi atendido.");    }
}