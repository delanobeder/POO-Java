package br.ufscar.si.poo2.swing.editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Handler extends WindowAdapter implements ActionListener, KeyListener {

    private Editor editor;
    private JFileChooser jFileChooser;
    private boolean changed;
    private FileUtil util;

    public Handler(Editor editor) {
        this.editor = editor;
        this.jFileChooser = new JFileChooser();
        this.jFileChooser.setMultiSelectionEnabled(false);
        this.changed = false;
        util = new FileUtil();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Abrir":
                load();
                break;
            case "Salvar":
                save();
                break;
            case "Sair":
                exit();
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Não faz nada
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (!changed) {
            editor.setTitle(Editor.TITLE + "*");
            changed = true;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Não faz nada
    }

    @Override
    public void windowClosing(WindowEvent e) {
        exit();
    }

    private void load() {
        int state = jFileChooser.showOpenDialog(editor);
        if (state == JFileChooser.APPROVE_OPTION) {
            String fileName = jFileChooser.getSelectedFile().getAbsolutePath();
            editor.getTextArea().setText(util.load(fileName));
            editor.setTitle(Editor.TITLE);
            changed = false;
        }
    }

    private void save() {
        int state = jFileChooser.showSaveDialog(editor);
        if (state == JFileChooser.APPROVE_OPTION) {
            String fileName = jFileChooser.getSelectedFile().getAbsolutePath();
            util.save(fileName, editor.getTextArea().getText());
            editor.setTitle(Editor.TITLE);
            changed = false;
        }
    }

    private void exit() {
        String msg = "O Arquivo foi modificado. Quer salvar antes de sair?";
        if (changed) {
            int state = JOptionPane.showConfirmDialog(editor, msg);
            if (state == JOptionPane.YES_OPTION) {
                save();
            } else if (state == JOptionPane.CANCEL_OPTION) {
                return;
            }
        }
        System.exit(0);
    }
}