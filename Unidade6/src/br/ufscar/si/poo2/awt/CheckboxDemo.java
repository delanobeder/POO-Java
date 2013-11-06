package br.ufscar.si.poo2.awt;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 * Classe CheckboxDemo
 *
 * @author Delano Medeiros Beder
 */
public class CheckboxDemo {

    public static void main(String[] args) {
        Frame frame = new Frame("CheckboxDemo");
        frame.setLayout(new FlowLayout());
        Checkbox box1 = new Checkbox("Azul");
        Checkbox box2 = new Checkbox("Verde");
        Checkbox box3 = new Checkbox("Vermelho");
        frame.add(box1);
        frame.add(box2);
        frame.add(box3);
        frame.pack();
        frame.setVisible(true);
    }
}
