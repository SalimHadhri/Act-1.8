import java.util.ArrayList;
import java.util.List;

import Interfaces.GroupePredateurAction;
import Models.GroupeLion;
import Models.GroupePredateur;
import Models.Lion;
import Models.Lion.FacteurDomination;
import Models.Lion.RangDomination;
import Models.Pr�dateur;
import Models.Pr�dateur.Categorie;
import Models.Pr�dateur.GroupeorSolitraire;
import Models.Pr�dateur.Nourriture;
import Models.Pr�dateur.Sexe;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Pr�dateur lion11 = new Lion(FacteurDomination.dominant, RangDomination.APLHA, 1,Sexe.male, Categorie.jeune , 5, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		lion11.seNourrir(); 
		lion11.chasser();
		System.out.println("******************Son son va ====>***************");
		lion11.emettreSon(2);
		System.out.println("******************Affichage des caracteristiques du lion***************");
		System.out.println(lion11.toString());
			
		/***********************************************************************************************************************/
		
		Pr�dateur lion12 = new Lion(FacteurDomination.nonDominant, RangDomination.BETA, 2,Sexe.male, Categorie.jeune , 2, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Pr�dateur lion13 = new Lion(FacteurDomination.dominant, RangDomination.GAMA, 3,Sexe.male, Categorie.vieux , 3, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Pr�dateur lion14 = new Lion(FacteurDomination.nonDominant, RangDomination.APLHA, 4,Sexe.male, Categorie.jeune , 4, GroupeorSolitraire.groupe ,Nourriture.omnivore) ;
		Pr�dateur lion15 = new Lion(FacteurDomination.dominant, RangDomination.OMEGA, 5,Sexe.femelle, Categorie.jeune , 5, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Pr�dateur lion16 = new Lion(FacteurDomination.nonDominant, RangDomination.APLHA, 6,Sexe.male, Categorie.vieux , 6, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Pr�dateur lion17 = new Lion(FacteurDomination.dominant, RangDomination.OMEGA, 7,Sexe.male, Categorie.jeune , 7, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Pr�dateur lion18 = new Lion(FacteurDomination.dominant, RangDomination.BETA, 8,Sexe.femelle, Categorie.jeune , 8, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Pr�dateur lion19 = new Lion(FacteurDomination.nonDominant, RangDomination.BETA, 9,Sexe.femelle, Categorie.jeune , 9, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Pr�dateur lion20 = new Lion(FacteurDomination.dominant, RangDomination.BETA, 10,Sexe.male, Categorie.jeune , 10, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Pr�dateur lion21 = new Lion(FacteurDomination.dominant, RangDomination.GAMA, 11,Sexe.male, Categorie.jeune , 11, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		/***********************************************************************************************************************/
		
		List<Pr�dateur> lions = new ArrayList<Pr�dateur>() ;
		lions.add(lion12) ;
		
		List<Pr�dateur> lions1 = new ArrayList<Pr�dateur>() ;
		lions1.add(lion11) ;
		lions1.add(lion14) ;
		lions1.add(lion15) ;
		
		List<Pr�dateur> lions2 = new ArrayList<Pr�dateur>() ;
		lions2.add(lion13) ;
		lions2.add(lion14) ;
		lions2.add(lion15) ;
	
		List<Pr�dateur> lions3 = new ArrayList<Pr�dateur>() ;
		lions3.add(lion13) ;
		lions3.add(lion14) ;
		lions3.add(lion15) ;
	
		List<Pr�dateur> lions4 = new ArrayList<Pr�dateur>() ;
		lions4.add(lion13) ;
		lions4.add(lion14) ;
		lions4.add(lion15) ;
	
		List<Pr�dateur> lions5 = new ArrayList<Pr�dateur>() ;
		lions5.add(lion13) ;
		lions5.add(lion14) ;
		lions5.add(lion15) ;
		
		List<Pr�dateur> lions6 = new ArrayList<Pr�dateur>() ;
		lions6.add(lion12) ;
		lions6.add(lion14) ;
		lions6.add(lion15) ;
		
		
		List<Pr�dateur> lions7 = new ArrayList<Pr�dateur>() ;
		lions7.add(lion12) ;
		
		Lion[] couple1Dominant = new Lion[2] ;
		
		couple1Dominant[0] = (Lion) lion13 ;
		couple1Dominant[1] = (Lion) lion18 ;
			
		Lion[] couple2Dominant = new Lion[2] ;
		
		couple2Dominant[0] = (Lion) lion17 ;
		couple2Dominant[1] = (Lion) lion15 ;
				
		GroupeLion pre1 = new GroupeLion(lions, 6,couple1Dominant,2,"AFRIQUE") ;
		GroupeLion pre2 = new GroupeLion(lions7, 9,couple2Dominant,2,"EUROPE") ;
		
		
		System.out.println("********************premier groupe de pr�dateur de pr�dateurs qui sont des lions sont :*****************") ;
		pre1.afficherCaracteristiquesPredateurs();
		System.out.println("********************deuxiemme groupe de predateur*****************");
		pre2.afficherCaracteristiquesPredateurs();
		System.out.println("***************Ajout de deux predateurs dans le premier groupe:*************") ;
		pre1.ajouterPredateur(lion17);
		pre1.ajouterPredateur(lion19);
		pre1.afficherCaracteristiquesPredateurs();	
		System.out.println("******************** changons de couple pour le premier groupe de pr�dateurs*****************") ;
		Lion[] ancienCouple = (Lion[]) pre1.getCoupleLionDominant() ;
		pre1.construireCoupleDominant((Lion) lion17) ;
		
		if (pre1.getCoupleLionDominant()==ancienCouple) {
			System.out.println("PAs de nouveau couple dominant");
		}
		else {
			pre1.afficherCouple ();	
		}
		
		System.out.println("***************changons encore de couple:*************") ;
		Pr�dateur[] ancienCouple2 = pre1.getCoupleLionDominant() ;
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
		
	}
}


