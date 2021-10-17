package Interfaces;
import java.util.List;

import Models.Lion;
import Models.Lion.FacteurDomination;

public interface GroupeLionAction {

	public void reproductionLions (List<Lion> lions) ;
	public FacteurDomination[] construireCoupleDominant(FacteurDomination male) ;
	public void setLionNonDominant () ;
	
}
