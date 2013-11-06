package br.ufscar.si.poo.cap7.dao;

import br.ufscar.si.poo.cap7.modelo.Escultura;
import br.ufscar.si.poo.cap7.modelo.Pintura;
import java.util.Set;

/**
 * Interface IObraDeArteDAO -- Define as funcionalidades específicas 
 * relacionadas à persistência de instâncias das subclasses de ObraDeArte.
 * 
 * @author Delano Medeiros Beder
 */
public interface IObraDeArteDAO extends IGenericDAO {
    
    Set<Pintura> selectAllPinturas() throws DAOException;
    
    Set<Escultura> selectAllEsculturas() throws DAOException;
}
