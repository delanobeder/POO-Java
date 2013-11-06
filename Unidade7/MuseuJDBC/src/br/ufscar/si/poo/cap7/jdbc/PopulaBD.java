package br.ufscar.si.poo.cap7.jdbc;

import br.ufscar.si.poo.cap7.dao.ConnectionFactory;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PopulaBD {

    public static void main(String[] args) throws SQLException {
        
        System.out.println("Populando com dados iniciais");

        Connection conn = new ConnectionFactory().getConnection();

        InputStream stream = PopulaBD.class.getResourceAsStream("/create.sql");

        Scanner scanner = new Scanner(stream);

        scanner.useDelimiter("\n\r");


        while (scanner.hasNext()) {
            try {
                String q = scanner.next();
                Statement stmt = conn.createStatement();
                if (q.length() > 0) {
                    System.out.println(q);
                    stmt.execute(q);
                }
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }

        conn.close();
    }
}
