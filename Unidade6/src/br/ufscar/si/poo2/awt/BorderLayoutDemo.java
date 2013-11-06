package br.ufscar.si.poo2.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

/**
 * Classe BorderLayoutDemo
 *
 * @author Delano Medeiros Beder
 */
public class BorderLayoutDemo {

    public static void main(String[] args) {
        Frame f = new Frame("BorderLayoutDemo");
        BorderLayout layout = new BorderLayout();
        f.setLayout(layout);
        Button b1 = new Button("Norte");
        Button b2 = new Button("Sul");
        Button b3 = new Button("Leste");
        Button b4 = new Button("Oeste");
        Button b5 = new Button("Centro");
        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);
        f.setSize(200, 100);
        f.pack();
        f.setVisible(true);
    }
}
