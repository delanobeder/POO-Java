package br.ufscar.si.poo2.awt;

import java.awt.Dialog;
import java.awt.Frame;

/**
 * Classe DialogDemo
 *
 * @author Delano Medeiros Beder
 */
public class DialogDemo {
    
    public static void main(String[] args) {
        Frame f = new Frame("Meu primeiro frame");
        Dialog d = new Dialog(f, "Dialogo", true);
        d.setSize(200, 200);
        d.setVisible(true);
    }
    
}
