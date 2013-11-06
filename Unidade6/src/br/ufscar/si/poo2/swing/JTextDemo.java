package br.ufscar.si.poo2.swing;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Classe JTextDemo
 *
 * @author Delano Medeiros Beder
 */
public class JTextDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextoDemo");
        frame.setLayout(new GridLayout(2, 2));
        JLabel textoLbl = new JLabel("Texto:");
        JTextArea texto = new JTextArea();
        JLabel numLbl = new JLabel("Caracteres:");
        JTextField numCaracteres = new JTextField("0");
        numCaracteres.setEditable(false);
        texto.addKeyListener(new KeyHandler(numCaracteres));
        frame.getContentPane().add(textoLbl);
        frame.getContentPane().add(texto);
        frame.getContentPane().add(numLbl);
        frame.getContentPane().add(numCaracteres);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}

class KeyHandler extends KeyAdapter {

    private JTextField field;

    public KeyHandler(JTextField field) {
        this.field = field;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        JTextArea area = ((JTextArea) e.getComponent());
        field.setText(Integer.toString(area.getText().length()));
    }
}