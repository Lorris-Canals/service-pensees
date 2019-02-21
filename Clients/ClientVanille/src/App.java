import cache.accesseur.PenseeDAO;
import modele.Pensee;
import outils.Journal;
import vue.VueInspirationVisuelle;

public class App {

	public static void main(String[] args) {
		
		PenseeDAO cachePenseeDAO = new PenseeDAO();
		cachePenseeDAO.listerPensees();

		//Journal.activer();
		Journal.activerNiveau(0);
		
		//VueInspirationVisuelle.launch(VueInspirationVisuelle.class, args);
		
		cachePenseeDAO.enregistrerPensee(new Pensee("coucou","coucou"));

	}
	

}

