import java.util.ArrayList;
import java.util.List;

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
		
	}
}


