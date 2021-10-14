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

		
		Lion lion1 = new Lion(FacteurDomination.dominant, RangDomination.APLHA, 5,"masculin", Categorie.jeune , 5, GroupeorSolitraire.solitaire ,
				Nourriture.omnivore) ;
		lion1.seNourrir(); 
		lion1.chasser();
		lion1.emettreunSon(2);
		System.out.println(lion1.toString());
		
		
		/////////////////////////////////////////////////////////////////
		
		Lion lion2 = new Lion(FacteurDomination.nonDominant, RangDomination.BETA, 5,"masculin", Categorie.jeune , 5, GroupeorSolitraire.solitaire ,
				Nourriture.omnivore) ;
		Lion lion3 = new Lion(FacteurDomination.dominant, RangDomination.GAMA, 5,"masculin", Categorie.vieux , 5, GroupeorSolitraire.solitaire ,
				Nourriture.omnivore) ;
		Lion lion4 = new Lion(FacteurDomination.nonDominant, RangDomination.APLHA, 5,"masculin", Categorie.jeune , 5, GroupeorSolitraire.groupe ,
				Nourriture.omnivore) ;
		Lion lion5 = new Lion(FacteurDomination.dominant, RangDomination.OMEGA, 8,"masculin", Categorie.jeune , 5, GroupeorSolitraire.solitaire ,
				Nourriture.omnivore) ;
		
		
		/////////////////////////////////////////////////
		List<Lion> lions = new ArrayList<Lion>() ;
		lions.add(lion2) ;
		lions.add(lion4) ;
		lions.add(lion5) ;
		
		List<Prédateur> lions1 = new ArrayList<Prédateur>() ;
		lions.add(lion1) ;
		lions.add(lion3) ;
		lions.add(lion5) ;
		List<Prédateur> lions2 = new ArrayList<Prédateur>() ;
		lions.add(lion3) ;
		lions.add(lion4) ;
		lions.add(lion5) ;

	
		
		FacteurDomination[] couple1 = {FacteurDomination.dominant,FacteurDomination.nonDominant};
		FacteurDomination[] couple2= {FacteurDomination.nonDominant,FacteurDomination.nonDominant};
		FacteurDomination[] couple3= {FacteurDomination.dominant,FacteurDomination.dominant};
		

		GroupeLion pre1 = new GroupeLion(lions, 6,couple1,lions1, 2,"AFRIQUE") ;
		GroupeLion pre2 = new GroupeLion(lions, 6,couple1,lions2, 2,"EUROPE") ;
		
	//	GroupePredateur grp1 = pre1;
		//grp1.setGroupePredateur(lions1);
	//	GroupePredateur grp2 =  pre2 ;
	//	grp2.setGroupePredateur(lions2);
		
		pre1.afficherCaracteritiques();
		pre2.afficherCaracteritiques();
		

		pre1.ajouterPredateur(lion1);
		pre1.ajouterPredateur(lion2);
		pre1.afficherCaracteristiquesPredateurs();
		
		////////////////////////////////
		
		
		
		
		
		

		

	}

}
