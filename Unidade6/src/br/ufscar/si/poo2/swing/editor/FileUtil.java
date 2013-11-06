package br.ufscar.si.poo2.swing.editor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

    public void save(String fileName, String texto) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String load(String fileName) {
        StringBuilder texto = new StringBuilder();
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            while (s != null) {
                texto.append(s).append("\n");
                s = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return texto.toString();
    }
}