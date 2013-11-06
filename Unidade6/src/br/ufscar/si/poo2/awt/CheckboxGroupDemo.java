
package br.ufscar.si.poo2.awt;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 * Classe CheckboxGroupDemo
 *
 * @author Delano Medeiros Beder
 */
public class CheckboxGroupDemo {

    public static void main(String[] args) {
        Frame frame = new Frame("CheckboxGroupDemo");
        frame.setLayout(new FlowLayout());
        CheckboxGroup group = new CheckboxGroup();
        Checkbox box1 = new Checkbox("Linux", group, true);
        Checkbox box2 = new Checkbox("Mac", group, false);
        Checkbox box3 = new Checkbox("Windows", group, false);
        frame.add(box1);
        frame.add(box2);
        frame.add(box3);
        frame.pack();
        frame.setVisible(true);
    }
}
