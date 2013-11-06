package br.ufscar.si.poo.cap4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Essa classe Serializa e desseariliza instâncias da classe Conta.
 * 
 * @author Delano Medeiros Beder
 */
public class SerializadorConta {

    public static void gravaConta(Conta conta, File file) throws IOException {
        ObjectOutputStream saida = new ObjectOutputStream(
                new FileOutputStream(file));
        saida.writeObject(conta);
        saida.close();
    }

    public static Conta carregaConta(File file) throws IOException, ClassNotFoundException{
        ObjectInputStream entrada = new ObjectInputStream(
                new FileInputStream(file));
        Conta conta = (Conta) entrada.readObject();
        entrada.close();
        return conta;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       
       File file = new File("Conta.dat");
       Conta conta;
       
       if (file.exists()) {
           conta = carregaConta(file);
           conta.deposito(10);
       } else {
           conta = new Conta(0);
       } 
       System.out.println(conta.getSaldo());
       gravaConta(conta, file);
    }
}
