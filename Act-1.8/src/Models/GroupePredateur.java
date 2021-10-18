package Models;

import java.util.List;

import Interfaces.GroupePredateurAction;

public abstract class GroupePredateur implements GroupePredateurAction{
	
	private  List<Pr�dateur> groupePredateur ;
	private int taille ;
	private String zoneGeographique ;	
	
	public GroupePredateur() {
	}
	
	public GroupePredateur(List<Pr�dateur> groupePredateur, int taille, String zoneGeographique) {
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
	
	public  abstract void ajouterPredateur (Pr�dateur prePr�dateur) ;
	
	public abstract void enleverPredateur (Pr�dateur prePr�dateur); 

	public List<Pr�dateur> getGroupePredateur() {
		return groupePredateur;
	}
	
	public void setGroupePredateur(List<Pr�dateur> groupePredateur) {
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
