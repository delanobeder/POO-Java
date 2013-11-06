package br.ufscar.si.poo.cap3.museu;

/**
 * Classe Museu
 *
 * @author Delano Medeiros Beder
 */
public class Museu {

    /*
     * Declaração dos atributos da classe
     */
    private ObraDeArte[] obras;
    
    private int quantidade;

    /*
     * Declaração do construtor da classe
     */
    public Museu() {
        obras = new ObraDeArte[200];
        quantidade = 0;
    }
    
    /*
     * Declaração dos métodos da classe
     */
    public void adicionaObra(ObraDeArte obra) {
        if (quantidade < 200) {
            obras[quantidade++] = obra;
        }
    }
    
    public void imprimeColeção() {
        for (int i = 0; i < quantidade; i++) {
            obras[i].imprime();
        }
    }
    
    public static void main(String[] args) {
        
        Museu museu = new Museu();
        
        ObraDeArte o1 = new Pintura("Mona Lisa", "Leonardo da Vinci", "Madeira", 
                1503, "Óleo");
        
        museu.adicionaObra(o1);
        
        ObraDeArte o2 = new Escultura("a", "b", "c", 1558, 1.78);
        
        museu.adicionaObra(o2);
        
        museu.imprimeColeção();
    }
}
