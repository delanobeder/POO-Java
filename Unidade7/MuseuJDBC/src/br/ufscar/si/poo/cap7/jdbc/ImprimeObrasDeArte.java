package br.ufscar.si.poo.cap7.jdbc;

import br.ufscar.si.poo.cap7.dao.DAOFactory;
import br.ufscar.si.poo.cap7.dao.IObraDeArteDAO;
import br.ufscar.si.poo.cap7.modelo.Escultura;
import br.ufscar.si.poo.cap7.modelo.ObjectDTO;
import br.ufscar.si.poo.cap7.modelo.ObraDeArte;
import br.ufscar.si.poo.cap7.modelo.Pintura;
import java.util.Set;

/**
 * Classe ImprimeObrasDeArte -- Conecta, através de um DAO, com o banco de dados
 * Museu e imprime a lista de obras de arte armazenadas nesse banco de dados.
 *
 * @author Delano Medeiros Beder
 */
public class ImprimeObrasDeArte {

    public static void main(String[] args) {
        try {
            final String[] names = {"ID", "TITULO", "ARTISTA", "MATERIAL", "ANO",
                "CATEGORIA", "TIPO", "ALTURA"};

            final String fmt10 = "%-10.10s";
            final String fmt20 = "%-20.20s";

            // Apresenta estrutura da Tabela
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 12; i++) {
                sb.append("----------");
            }
            System.out.println(sb);
            for (int i = 0; i < names.length; i++) {
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 6: {
                        System.out.printf(fmt20, names[i]);
                        break;
                    }
                    default: {
                        System.out.printf(fmt10, names[i]);
                    }
                }
            }
            System.out.println();
            System.out.println(sb);

            IObraDeArteDAO dao = DAOFactory.getInstance().getObraDeArteDAO();
            Set<ObjectDTO> set = dao.selectAll();

            for (ObjectDTO obj : set) {
                ObraDeArte obra = ((ObraDeArte) obj);
                System.out.printf(fmt10, obra.getId());
                System.out.printf(fmt20, obra.getTítulo());
                System.out.printf(fmt20, obra.getArtista());
                System.out.printf(fmt20, obra.getMaterial());
                System.out.printf(fmt10, obra.getAno());
                if (obra instanceof Pintura) {
                    System.out.printf(fmt10, "1");
                    System.out.printf(fmt20, ((Pintura) obra).getTipo());
                    System.out.printf(fmt10 + "\n", "null");
                } else {
                    System.out.printf(fmt10, "2");
                    System.out.printf(fmt20, "null");
                    System.out.printf("%-10.2f\n", ((Escultura) obra).getAltura());
                }                
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}