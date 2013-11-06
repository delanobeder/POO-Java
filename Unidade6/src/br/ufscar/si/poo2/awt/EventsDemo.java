package br.ufscar.si.poo2.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Classe EventsDemo
 *
 * @author Delano Medeiros Beder
 */
public class EventsDemo {

    public static void main(String[] args) {
        Frame f = new Frame("EventsDemo");
        f.setLayout(new FlowLayout());
        f.addWindowListener(new WindowHandler());
        Button b1 = new Button("-");
        Button b2 = new Button("+");
        TextField tValue = new TextField("0");
        tValue.setEditable(false);
        ButtonHandler bh = new ButtonHandler(tValue);
        b1.addActionListener(bh);
        b2.addActionListener(bh);
        f.add(b1);
        f.add(tValue);
        f.add(b2);
        f.setSize(100, 70);
        f.setVisible(true);
    }
}

class WindowHandler extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class ButtonHandler implements ActionListener {

    private TextField field;

    public ButtonHandler(TextField field) {
        this.field = field;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        Integer valor = new Integer(field.getText());
        if (command.equals("+")) {
            valor = valor + 1;
        } else {
            valor = valor - 1;
        }
        field.setText(valor.toString());
    }
}