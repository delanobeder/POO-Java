package br.ufscar.si.poo.cap5.museu;

import java.util.Set;
import java.util.TreeSet;

/**
 * Classe Museu
 *
 * @author Delano Medeiros Beder
 */
public class Museu {

    /*
     * Declaração dos atributos da classe
     */
    private Set<ObraDeArte> obras;

    /*
     * Declaração do construtor da classe
     */
    public Museu() {
        obras = new TreeSet<>();
    }

    /*
     * Declaração dos métodos da classe
     */
    public void adicionaObra(ObraDeArte obra) {
        obras.add(obra);
    }

    public void removeObra(ObraDeArte obra) {
        obras.remove(obra);
    }
    
    public void imprimeColeção() {
        for (ObraDeArte obra : obras) {
            obra.imprime();
        }
    }

    public static void main(String[] args) {

        Museu museu = new Museu();

        ObraDeArte o1 = new Pintura("Mona Lisa", "Leonardo da Vinci", "Madeira",
                1503, "Óleo");

        museu.adicionaObra(o1);

        ObraDeArte o2 = new Escultura("David", "Michelangelo", "Mármore", 1501, 4.10);

        museu.adicionaObra(o2);

        museu.imprimeColeção();
    }
}
