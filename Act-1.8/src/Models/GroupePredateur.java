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
	
	

	public void afficherCaracteritiques () {
		
		System.out.println(this.toString());
	}
	
	public void afficherCaracteristiquesPredateurs () {

		for (int i = 0; i < groupePredateur.size(); i++) {
		      System.out.println(groupePredateur.get(i).toString());
		    }
		
	}
	
	public  void ajouterPredateur (Prédateur prePrédateur) {
	
		groupePredateur.add(prePrédateur) ;
	}
	
	public void enleverPredateur (Prédateur prePrédateur) {
		
		for (int i = 0; i < groupePredateur.size(); i++) {
		      if (! groupePredateur.get(i).equals(prePrédateur) )   {
		    	  groupePredateur.remove(i) ;
		    	  
		      }
		    }	
	}
	
	

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
		return "GroupePredateur [taille=" + taille + ", zoneGeographique=" + zoneGeographique + "]";
	}
	
	
	
	
	

}
