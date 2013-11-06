package br.ufscar.si.poo2.awt;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/**
 * Classe CardLayoutDemo
 *
 * @author Delano Medeiros Beder
 */
class CardLayoutDemo {

    public static void main(String args[]) throws InterruptedException {
        Frame frame = new Frame();
        CardLayout layout = new CardLayout();
        Panel panel1 = new Panel();
        panel1.setBackground(Color.red);
        Panel panel2 = new Panel();
        panel2.setBackground(Color.green);
        Panel panel3 = new Panel();
        panel3.setBackground(Color.blue);
        frame.setLayout(layout);
        frame.add(panel1, "Um");
        frame.add(panel2, "Dois");
        frame.add(panel3, "Três");
        frame.setSize(300, 100);
        frame.setVisible(true);
        while (true) {
            Thread.sleep(10000);
            layout.next(frame);
        }
    }
}