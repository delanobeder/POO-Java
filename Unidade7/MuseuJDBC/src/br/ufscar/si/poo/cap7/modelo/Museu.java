package br.ufscar.si.poo.cap7.modelo;

import br.ufscar.si.poo.cap7.dao.DAOException;
import br.ufscar.si.poo.cap7.dao.DAOFactory;
import br.ufscar.si.poo.cap7.dao.IObraDeArteDAO;
import java.util.Set;

/**
 * Classe Museu
 *
 * @author Delano Medeiros Beder
 */
public class Museu {
       
    
    /*
     * Declaração dos métodos da classe
     */
    public void adicionaObra(ObraDeArte obra) {
        try {
            DAOFactory factory = DAOFactory.getInstance();
            factory.getObraDeArteDAO().insert(obra);
        } catch (DAOException exception) {
            exception.printStackTrace();
        }
    }

    public void removeObra(ObraDeArte obra) {
        try {
            DAOFactory factory = DAOFactory.getInstance();
            factory.getObraDeArteDAO().delete(obra.getId());
        } catch (DAOException exception) {
            exception.printStackTrace();
        }
    }

    public void imprimeColeção() {
        try {
            DAOFactory factory = DAOFactory.getInstance();
            IObraDeArteDAO dao = factory.getObraDeArteDAO();
            Set<ObjectDTO> obras = dao.selectAll();
            for (ObjectDTO o : obras) {
                ((ObraDeArte) o).imprime();
            }
        } catch (DAOException exception) {
            exception.printStackTrace();
        }
    }
 
    public static void main(String[] args) {

        Museu museu = new Museu();

        museu.imprimeColeção();
    }
}
