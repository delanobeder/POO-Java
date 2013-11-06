package br.ufscar.si.poo2.swing;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 * Classe JCheckBoxDemo
 *
 * @author Delano Medeiros Beder
 */
public class JCheckBoxDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JCheckBoxDemo");
        frame.getContentPane().setLayout(new FlowLayout());
        JCheckBox box1 = new JCheckBox("Azul");
        JCheckBox box2 = new JCheckBox("Verde");
        JCheckBox box3 = new JCheckBox("Vermelho");
        frame.getContentPane().add(box1);
        frame.getContentPane().add(box2);
        frame.getContentPane().add(box3);
        frame.setSize(270, 60);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
