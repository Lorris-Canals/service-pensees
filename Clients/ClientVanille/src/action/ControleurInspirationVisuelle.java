package action;

import javafx.fxml.FXML;
import java.util.Iterator;
import java.util.List;

import accesseur.PenseeDAO;
import javafx.event.ActionEvent;
import modele.Pensee;
import outils.Journal;
import vue.VueInspirationVisuelle;

public class ControleurInspirationVisuelle{
	
	protected PenseeDAO penseeDAO = new PenseeDAO();
	
	
	public ControleurInspirationVisuelle()
	{
		List<Pensee> listePensees = penseeDAO.listerPensees();
		
		for(Iterator<Pensee> visiteur = listePensees.iterator(); visiteur.hasNext(); )
		{
			Pensee pensee = visiteur.next();		
			Journal.ecrire(5, pensee.getMessage() + "(" + pensee.getAuteur() + ")");
		}
		ControleurInspirationVisuelle.instance = this;
	}
	protected static ControleurInspirationVisuelle instance = null;
	public static ControleurInspirationVisuelle getInstance() {return ControleurInspirationVisuelle.instance;}

	@FXML protected void trouverInspiration(ActionEvent evenement) {
    	
    	System.out.println("trouverInspiration()");
    	VueInspirationVisuelle.getInstance().afficherListePensees(penseeDAO.trouverPensee());


    }
	
	public void initialiser() {
		VueInspirationVisuelle.getInstance().afficherListePensees(penseeDAO.listerPensees());
	}
	
}
