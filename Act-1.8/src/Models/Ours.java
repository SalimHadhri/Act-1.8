package Models;
import Interfaces.OursAction;
import Models.Ours.StatutHivernation;
import Models.Prédateur.Categorie;
import Models.Prédateur.GroupeorSolitraire;
import Models.Prédateur.Nourriture;

public class Ours  extends Prédateur implements OursAction {
		
	private int facteurAgressivite  ;
	private float puissance ;
	private StatutHivernation statutHivernation ;	
	enum StatutHivernation {enCours ,terminée };
	
	public Ours() {
		super() ;
	}

	public Ours(int facteurAgressivite, float puissance, StatutHivernation statutHivernation,String sexe, Categorie categorie, int force, GroupeorSolitraire groupeorSolitraire,Nourriture nourriture) {
		super( sexe,  categorie,  force,  groupeorSolitraire,nourriture);
		this.facteurAgressivite = facteurAgressivite;
		this.puissance = puissance;
		this.statutHivernation = statutHivernation;
	}

	public void seNourrir() {
		super.setNourriture(Nourriture.omnivore);	
	}

	public void chasser() {
		super.setGroupeorSolitraire(GroupeorSolitraire.solitaire);
	}
	
	public   void emettreunSon(int typeSon) {
		switch (typeSon) {
		case 1:
			System.out.println("Exprimer la peur") ;
			break;
		case 2 : 
			System.out.println("Exprimer sa présence") ;
			break;
		case 3 : 
			System.out.println("Effrayer un autre prédateur") ;
			break;
		case 4: 
			System.out.println("Exprimer l’agressivité") ;
			break;
		default:
			break;
		}		
	}
	
	public String afficherCaracteristiques() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void grimper() {
		// TODO Auto-generated method stub	
	}


	public void creuser() {
		// TODO Auto-generated method stub	
	}

	public void hiverner() {
		// TODO Auto-generated method stub
	}

	public void hurler() {
		// TODO Auto-generated method stub	
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
	public void emettreSon(int typeSon) {
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
	
	public int getFacteurAgressivite() {
		return facteurAgressivite;
	}

	public void setFacteurAgressivite(int facteurAgressivite) {
		this.facteurAgressivite = facteurAgressivite;
	}

	public float getPuissance() {
		return puissance;
	}

	public void setPuissance(float puissance) {
		this.puissance = puissance;
	}

	public StatutHivernation getStatutHivernation() {
		return statutHivernation;
	}

	public void setStatutHivernation(StatutHivernation statutHivernation) {
		this.statutHivernation = statutHivernation;
	}

}