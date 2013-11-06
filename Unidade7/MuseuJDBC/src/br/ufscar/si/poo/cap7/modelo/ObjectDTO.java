package br.ufscar.si.poo.cap7.modelo;

import java.io.Serializable;

/**
 * Classe ObjectDTO -- raiz da hierarquia  de objetos que podem ser persistidos 
 * no banco de dados.
 * 
 * @author Delano Medeiros Beder
 */
public abstract class ObjectDTO implements Serializable{

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}