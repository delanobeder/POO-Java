package br.ufscar.si.poo2.swing.editor;

import java.awt.BorderLayout;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

/**
 * Classe Editor - Interface gráfica. Container os demais componentes gráficos 
 * são inseridos
 *
 * @author Delano Medeiros Beder
 */
public class Editor extends JFrame {

    public static final String TITLE = "Editor de Texto Simples";
    private JTextArea textArea;
    private Handler handler;

    public Editor() {        
        handler = new Handler(this);
        configureLayout();
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    private void configureLayout() {

        JPanel contentPane = ((JPanel) this.getContentPane());
        contentPane.setLayout(new BorderLayout());
        
        textArea = new JTextArea();
        textArea.addKeyListener(handler);
        
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(textArea);
        
        contentPane.add(jScrollPane, BorderLayout.CENTER);

        JMenuItem open = new JMenuItem("Abrir");
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, 
                InputEvent.ALT_MASK));
        open.addActionListener(handler);

        JMenuItem save = new JMenuItem("Salvar");
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, 
                InputEvent.ALT_MASK));
        save.addActionListener(handler);

        JMenuItem exit = new JMenuItem("Sair");
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, 
                InputEvent.ALT_MASK));
        exit.addActionListener(handler);

        JMenu menuFile = new JMenu("Arquivo");
        menuFile.add(open);
        menuFile.add(save);
        menuFile.addSeparator();
        menuFile.add(exit);

        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.add(menuFile);
        
        this.setJMenuBar(jMenuBar);
        this.setSize(480, 284);
        this.setTitle(TITLE);
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(handler);
    }

    public static void main(String[] args) {
        Editor e = new Editor();
        e.setVisible(true);
    }
}