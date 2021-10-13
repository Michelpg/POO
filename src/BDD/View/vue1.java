package BDD.View;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLRecoverableException;

public class vue1 {

    public void showvue(ResultSet resultat) throws SQLException{

        try {
            System.out.println("Liste des candidats");

            while (resultat.next())
            {
                String nom = resultat.getString("nom");
                String prenom = resultat.getNString("prenom");
                String courriel = resultat.getNString("courriel");
                System.out.println(nom + "\t" + prenom + "\t" + courriel);

            }

        }

        catch (SQLException se){
            se.getMessage();
        }
    }
}
