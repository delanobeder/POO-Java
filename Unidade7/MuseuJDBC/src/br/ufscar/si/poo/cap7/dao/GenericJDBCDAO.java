package br.ufscar.si.poo.cap7.dao;

import br.ufscar.si.poo.cap7.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.ufscar.si.poo.cap7.dao.DAOException;
import br.ufscar.si.poo.cap7.dao.IGenericDAO;
import br.ufscar.si.poo.cap7.modelo.ObjectDTO;
import java.util.Set;
import java.util.TreeSet;

/**
 * Classe GenericJDBCDAO -- implementa as funcionalidades genéricas da 
 * persistência de dados.
 * 
 * @author Delano Medeiros Beder
 */
public abstract class GenericJDBCDAO implements IGenericDAO {

    protected final int selectLastID() throws DAOException {
        Connection conn = new ConnectionFactory().getConnection();
        int lastID = 0;
        String sql = "SELECT MAX(ID) FROM " + this.getTableName();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                lastID = rs.getInt(1);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
        return lastID;
    }

    @Override
    public final void delete(int id) throws DAOException {
        Connection conn = new ConnectionFactory().getConnection();
        try {
            String sql = "DELETE FROM " + this.getTableName() + " WHERE ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public final ObjectDTO selectByID(int id) throws DAOException {
        ObjectDTO dto = null;
        Connection conn = new ConnectionFactory().getConnection();
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM " + this.getTableName()
                    + " WHERE ID = " + id;
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                dto = this.createObjectDTO(rs);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
        return dto;
    }

    @Override
    public final Set<ObjectDTO> selectAll() throws DAOException {
        String sql = "SELECT * FROM " + this.getTableName();
        Set<ObjectDTO> set = new TreeSet<>();
        Connection connection = new ConnectionFactory().getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                set.add(this.createObjectDTO(rs));
            }
        } catch (SQLException e) {
            throw new DAOException(e);
        }
        return set;
    }

    protected abstract String getTableName();

    protected abstract ObjectDTO createObjectDTO(ResultSet rs) throws DAOException;
}
