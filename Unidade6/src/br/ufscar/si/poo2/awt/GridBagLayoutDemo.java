package br.ufscar.si.poo2.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.List;
import java.awt.TextArea;

/**
 * Classe GridBagLayoutDemo
 *
 * @author Delano Medeiros Beder
 */
public class GridBagLayoutDemo extends Frame {

    public static void main(String[] args) {
        Frame f = new Frame("GridBagLayoutDemo");
        f.setSize(320, 200);
        f.setLayout(new GridBagLayout());
        List lEsq = new List(3, true);
        lEsq.add("Um"); 
        lEsq.add("Dois"); 
        lEsq.add("Tres"); 
        lEsq.add("Quatro");
        lEsq.add("Cinco"); 
        lEsq.add("Seis"); 
        lEsq.add("Sete");
        Button add = new Button(">>");
        Button clear = new Button("Clear");
        Button close = new Button("Close");
        TextArea tDir = new TextArea(3, 10);
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0; gc.gridy = 0; gc.gridwidth = 1; gc.gridheight = 3;
        gc.fill = GridBagConstraints.VERTICAL;
        f.add(lEsq, gc);
        gc.gridx = 2;
        f.add(tDir, gc);
        Insets margens = new Insets(4, 3, 4, 3);
        gc.gridx = 1; gc.gridy = 0; gc.gridwidth = 1; gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        gc.ipadx = 4; gc.ipady = 4; gc.insets = margens;
        f.add(add, gc);
        gc.gridy = 1;
        f.add(clear, gc);
        gc.gridy = 2;
        f.add(close, gc);
        f.setVisible(true);
    }
}
