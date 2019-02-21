package cache.accesseur;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modele.DecodeurPenseesXML;
import modele.Pensee;
import outils.Journal;
import outils.JournalDesactivable;

public class PenseeDAO implements PenseeURL{

	protected DecodeurPenseesXML decodeur = new DecodeurPenseesXML();	
	
	public List<Pensee> listerPensees()
	{
		List<Pensee> listePensees = new ArrayList<Pensee>();
		JournalDesactivable.ecrire("listerPensees()");			
		Connection basededonnees = null;
		ResultSet curseurListePensees;
		try {
			basededonnees = DriverManager.getConnection(DSN);
			Statement requeteListePensees  = basededonnees.createStatement();
			curseurListePensees = requeteListePensees.executeQuery(SQL_LISTER_PENSEES);
			if(curseurListePensees==null) return listePensees; //null
			curseurListePensees.next();
		
			while(curseurListePensees.next())
			{
				String auteur = curseurListePensees.getString("auteur");
				String message = curseurListePensees.getString("message");
				System.out.println(auteur+"-"+message);
				listePensees.add(new Pensee(auteur,message));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listePensees;
	}
	
	public void enregistrerPensee(Pensee pensee)
	{
		JournalDesactivable.ecrire("enregistrerPensee()");			
		Connection basededonnees = null;

		try {
			basededonnees = DriverManager.getConnection(DSN);
			PreparedStatement requeteEnregistrerPensee = basededonnees.prepareStatement(SQL_ENREGISTRER_PENSEE);
			
			requeteEnregistrerPensee.setString(1, pensee.getAuteur());
			requeteEnregistrerPensee.setString(2, pensee.getMessage());
			
			requeteEnregistrerPensee.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
}

/*
 * 
 
Code de réponse 200
ajouterPensee()
stdClass Object
(
    [auteur] => Rossetti
    [message] => Ce qui est plus triste qu’une œuvre inachevée, c’est une œuvre jamais commencée.
    [annee] => 0
)
<?xml version="1.0" encoding="UTF-8"?><action>
	<type>ajouter</type>
	<moment>1523972018</moment>
	<succes>1</succes>
	<message>POST : Array
(
    [auteur] => Rossetti
    [message] => Ce qui est plus triste qu’une œuvre inachevée, c’est une œuvre jamais commencée.
    [annee] => 0
)
</message>
</action>
 
 *
 */
