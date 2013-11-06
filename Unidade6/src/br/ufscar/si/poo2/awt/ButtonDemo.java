
package br.ufscar.si.poo2.awt;

import java.awt.Button;
import java.awt.Frame;

/**
 * Classe ButtonDemo
 *
 * @author Delano Medeiros Beder
 */
public class ButtonDemo {

    public static void main(String[] args) {
        Frame frame = new Frame("ButtonDemo");
        frame.setResizable(true);
        Button button = new Button("OK");
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
