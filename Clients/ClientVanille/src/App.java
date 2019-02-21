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
		
		VueInspirationVisuelle.launch(VueInspirationVisuelle.class, args);
		
		cachePenseeDAO.enregistrerPensee(new Pensee("coucou","coucou"));

	}
	

}

