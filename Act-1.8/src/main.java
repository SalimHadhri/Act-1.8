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

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Lion lion11 = new Lion(FacteurDomination.dominant, RangDomination.APLHA, 1,"masculin", Categorie.jeune , 5, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		lion11.seNourrir(); 
		lion11.chasser();
		System.out.println("******************Son son va ====>***************");
		lion11.emettreSon(2);
		System.out.println("******************Affichage des caracteristiques du lion***************");
		System.out.println(lion11.toString());
			
		/***********************************************************************************************************************/
		
		Lion lion12 = new Lion(FacteurDomination.nonDominant, RangDomination.BETA, 2,"masculin", Categorie.jeune , 2, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Lion lion13 = new Lion(FacteurDomination.dominant, RangDomination.GAMA, 3,"masculin", Categorie.vieux , 3, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Lion lion14 = new Lion(FacteurDomination.nonDominant, RangDomination.APLHA, 4,"masculin", Categorie.jeune , 4, GroupeorSolitraire.groupe ,Nourriture.omnivore) ;
		Lion lion15 = new Lion(FacteurDomination.dominant, RangDomination.OMEGA, 5,"masculin", Categorie.jeune , 5, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Lion lion16 = new Lion(FacteurDomination.nonDominant, RangDomination.APLHA, 6,"masculin", Categorie.vieux , 6, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Lion lion17 = new Lion(FacteurDomination.dominant, RangDomination.OMEGA, 7,"masculin", Categorie.jeune , 7, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;
		Lion lion18 = new Lion(FacteurDomination.dominant, RangDomination.BETA, 8,"feminin", Categorie.jeune , 8, GroupeorSolitraire.solitaire ,Nourriture.omnivore) ;

		/***********************************************************************************************************************/
		
		List<Lion> lions = new ArrayList<Lion>() ;
		lions.add(lion12) ;
		lions.add(lion14) ;
		lions.add(lion15) ;
		
		List<Prédateur> lions1 = new ArrayList<Prédateur>() ;
		lions1.add(lion11) ;
		
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
		
		List<Lion> lions6 = new ArrayList<Lion>() ;
		lions6.add(lion12) ;
		lions6.add(lion14) ;
		lions6.add(lion15) ;
		
		
		List<Lion> lions7 = new ArrayList<Lion>() ;
		lions7.add(lion12) ;
		
	
		FacteurDomination[] couple1 = {FacteurDomination.dominant,FacteurDomination.nonDominant};
		FacteurDomination[] couple2= {FacteurDomination.nonDominant,FacteurDomination.nonDominant};
		FacteurDomination[] couple3= {FacteurDomination.dominant,FacteurDomination.dominant};
		
		GroupeLion pre1 = new GroupeLion(lions, 6,couple1,lions1, 2,"AFRIQUE") ;
		GroupeLion pre2 = new GroupeLion(lions7, 6,couple1,lions2, 2,"EUROPE") ;
		
		System.out.println("********************les deux groupes de prédateurs sont :*****************") ;
		pre1.afficherCaracteritiques();
		pre2.afficherCaracteritiques();
		
		
		System.out.println("***************Ajout de deux predateurs dans la premiere liste:*************") ;
		pre1.ajouterPredateur(lion16);
		pre1.ajouterPredateur(lion17);
		pre1.afficherCaracteritiques() ;
		
		System.out.println("***************Supression d'un predateur : **************") ;
		pre1.enleverPredateur(lion14);
		pre1.afficherCaracteritiques() ;
		
		System.out.println("***************Et les 3 prédateurs, en l'occurence des lions, sont: **************") ;
		pre1.afficherCaracteristiquesPredateurs();
		
		
		
	}

}
