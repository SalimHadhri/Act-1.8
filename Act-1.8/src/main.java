import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Interfaces.GroupePredateurAction;
import Models.GroupeLion;
import Models.GroupePredateur;
import Models.Lion;
import Models.Lion.FacteurDomination;
import Models.Lion.RangDomination;
import Models.Prédateur;
import Models.Prédateur.Categorie;
import Models.Prédateur.GroupeorSolitraire;
import Models.Prédateur.Nourriture;
import Models.Prédateur.Sexe;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Prédateur lion11 = new Lion(FacteurDomination.dominant, RangDomination.APLHA, 1,Sexe.male, Categorie.jeune , 5, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		lion11.seNourrir(); 
		lion11.chasser();
		System.out.println("******************Son son va ====>***************");
		lion11.emettreSon(2);
		System.out.println("******************Affichage des caracteristiques du lion***************");
		System.out.println(lion11.toString());
			
		/***********************************************************************************************************************/
		
		Prédateur lion12 = new Lion(FacteurDomination.nonDominant, RangDomination.BETA, 2,Sexe.male, Categorie.jeune , 2, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Prédateur lion13 = new Lion(FacteurDomination.dominant, RangDomination.GAMA, 3,Sexe.male, Categorie.vieux , 3, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Prédateur lion14 = new Lion(FacteurDomination.nonDominant, RangDomination.APLHA, 4,Sexe.male, Categorie.jeune , 4, GroupeorSolitraire.groupe ,Nourriture.omnivore) ;
		Prédateur lion15 = new Lion(FacteurDomination.dominant, RangDomination.OMEGA, 5,Sexe.femelle, Categorie.jeune , 5, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Prédateur lion16 = new Lion(FacteurDomination.nonDominant, RangDomination.APLHA, 6,Sexe.male, Categorie.vieux , 6, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Prédateur lion17 = new Lion(FacteurDomination.dominant, RangDomination.OMEGA, 7,Sexe.male, Categorie.jeune , 7, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Prédateur lion18 = new Lion(FacteurDomination.dominant, RangDomination.BETA, 8,Sexe.femelle, Categorie.jeune , 8, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Prédateur lion19 = new Lion(FacteurDomination.nonDominant, RangDomination.BETA, 9,Sexe.femelle, Categorie.jeune , 9, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Prédateur lion20 = new Lion(FacteurDomination.dominant, RangDomination.BETA, 10,Sexe.male, Categorie.jeune , 10, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Prédateur lion21 = new Lion(FacteurDomination.dominant, RangDomination.GAMA, 11,Sexe.male, Categorie.jeune , 11, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		/***********************************************************************************************************************/
		
		List<Prédateur> lions = new ArrayList<Prédateur>() ;
		lions.add(lion12) ;
		
		List<Prédateur> lions1 = new ArrayList<Prédateur>() ;
		lions1.add(lion11) ;
		lions1.add(lion14) ;
		lions1.add(lion15) ;
		
		List<Prédateur> lions2 = new ArrayList<Prédateur>() ;
		lions2.add(lion13) ;
		lions2.add(lion14) ;
		lions2.add(lion15) ;
	
		List<Prédateur> lions3 = new ArrayList<Prédateur>() ;
		lions3.add(lion13) ;
		lions3.add(lion14) ;
		lions3.add(lion15) ;
	
		List<Prédateur> lions4 = new ArrayList<Prédateur>() ;
		lions4.add(lion13) ;
		lions4.add(lion14) ;
		lions4.add(lion15) ;
	
		List<Prédateur> lions5 = new ArrayList<Prédateur>() ;
		lions5.add(lion13) ;
		lions5.add(lion14) ;
		lions5.add(lion15) ;
		
		List<Prédateur> lions6 = new ArrayList<Prédateur>() ;
		lions6.add(lion12) ;
		lions6.add(lion14) ;
		lions6.add(lion15) ;
		
		
		List<Prédateur> lions7 = new ArrayList<Prédateur>() ;
		lions7.add(lion12) ;
		
		Lion[] couple1Dominant = new Lion[2] ;
		
		couple1Dominant[0] = (Lion) lion13 ;
		couple1Dominant[1] = (Lion) lion18 ;
			
		Lion[] couple2Dominant = new Lion[2] ;
		
		couple2Dominant[0] = (Lion) lion17 ;
		couple2Dominant[1] = (Lion) lion15 ;
				
		GroupeLion pre1 = new GroupeLion(lions, 6,couple1Dominant,2,"AFRIQUE") ;
		GroupeLion pre2 = new GroupeLion(lions7, 9,couple2Dominant,2,"EUROPE") ;
		
		
		System.out.println("********************premier groupe de prédateur de prédateurs qui sont des lions sont :*****************") ;
		pre1.afficherCaracteristiquesPredateurs();
		System.out.println("********************deuxiemme groupe de predateur*****************");
		pre2.afficherCaracteristiquesPredateurs();
		System.out.println("***************Ajout de deux predateurs dans le premier groupe:*************") ;
		pre1.ajouterPredateur(lion17);
		pre1.ajouterPredateur(lion19);
		pre1.afficherCaracteristiquesPredateurs();	
		System.out.println("******************** changons de couple pour le premier groupe de prédateurs*****************") ;
		Lion[] ancienCouple = (Lion[]) pre1.getCoupleLionDominant() ;
		pre1.construireCoupleDominant((Lion) lion17) ;
		
		if (pre1.getCoupleLionDominant()==ancienCouple) {
			System.out.println("PAs de nouveau couple dominant");
		}
		else {
			pre1.afficherCouple ();	
		}
		
		System.out.println("***************changons encore de couple:*************") ;
		Prédateur[] ancienCouple2 = pre1.getCoupleLionDominant() ;
		pre1.construireCoupleDominant((Lion) lion21) ;
		if (pre1.getCoupleLionDominant()==ancienCouple2) {
			System.out.println("PAs de nouveau couple dominant");
		}
		else {
			pre1.afficherCouple ();	
		}

		System.out.println("******************** Y a t'il un nouveau couple ?:*****************") ;

		Lion[] ancienCouple4 = (Lion[]) pre1.getCoupleLionDominant() ;
		pre1.construireCoupleDominant((Lion) lion13) ;
		
		if (pre1.getCoupleLionDominant()==ancienCouple4) {
			System.out.println("PAs de nouveau couple dominant");
		}
		else {
			pre1.afficherCouple () ;
		}
		
		System.out.println("***************Supression d'un predateur de ce groupre de predateur===> et ils en restent 2 : **************") ;

		pre1.enleverPredateur(lion19);
		pre1.afficherCaracteristiquesPredateurs();	
		
		System.out.println("***************déclarer les lions non dominant du premier groupe de prédateurs: **************") ;
		List<Prédateur> allPre = new ArrayList<Prédateur>() ;
		
		allPre.add( lion12);		
		allPre.add( lion13);
		allPre.add(lion14);
		allPre.add( lion15);
		allPre.add( lion16);
		allPre.add( lion17);
		allPre.add(lion18);
		allPre.add( lion19);
		allPre.add( lion20);
		allPre.add( lion21);
		
		
		GroupeLion hdzebid = new GroupeLion() ;
		hdzebid.setListLion(allPre);

		List<Lion> lll=hdzebid.declarerLionNonDominant() ;
		for (int i = 0 ;i<lll.size();i++) {
			System.out.println(lll.get(i).toString());
		}
		System.out.println("***************Faisons une nouvelle reproduction de lions && entrez les informations requise a chaque lion qu'on va intégrer **************") ;
		
		List<Prédateur> reproductionDeLions = new ArrayList<Prédateur>() ;
		System.out.println("******************************************************************* Combien de lions voulez-vous reproduire ? : *************************************************");
		Scanner iterateur = new Scanner(System.in);
		int it = iterateur.nextInt();
		
		for (int i=0 ; i<it ; i++) {
		
		Lion newLion1 = new Lion();
		//public Lion(FacteurDomination facteurDomination, RangDomination rangDomination, int facteurImpetiosite,Sexe sexe, Categorie categorie, int force, GroupeorSolitraire groupeorSolitraire,Nourriture nourriture) 
		/*****************************************************************************************************************/
		
		System.out.println("** Saisissez le facteur de domination : nonDominant ou dominant************************************** ");
		Scanner saisieUtilisateur = new Scanner(System.in);
		String dom1 = saisieUtilisateur.next();
		if(dom1.equals("dominant")) {
			newLion1.setFacteurDomination(FacteurDomination.dominant);			
		}
		else if (dom1.equals("nonDominant")) {
		newLion1.setFacteurDomination(FacteurDomination.nonDominant);	
		}
		else {
			System.out.println(" Bad value") ;
		}
		
		/********************************************************************************/
		System.out.println(" Saisissez le rang de dominantion : ALPHA ou BETA ou GAMA ou OMEGA ");
		Scanner saisieUtilisateur1 = new Scanner(System.in);
		String rang = saisieUtilisateur1.next();
		if(rang.equals("ALPHA")) {
			newLion1.setRangDomination(RangDomination.APLHA);	
		}
		else if (rang.equals("BETA")) {
			newLion1.setRangDomination(RangDomination.BETA);	
		}
		else if (rang.equals("GAMA")) {
			newLion1.setRangDomination(RangDomination.GAMA);	
		}
		else if (rang.equals("OMEGA")) {
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
		
		System.out.println(" sexe : male ou femelle ");
		Scanner saisieUtilisateur3 = new Scanner(System.in);
		String sexe = saisieUtilisateur3.next();
		if(sexe.equals("male")) {
			newLion1.setSexe(Sexe.male);			
		}
		else if (sexe.equals("femelle") ){
			newLion1.setSexe(Sexe.femelle);	
		}
		else {
			System.out.println(" Bad value") ;
		}
		
		/***************************************************************************************/
		
		System.out.println(" categorie : jeune ou vieux ou adulte");
		Scanner saisieUtilisateur4 = new Scanner(System.in);
		String categorie = saisieUtilisateur4.next();
		if(categorie.equals("jeune")) {
			newLion1.setCategorie(Categorie.jeune);			
		}
		else if (categorie.equals("vieux")) {
			newLion1.setCategorie(Categorie.vieux);	
		}
		else if (categorie.equals("adulte") ){
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
		
		System.out.println(" Il vit en  : solitaire ou groupe ");
		Scanner saisieUtilisateur6 = new Scanner(System.in);
		String groupe = saisieUtilisateur6.next();
		if(groupe.equals("solitaire")) {
			newLion1.setGroupeorSolitraire(GroupeorSolitraire.solitaire);			
		}
		else if (groupe.equals("groupe")) {
			newLion1.setGroupeorSolitraire(GroupeorSolitraire.groupe) ;	
		}
		else {
			System.out.println(" Bad value") ;
		}
		/****************************************************************************************/
		System.out.println(" nourriture ?  : omnivore ou viande");
		Scanner saisieUtilisateur7 = new Scanner(System.in);
		String nourriture = saisieUtilisateur7.next();
		if(nourriture.equals("omnivore")) {
			newLion1.setNourriture((Nourriture.omnivore));		
		}
		else if (nourriture.equals("viande")) {
			newLion1.setNourriture((Nourriture.viande));			
		}
		else {
			System.out.println(" Bad value") ;
		}
		reproductionDeLions.add(newLion1) ;
		System.out.println(" **********************Première saisie avec succes !! passons au suivante si il y'en a ;)" );
		}
		
		/*************************************************************************************/
		System.out.println(" ***************************************************On a fini notre reproduction et la liste est comme suit: *****************************************************************");
		for(int i =0 ; i<reproductionDeLions.size();i++) {
			
			System.out.println(reproductionDeLions.get(i).toString());
		}
		
	}
}


