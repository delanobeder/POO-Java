package br.ufscar.si.poo.cap7.dao;

import br.ufscar.si.poo.cap7.dao.GenericJDBCDAO;
import br.ufscar.si.poo.cap7.dao.ConnectionFactory;
import br.ufscar.si.poo.cap7.modelo.Escultura;
import br.ufscar.si.poo.cap7.modelo.ObraDeArte;
import br.ufscar.si.poo.cap7.modelo.Pintura;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.ufscar.si.poo.cap7.dao.DAOException;
import br.ufscar.si.poo.cap7.dao.IObraDeArteDAO;
import br.ufscar.si.poo.cap7.modelo.ObjectDTO;
import java.sql.Connection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Classe ObraDeArteJDBCDAO -- Implementa as funcionalidades relacionadas à  
 * persistência  de instâncias  das subclasses de ObraDeArte.
 * 
 * @author Delano Medeiros Beder
 */
class ObraDeArteJDBCDAO extends GenericJDBCDAO implements IObraDeArteDAO {
 
    public static final int PINTURA = 1;
    public static final int ESCULTURA = 2;
    
    @Override
    public void update(ObjectDTO obj) throws DAOException {
        ObraDeArte obra = (ObraDeArte) obj;
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE ");
        sql.append(this.getTableName());
        sql.append(" SET TITULO = ?, ");
        sql.append("ARTISTA = ?, MATERIAL = ?, ANO = ?, DESC = ?, ");
        if (obra instanceof Pintura) {
            sql.append("TIPO = ? WHERE ID = ?");
        } else {
            sql.append("ALTURA = ? WHERE ID = ?");
        }
        try {
            Connection conn = new ConnectionFactory().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql.toString());
            stmt.setString(1, obra.getTítulo());
            stmt.setString(2, obra.getArtista());
            stmt.setString(3, obra.getMaterial());
            stmt.setInt(4, obra.getAno());
            if (obra instanceof Pintura) {
                stmt.setInt(5, PINTURA);
                stmt.setString(6, ((Pintura) obra).getTipo());
            } else {
                stmt.setInt(5, ESCULTURA);
                stmt.setDouble(6, ((Escultura) obra).getAltura());
            }
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void insert(ObjectDTO obj) throws DAOException {
        ObraDeArte obra = (ObraDeArte) obj;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ");
        sql.append(this.getTableName());
        sql.append(" (ID, TITULO, ARTISTA, MATERIAL, ANO, CATEGORIA, ");
        if (obra instanceof Pintura) {
            sql.append("TIPO) VALUES(?,?,?,?,?,?,?)");
        } else {
            sql.append("ALTURA) VALUES(?,?,?,?,?,?,?)");
        }
        try {
            Connection conn = new ConnectionFactory().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql.toString());
            stmt.setInt(1, this.selectLastID() + 1);
            stmt.setString(2, obra.getTítulo());
            stmt.setString(3, obra.getArtista());
            stmt.setString(4, obra.getMaterial());
            stmt.setInt(5, obra.getAno());
            if (obra instanceof Pintura) {
                stmt.setInt(6, PINTURA);
                stmt.setString(7, ((Pintura) obra).getTipo());
            } else {
                stmt.setInt(6, ESCULTURA);
                stmt.setDouble(7, ((Escultura) obra).getAltura());
            }
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    protected ObraDeArte createObjectDTO(ResultSet rs) throws DAOException {
        ObraDeArte obra;
        try {
            int id = rs.getInt("ID");
            String titulo = rs.getString("TITULO");
            String artista = rs.getString("ARTISTA");
            String material = rs.getString("MATERIAL");
            int ano = rs.getInt("ANO");
            int categoria = rs.getInt("CATEGORIA");
            if (categoria == PINTURA) {
                String tipo = rs.getString("TIPO");
                obra = new Pintura(titulo, artista, material, ano, tipo);
            } else {
                double altura = rs.getDouble("ALTURA");
                obra = new Escultura(titulo, artista, material, ano, altura);
            }
            obra.setId(id);
            return obra;
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public Set<Pintura> selectAllPinturas() throws DAOException {
        Set<ObjectDTO> all = this.selectAll();
        Set<Pintura> pinturas = new TreeSet<>();
        for (ObjectDTO obj : all) {
            if (obj instanceof Pintura) {
                pinturas.add((Pintura)obj);
            }
        }
        return pinturas;
    }
    
    @Override
    public Set<Escultura> selectAllEsculturas() throws DAOException {
        Set<ObjectDTO> all = this.selectAll();
        Set<Escultura> esculturas = new HashSet<>();
        for (ObjectDTO obj : all) {
            if (obj instanceof Escultura) {
                esculturas.add((Escultura)obj);
            }
        }
        return esculturas;
    }

    @Override
    protected String getTableName() {
        return "ObraDeArte";
    }
    

    
}
