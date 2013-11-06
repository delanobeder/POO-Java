package br.ufscar.si.poo2.swing;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 * Classe JComboBoxGroupDemo
 *
 * @author Delano Medeiros Beder
 */
public class JComboBoxDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBoxDemo");
        String[] languages = {"C++", "C#", "Java", "Smalltalk"};
        JComboBox list = new JComboBox(languages);
        frame.getContentPane().add(list);
        frame.setSize(200, 50);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
