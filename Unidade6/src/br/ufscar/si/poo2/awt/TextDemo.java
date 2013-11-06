package br.ufscar.si.poo2.awt;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

/**
 * Classe TextDemo
 *
 * @author Delano Medeiros Beder
 */
public class TextDemo {

    public static void main(String[] args) {
        Frame frame = new Frame("TextoDemo");
        frame.setLayout(new GridLayout(2, 2));
        Label nomeLbl = new Label("Nome:");
        nomeLbl.setForeground(Color.BLUE);
        TextField nomeTxt = new TextField();
        Label endLbl = new Label("Endereço:");
        endLbl.setFont(new Font("TimesRoman", Font.ITALIC, 12));
        endLbl.setForeground(Color.RED);
        TextArea endTxt = new TextArea();
        frame.add(nomeLbl);
        frame.add(nomeTxt);
        frame.add(endLbl);
        frame.add(endTxt);
        frame.pack();
        frame.setVisible(true);
    }
}
