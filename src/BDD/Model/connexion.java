package BDD.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class connexion {

    public static Connection getConnexion(String url, Properties props) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Erreur lors du chargement" + e.getMessage());

        }
        Connection connexion = null;
        try {
            connexion = DriverManager.getConnection(url, "root", "");
        }
        catch (SQLException e){
            System.out.println("Erreur lors du chargement" + e.getMessage());
        }

        return connexion;
    }
}