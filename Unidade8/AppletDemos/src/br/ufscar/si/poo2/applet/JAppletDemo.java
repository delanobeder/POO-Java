package br.ufscar.si.poo2.applet;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Classe JAppletDemo - exemplo de um applet Swing
 *
 * @author Delano Medeiros Beder
 */
public class JAppletDemo extends JApplet implements KeyListener {

    private JLabel textoLbl;
    private JTextArea texto;
    private JLabel numLbl;
    private JTextField numCaracteres;

    @Override
    public void init() {
        textoLbl = new JLabel("Texto:");
        texto = new JTextArea();
        numLbl = new JLabel("Caracteres:");
        numCaracteres = new JTextField("0");
        numCaracteres.setEditable(false);
        texto.addKeyListener(this);
        this.setLayout(new GridLayout(2, 2));
        this.getContentPane().add(textoLbl);
        this.getContentPane().add(texto);
        this.getContentPane().add(numLbl);
        this.getContentPane().add(numCaracteres);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        JTextArea area = ((JTextArea) e.getComponent());
        numCaracteres.setText(Integer.toString(area.getText().length()));
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Não faz nada
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Não faz nada
    }
}