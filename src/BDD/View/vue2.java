package BDD.View;

import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;

public class vue2 {
    public void showvue(ResultSet resultat) throws SQLException{

        try {
            System.out.println("Liste des candidats par specialite");

            while (resultat.next())
            {
                String nom = resultat.getString("nom");
                String prenom = resultat.getNString("prenom");
                String libelle  = resultat.getNString("libelle");
                System.out.println(nom + "\t" + prenom + "\t" + libelle);

            }

        }

        catch (SQLException se){
            se.getMessage();
        }
    }
}
