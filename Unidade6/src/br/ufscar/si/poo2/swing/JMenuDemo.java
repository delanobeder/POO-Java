package br.ufscar.si.poo2.swing;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 * Classe JMenuDemo
 *
 * @author Delano Medeiros Beder
 */
public class JMenuDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JMenuDemo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JMenuBar bar = new JMenuBar();
        frame.setJMenuBar(bar);
        JMenu menuFile = new JMenu("Arquivo");
        JMenuItem open = new JMenuItem("Abrir");
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
                InputEvent.CTRL_MASK));
        JMenuItem save = new JCheckBoxMenuItem("Salvar");
        JMenuItem exit = new JMenuItem("Sair");
        menuFile.add(open);
        menuFile.add(save);
        menuFile.addSeparator();
        menuFile.add(exit);
        JMenu menuHelp = new JMenu("Ajuda");
        bar.add(menuFile);
        bar.add(menuHelp);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}
