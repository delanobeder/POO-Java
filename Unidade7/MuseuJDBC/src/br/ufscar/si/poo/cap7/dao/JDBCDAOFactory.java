package br.ufscar.si.poo.cap7.dao;

import br.ufscar.si.poo.cap7.dao.DAOException;
import br.ufscar.si.poo.cap7.dao.DAOFactory;
import br.ufscar.si.poo.cap7.dao.IObraDeArteDAO;

/**
 * Classe JDBCDAOFactory -- Classe concreta que retorna uma fábrica de DAOs que
 * utiliza a API JDBC, como estratégia  para a persistência de dados.
 * 
 * @author Delano Medeiros Beder
 */
class JDBCDAOFactory extends DAOFactory {

    @Override
    public IObraDeArteDAO getObraDeArteDAO() throws DAOException {
        return new ObraDeArteJDBCDAO();
    }
}
