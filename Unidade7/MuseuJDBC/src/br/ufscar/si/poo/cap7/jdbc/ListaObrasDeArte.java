package br.ufscar.si.poo.cap7.jdbc;

import br.ufscar.si.poo.cap7.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Types;

/**
 * Classe ListaObrasDeArte -- Conecta com o banco de dados Museu e imprime a 
 * lista de obras de arte armazenadas nesse banco de dados. 
 * 
 * @author Delano Medeiros Beder
 */
public class ListaObrasDeArte {

    public static void main(String[] args) {
        try {
            final String fmt10 = "%-10.10s";
            final String fmt20 = "%-20.20s";

            Connection conn = new ConnectionFactory().getConnection();

            // Monta e executa consulta
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ObraDeArte");

            // Apresenta estrutura da Tabela
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 12; i++) {
                sb.append("----------");
            }
            System.out.println(sb);
            ResultSetMetaData m = rs.getMetaData();
            int colCount = m.getColumnCount();
            for (int i = 1; i <= colCount; ++i) {
                if (m.getColumnType(i) != Types.VARCHAR) {
                    System.out.printf(fmt10, m.getColumnName(i));
                } else {
                    System.out.printf(fmt20, m.getColumnName(i));
                }
            }
            System.out.println();
            System.out.println(sb);

            while (rs.next()) {
                System.out.printf(fmt10, String.valueOf(rs.getInt(1)));
                System.out.printf(fmt20, rs.getString("TITULO"));
                System.out.printf(fmt20, rs.getString(3));
                System.out.printf(fmt20, rs.getString("MATERIAL"));
                System.out.printf(fmt10, String.valueOf(rs.getInt(5)));
                System.out.printf(fmt10, String.valueOf(rs.getInt(6)));
                System.out.printf(fmt20, rs.getString("TIPO"));
                double altura = rs.getDouble(8);

                if (altura == 0) {
                    System.out.printf(fmt10+"\n", "null");
                } else {
                    System.out.printf("%-10.2f\n", rs.getDouble(8));
                }
            }
            stmt.close();
            // Fecha conexão com banco de dados
            conn.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}