package br.ufscar.si.poo.cap7.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Classe ConnectionFactory -- Fábricas de conexões ao banco de dados
 * (instâncias de classes que implementam a interface java.sql.Connection)
 * 
 * @author Delano Medeiros Beder
 */
public class ConnectionFactory {

    public Connection getConnection() {
        Connection connection = null;
        Properties properties = new Properties();
        try {
            InputStream stream = Connection.class.getResourceAsStream("/configuration.properties");
            properties.load(stream);
            String driver = properties.getProperty("jdbc.driver");
            String url = properties.getProperty("jdbc.url");
            String user = properties.getProperty("jdbc.user");
            String password = properties.getProperty("jdbc.password");
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
