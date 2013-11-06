
package br.ufscar.si.poo2.awt;

import java.awt.Frame;
import java.awt.List;

/**
 * Classe ListDemo
 *
 * @author Delano Medeiros Beder
 */
public class ListDemo {

    public static void main(String[] args) {
        Frame frame = new Frame("ListDemo");
        frame.setResizable(true);
        List list = new List(4, true);
        list.add("C++");
        list.add("C#");
        list.add("Java");
        list.add("Smalltalk");
        frame.add(list);
        frame.pack();
        frame.setVisible(true);
    }
}
