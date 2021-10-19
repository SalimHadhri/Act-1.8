package Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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



	public List<Lion>  reproduireDesLions(int nbrLion) {
		
		List<Lion> reproductionDeLions = new ArrayList<Lion>() ;
		
		for (int i=0 ; i<nbrLion ; i++) {
			
			Lion newLion1 = new Lion();
			//public Lion(FacteurDomination facteurDomination, RangDomination rangDomination, int facteurImpetiosite,Sexe sexe, Categorie categorie, int force, GroupeorSolitraire groupeorSolitraire,Nourriture nourriture) 
			/*****************************************************************************************************************/
			
			System.out.println("** Saisissez le facteur de domination : 1/dominant ou 2/nonDominant************************************** ");
			Scanner saisieUtilisateur = new Scanner(System.in);
			String dom1 = saisieUtilisateur.next();
			if(dom1.equals("1")) {
				newLion1.setFacteurDomination(FacteurDomination.dominant);			
			}
			else if (dom1.equals("2")) {
			newLion1.setFacteurDomination(FacteurDomination.nonDominant);	
			}
			else {
				System.out.println(" Bad value") ;
			}
			
			/********************************************************************************/
			System.out.println(" Saisissez le rang de dominantion : 1/ALPHA ou 2/BETA ou 3/GAMA ou 4/OMEGA ");
			Scanner saisieUtilisateur1 = new Scanner(System.in);
			String rang = saisieUtilisateur1.next();
			if(rang.equals("1")) {
				newLion1.setRangDomination(RangDomination.APLHA);	
			}
			else if (rang.equals("2")) {
				newLion1.setRangDomination(RangDomination.BETA);	
			}
			else if (rang.equals("3")) {
				newLion1.setRangDomination(RangDomination.GAMA);	
			}
			else if (rang.equals("4")) {
				newLion1.setRangDomination(RangDomination.OMEGA);	
			}
			else {
				System.out.println(" Bad value") ;
			}
			/*********************************************************************************************/
			System.out.println(" facteur d'impesiosite : ");
			Scanner saisieUtilisateur2 = new Scanner(System.in);
			int imp = saisieUtilisateur2.nextInt();
			newLion1.setFacteurImpetiosite(imp);
			
			/*************************************************************************************************/
			
			System.out.println(" sexe : 1/male ou 2/femelle ");
			Scanner saisieUtilisateur3 = new Scanner(System.in);
			String sexe = saisieUtilisateur3.next();
			if(sexe.equals("1")) {
				newLion1.setSexe(Sexe.male);			
			}
			else if (sexe.equals("2") ){
				newLion1.setSexe(Sexe.femelle);	
			}
			else {
				System.out.println(" Bad value") ;
			}
			
			/***************************************************************************************/
			
			System.out.println(" categorie : 1/jeune ou 2/vieux ou 3/adulte");
			Scanner saisieUtilisateur4 = new Scanner(System.in);
			String categorie = saisieUtilisateur4.next();
			if(categorie.equals("1")) {
				newLion1.setCategorie(Categorie.jeune);			
			}
			else if (categorie.equals("2")) {
				newLion1.setCategorie(Categorie.vieux);	
			}
			else if (categorie.equals("3") ){
				newLion1.setCategorie(Categorie.adulte);	
			}
			else {
				System.out.println(" Bad value") ;
			}
			/***************************************************************************************/
			System.out.println(" force : ");
			Scanner saisieUtilisateur5 = new Scanner(System.in);
			int force = saisieUtilisateur5.nextInt();
			newLion1.setForce(force);
			
			/***************************************************************************************/
			
			System.out.println(" Il vit en  : 1/solitaire ou 2/groupe ");
			Scanner saisieUtilisateur6 = new Scanner(System.in);
			String groupe = saisieUtilisateur6.next();
			if(groupe.equals("1")) {
				newLion1.setGroupeorSolitraire(GroupeorSolitraire.solitaire);			
			}
			else if (groupe.equals("2")) {
				newLion1.setGroupeorSolitraire(GroupeorSolitraire.groupe) ;	
			}
			else {
				System.out.println(" Bad value") ;
			}
			/****************************************************************************************/
			System.out.println(" nourriture ?  : 1/omnivore ou 2/viande");
			Scanner saisieUtilisateur7 = new Scanner(System.in);
			String nourriture = saisieUtilisateur7.next();
			if(nourriture.equals("1")) {
				newLion1.setNourriture((Nourriture.omnivore));		
			}
			else if (nourriture.equals("2")) {
				newLion1.setNourriture((Nourriture.viande));			
			}
			else {
				System.out.println(" Bad value") ;
			}
			reproductionDeLions.add(newLion1) ;
			System.out.println(" **********************Première saisie avec succes !! passons au suivante si il y'en a ;)" );
			}
		return reproductionDeLions ;

	}
	
}
