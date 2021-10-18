package Models;
import Interfaces.GroupePredateurAction;

public abstract class Pr�dateur implements GroupePredateurAction {
	
	private Sexe sexe ;
	private  Categorie categorie;
	private int force ;
	private GroupeorSolitraire groupeorSolitraire;
	private Nourriture nourriture ;
	public enum GroupeorSolitraire {groupe ,solitaire };
	public enum Nourriture {viande,omnivore};
	public enum Categorie {jeune , adulte, vieux };	
	public enum Sexe {male , femelle};	
	
	public Pr�dateur() {
	}
	
	public Pr�dateur(Sexe sexe, Categorie categorie, int force, GroupeorSolitraire groupeorSolitraire,Nourriture nourriture) {
		this.sexe = sexe;
		this.categorie = categorie;
		this.force = force;
		this.groupeorSolitraire = groupeorSolitraire;
		this.nourriture = nourriture;
	}

	public abstract void seNourrir();

	public abstract void chasser();

	public abstract  void emettreSon(int typeSon) ;
	
	public void courrir() {
		// TODO Auto-generated method stub	
	}

	public void seReproduire() {
		// TODO Auto-generated method stub	
	}

	public GroupeorSolitraire getGroupeorSolitraire() {
		return groupeorSolitraire;
	}

	public void setGroupeorSolitraire(GroupeorSolitraire groupeorSolitraire) {
		this.groupeorSolitraire = groupeorSolitraire;
	}

	public Sexe getSexe() {
		return sexe;
	}
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}


	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Nourriture getNourriture() {
		return nourriture;
	}


	public void setNourriture(Nourriture nourriture) {
		this.nourriture = nourriture;
	}

	@Override
	public String toString() {
		return "Pr�dateur [sexe=" + sexe + ", categorie=" + categorie + ", force=" + force + ", groupeorSolitraire="
				+ groupeorSolitraire + ", nourriture=" + nourriture + "]";
	}
		
}