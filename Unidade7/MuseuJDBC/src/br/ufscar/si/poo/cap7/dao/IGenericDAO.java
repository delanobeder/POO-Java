package br.ufscar.si.poo.cap7.dao;

import br.ufscar.si.poo.cap7.modelo.ObjectDTO;
import java.util.Set;

/**
 * Interface IGenericDAO -- Define as funcionalidades genéricas da 
 * persistência de dados. 
 * 
 * @author Delano Medeiros Beder
 */
public interface IGenericDAO {

    void insert(ObjectDTO obj) throws DAOException;

    ObjectDTO selectByID(int id) throws DAOException;
    
    Set<ObjectDTO> selectAll() throws DAOException;

    void delete(int id) throws DAOException;

    void update(ObjectDTO obj) throws DAOException;
}
