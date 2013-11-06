package br.ufscar.si.poo2.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe AppletDemo - exemplo de um applet AWT
 *
 * @author Delano Medeiros Beder
 */
public class AppletDemo extends Applet implements ActionListener {

    private Button b1;
    private Button b2;
    private TextField tValue;

    @Override
    public void init() {
        b1 = new Button("-");
        b2 = new Button("+");
        tValue = new TextField("0");
        tValue.setEditable(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        this.setLayout(new FlowLayout());
        this.add(b1);
        this.add(tValue);
        this.add(b2);
        String color = this.getParameter("color");
        if (color == null) {
            color = "0xC0C0C0";
        }
        this.setBackground(Color.decode(color));
    }

    @Override
    public void start() {
        tValue.setText("0");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        Integer valor = new Integer(tValue.getText());
        if (command.equals("+")) {
            valor = valor + 1;
        } else {
            valor = valor - 1;
        }
        tValue.setText(valor.toString());
    }
}