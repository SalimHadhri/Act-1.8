package Interfaces;
import java.util.List;

import Models.Lion;
import Models.Lion.FacteurDomination;
import Models.Pr�dateur;

public interface GroupeLionAction {

	public void construireCoupleDominant(Lion male) ;
	public void setLionNonDominant () ;
	public void afficherCouple () ;
	public List<Lion> declarerLionNonDominant() ;
	
	
}
