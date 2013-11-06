
package br.ufscar.si.poo2.swing;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Classe JButtonDemo
 *
 * @author Delano Medeiros Beder
 */
public class JButtonDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JButtonDemo");
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton b1 = new JButton("Brasil", new ImageIcon("Brasil.gif"));
        JButton b2 = new JButton("França", new ImageIcon("Franca.gif"));
        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(b1);
        frame.getContentPane().add(b2);
        frame.pack();
        frame.setVisible(true);
    }
}
