package br.ufscar.si.poo.cap2.conta;

/**
 * Classe que manipula objetos da classe Conta
 * 
 * @author Delano Medeiros Beder
 */
public class AcessaConta {
   public static void main(String args[]) {
              
       Conta c1 = new Conta();
       c1.deposito(200);
       System.out.println("Conta c1: " + c1.getSaldo());
       
       Conta c2 = new Conta(400);
       c2.saque(100);
       System.out.println("Conta c2: " + c2.getSaldo());
   }
}
