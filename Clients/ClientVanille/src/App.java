import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import accesseur.PenseeDAO;
import modele.Pensee;
import outils.Journal;
import vue.VueInspirationVisuelle;

public class App {

	public static void main(String[] args) {
		
		PenseeDAO cachePenseeDAO = new PenseeDAO();
		cachePenseeDAO.listerPensees();

		//Journal.activer();
		Journal.activerNiveau(0);
		
		/*
		List<Pensee> listePensees = penseeDAO.listerPensees();
		
		for(Iterator<Pensee> visiteur = listePensees.iterator(); visiteur.hasNext(); )
		{
			Pensee pensee = visiteur.next();
			Journal.ecrire(5, pensee.getMessage() + "(" + pensee.getAuteur() + ")");
		}

		Pensee pensee = new Pensee("Rossetti","Ce qui est plus triste qu une oeuvre inachevee, c est une oeuvre jamais commencee.");
		penseeDAO.ajouterPensee(pensee);
		
		VueInspirationVisuelle.launch(VueInspirationVisuelle.class, args);
		
		*/

	}
	

}

