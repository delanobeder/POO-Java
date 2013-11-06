
package br.ufscar.si.poo2.awt;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.KeyEvent;

/**
 * Classe MenuDemo
 *
 * @author Delano Medeiros Beder
 */
public class MenuDemo {

    public static void main(String[] args) {
        Frame frame = new Frame("MenuDemo");
        MenuBar bar = new MenuBar();
        frame.setMenuBar(bar);
        Menu menuFile = new Menu("Arquivo");
        MenuItem open = new MenuItem("Abrir", new MenuShortcut(KeyEvent.VK_A));
        MenuItem save = new CheckboxMenuItem("Salvar");
        MenuItem exit = new MenuItem("Sair");
        menuFile.add(open);
        menuFile.add(save);
        menuFile.addSeparator();
        menuFile.add(exit);
        Menu menuHelp = new Menu("Ajuda");
        bar.add(menuFile);
        bar.setHelpMenu(menuHelp);
        frame.pack();
        frame.setVisible(true);
    }
}
