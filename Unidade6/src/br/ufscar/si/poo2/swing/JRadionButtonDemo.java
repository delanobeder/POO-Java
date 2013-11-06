package br.ufscar.si.poo2.swing;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 * Classe JRadioButtonDemo
 *
 * @author Delano Medeiros Beder
 */
public class JRadionButtonDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JRadioButtonDemo");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setSize(270, 60);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JRadioButton b1 = new JRadioButton("Linux");
        JRadioButton b2 = new JRadioButton("Mac");
        JRadioButton b3 = new JRadioButton("Windows");
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        frame.getContentPane().add(b1);
        frame.getContentPane().add(b2);
        frame.getContentPane().add(b3);
        frame.setVisible(true);
    }
}
