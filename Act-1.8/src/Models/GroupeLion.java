package Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Interfaces.GroupeLionAction;
import Interfaces.GroupePredateurAction;
import Models.Lion.FacteurDomination;
import Models.Lion.RangDomination;
import Models.Prédateur.Categorie;
import Models.Prédateur.GroupeorSolitraire;
import Models.Prédateur.Nourriture;
import Models.Prédateur.Sexe;



public class GroupeLion extends GroupePredateur implements GroupeLionAction  {
	
	private List<Prédateur> listLion   ;
	private int puissance ;	
//	private FacteurDomination[] couple = new FacteurDomination[] {FacteurDomination.dominant,FacteurDomination.dominant}; 
	
	// [male + femelle ]
	private Prédateur[] coupleLionDominant = new Lion[2] ;
	public GroupeLion() {
		super();
	}
	
	

	public GroupeLion(List<Prédateur> listLion, int puissance, Lion[] coupleDominant, int taille, String zoneGeographique) {
		super(taille,  zoneGeographique);
		this.listLion = listLion;
		this.puissance = puissance;
		this.coupleLionDominant = coupleDominant;
	}

	
	public  void afficherCaracteristiquesPredateurs () {
		for (int i = 0; i < listLion.size(); i++) {
		      System.out.println("la puissance : "+puissance);
		      System.out.println("la liste des lions : "+listLion.get(i).toString());
		      afficherCouple ();
		}	
	}
	public  void ajouterPredateur (Prédateur prePrédateur) {
		
		listLion.add((Lion)prePrédateur) ;
	}
	
	public void enleverPredateur (Prédateur prePrédateur) {		
		for (int i = 0; i < listLion.size(); i++) {
		      if (listLion.get(i).equals((Lion)prePrédateur) )   {
		    	  listLion.remove(i) ;
		    	  
		      }
		 }	
	}
	
	public void afficherCouple () {
		
		System.out.println("notre couple est : ") ;
		System.out.println("male: "+ coupleLionDominant[0]);
		System.out.println("femelle: "+ coupleLionDominant[1]);
		
	}


	public Prédateur[] getCoupleLionDominant() {
		return coupleLionDominant;
	}



	public void setCoupleLionDominant(Lion[] coupleLionDominant) {
		this.coupleLionDominant = coupleLionDominant;
	}



	public void construireCoupleDominant(Lion male) {

		Lion[] newCouple = new Lion[2] ;
		newCouple [0] = (Lion) male ;
		int i = 0 ;
		 while( (i<listLion.size()) ) {
	
		if (male.getFacteurDomination().equals(FacteurDomination.dominant)&& 
				(listLion.get(i).getSexe().equals(Sexe.femelle) )&& !listLion.get(i).equals(male)){
	

			newCouple [1] = (Lion) listLion.get(i) ;
			}	
		i++;
		 }
		this.coupleLionDominant = newCouple ;
		
		
	}
	
	public List<Lion> declarerLionNonDominant(){
		List<Lion> lions = new ArrayList<Lion>() ;
		for (int i = 0; i<listLion.size();i++) {
			
			if(((Lion)listLion.get(i)).getFacteurDomination().equals(FacteurDomination.nonDominant)) {
				lions.add((Lion)listLion.get(i));
			}
		}
		return lions ;
	}
	
	public void setLionNonDominant () {
		for(int i=0 ; i<listLion.size();i++) {
			((Lion) listLion.get(i)).setFacteurDomination(FacteurDomination.nonDominant);
		}
	}
		
	

	public List<Prédateur> getListLion() {
		return listLion;
	}



	public void setListLion(List<Prédateur> listLion) {
		this.listLion = listLion;
	}



	public void setCoupleLionDominant(Prédateur[] coupleLionDominant) {
		this.coupleLionDominant = coupleLionDominant;
	}



	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	@Override
	public String toString() {
		return "GroupeLion [listLion=" + listLion + ", puissance=" + puissance + ", coupleLionDominant="
				+"male ==> "+coupleLionDominant[0]+ "femelle ==> "+ coupleLionDominant[1] +"]";
	}
	
}
