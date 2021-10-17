package Models;
import Interfaces.LionAction;
import Models.Prédateur.Categorie;
import Models.Prédateur.GroupeorSolitraire;
import Models.Prédateur.Nourriture;

public class Lion   extends Prédateur implements LionAction{
	
	private FacteurDomination facteurDomination ;
	private RangDomination rangDomination ;
	private int facteurImpetiosite ;		
	public enum FacteurDomination {dominant ,nonDominant };	
	public enum RangDomination {APLHA ,BETA ,GAMA ,OMEGA}		;

	public Lion() {
		super() ;
	}

	public Lion(FacteurDomination facteurDomination) {
		super();
		this.facteurDomination = facteurDomination;
	}

	public Lion(FacteurDomination facteurDomination, RangDomination rangDomination, int facteurImpetiosite,String sexe, Categorie categorie, int force, GroupeorSolitraire groupeorSolitraire,Nourriture nourriture) {
		super( sexe,  categorie,  force,  groupeorSolitraire,nourriture);			 
		this.facteurDomination = facteurDomination;
		this.rangDomination = rangDomination;
		this.facteurImpetiosite = facteurImpetiosite;
	}

	public  void emettreSon(int typeSon) {
		switch (typeSon) {
		case 1:
			System.out.println("Exprimer l’appartenance à un groupe") ;
			break;
		case 2 : 
			System.out.println("Exprimer la domination") ;
			break;
		case 3 : 
			System.out.println("Exprimer la soumission") ;
			break;
		case 4: 
			System.out.println("Exprimer l’agressivité") ;
			break;
		default:
			break;
		}	
	}
	
	public void chasser() {	
		super.setGroupeorSolitraire(GroupeorSolitraire.groupe);	
	}
	
	public void seNourrir() {
		super.setNourriture(Nourriture.viande);	
	}
	
	public String[] AfficherCaracteristiques() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void rugir() {
		// TODO Auto-generated method stub
		
	}
	public void entendreSon(boolean avalable) {
		// TODO Auto-generated method stub
		
	}

	public void seSeparerGroup() {
		// TODO Auto-generated method stub
		
	}
	
	public String[] afficherCaracteristiques() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void courrir() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void seReproduire() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void afficherCaracteritiques() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void afficherCaracteristiquesPredateurs() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void ajouterPredateur(Prédateur prePrédateur) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void enleverPredateur(Prédateur prePrédateur) {
		// TODO Auto-generated method stub	
	}

	public FacteurDomination getFacteurDomination() {
		return facteurDomination;
	}

	public void setFacteurDomination(FacteurDomination facteurDomination) {
		this.facteurDomination = facteurDomination;
	}

	public RangDomination getRangDomination() {
		return rangDomination;
	}

	public void setRangDomination(RangDomination rangDomination) {
		this.rangDomination = rangDomination;
	}

	public int getFacteurImpetiosite() {
		return facteurImpetiosite;
	}
	
	public void setFacteurImpetiosite(int facteurImpetiosite) {
		this.facteurImpetiosite = facteurImpetiosite;
	}

	@Override
	public String toString() {
		return "Lion [facteurDomination=" + facteurDomination + ", rangDomination=" + rangDomination
				+ ", facteurImpetiosite=" + facteurImpetiosite + ", nourriture : "+super.getNourriture()+ ", Il vit en : " +super.getGroupeorSolitraire() + " ]";
	}


	
}