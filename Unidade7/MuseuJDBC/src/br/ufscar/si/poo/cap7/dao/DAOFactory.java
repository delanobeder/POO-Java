package br.ufscar.si.poo.cap7.dao;

/**
 * Classe DAOFactory -- Fábrica de IObraDeArteDAOs
 * 
 * @author Delano Medeiros Beder
 */
abstract public class DAOFactory {

    private static DAOFactory instance = null;

    public static DAOFactory getInstance() {
        if (instance == null) {
            instance = new JDBCDAOFactory();
        }
        return instance;
    }

    public abstract IObraDeArteDAO getObraDeArteDAO() throws DAOException;
}