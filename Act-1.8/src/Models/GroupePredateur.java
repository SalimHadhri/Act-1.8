package Models;

import java.util.List;

import Interfaces.GroupePredateurAction;

public abstract class GroupePredateur implements GroupePredateurAction{
	
	private  List<Prédateur> groupePredateur ;
	private int taille ;
	private String zoneGeographique ;	
	
	public GroupePredateur() {
	}
	
	public GroupePredateur(List<Prédateur> groupePredateur, int taille, String zoneGeographique) {
		this.groupePredateur = groupePredateur;
		this.taille = taille;
		this.zoneGeographique = zoneGeographique;
	}	

	public GroupePredateur(int taille, String zoneGeographique) {
		super();
		this.taille = taille;
		this.zoneGeographique = zoneGeographique;
	}

	public void afficherCaracteritiques () {
		
		System.out.println(this.toString());
	}
	
	public abstract  void afficherCaracteristiquesPredateurs (); 
	
	public  abstract void ajouterPredateur (Prédateur prePrédateur) ;
	
	public abstract void enleverPredateur (Prédateur prePrédateur); 

	public List<Prédateur> getGroupePredateur() {
		return groupePredateur;
	}
	
	public void setGroupePredateur(List<Prédateur> groupePredateur) {
		this.groupePredateur = groupePredateur;
	}
	
	public int getTaille() {
		return taille;
	}
	
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	public String getZoneGeographique() {
		return zoneGeographique;
	}
	
	public void setZoneGeographique(String zoneGeographique) {
		this.zoneGeographique = zoneGeographique;
	}

	@Override
	public String toString() {
		return "GroupePredateur [groupePredateur=" + groupePredateur + ", taille=" + taille + ", zoneGeographique="
				+ zoneGeographique + "]";
	}
	

}
