package Models;

import java.util.List;

import Interfaces.GroupeLionAction;
import Interfaces.GroupePredateurAction;
import Models.Lion.FacteurDomination;
import Models.Lion.RangDomination;
import Models.Prédateur.Categorie;
import Models.Prédateur.GroupeorSolitraire;
import Models.Prédateur.Nourriture;



public class GroupeLion extends GroupePredateur implements GroupeLionAction  {
	
	private List<Lion> listLion   ;
	private int puissance ;	
	private FacteurDomination[] couple = new FacteurDomination[] {FacteurDomination.dominant,FacteurDomination.dominant}; 
	
	public GroupeLion() {
		super();
	}

	public GroupeLion(List<Lion> listLion, int puissance, FacteurDomination[] couple,List<Prédateur> groupePredateur, int taille, String zoneGeographique) {
		super( groupePredateur,  taille,  zoneGeographique);
		this.listLion = listLion;
		this.puissance = puissance;
		this.couple = couple;
	}
	
	public FacteurDomination[] construireCoupleDominant(FacteurDomination male) {
		FacteurDomination[] newCouple = new FacteurDomination[2] ;
		Lion newDominant = new Lion(FacteurDomination.dominant) ;
		if (male.equals(FacteurDomination.dominant)) {
			newCouple[0] = male ;
			newCouple[1] = newDominant.getFacteurDomination() ;		
		}
		return newCouple ;
		
	}
	
	public void setLionNonDominant () {
		for(int i=0 ; i<listLion.size();i++) {
			listLion.get(i).setFacteurDomination(FacteurDomination.nonDominant);
		}
	}
		
	public void reproductionLions (List<Lion> lions) {	
	listLion=lions ;
	}

	public List<Lion> getListLion() {
		return listLion;
	}

	public void setListLion(List<Lion> listLion) {
		this.listLion = listLion;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public FacteurDomination[] getCouple() {
		return couple;
	}

	public void setCouple(FacteurDomination[] couple) {
		this.couple = couple;
	}

}
