package fr.univ.nantes.m1alma;

import java.util.Vector;

public class Personne {
	private long id;
	private String nom;
	private String prenom;
	private Vector<Personne> followers;
	private Vector<String> TL;
	
	public Personne(String nom, String prenom) {
	//super();
	id = -1;
	this.nom=nom;
	this.prenom=prenom;
	followers = new Vector<Personne>();
	TL = new Vector<String>();
	}
	
	public long getId(){
		return id;
	}
	
	public String getNom() {
		 return nom;
	}
	
	public void setNom(String nom) {
		if(nom==null){
			throw new IllegalArgumentException("la propriété nom ne peut pas être null");
		}
		 this.nom = nom;
	}
	
	
	public String getPrenom() {
		 return prenom;
	}
	
	public void setPrenom(String prenom) {
		 this.prenom = prenom;
	}
	
	// Quand moi je veux follower quelqu'un d'autre. 
	public void follower(Personne PersonneAFollow) {
		PersonneAFollow.addfollower(this);
	}
	
	// Quand quelqu'un d'autre veut me follow moi. 
	public void addfollower(Personne follower) {
		followers.add(follower);
	}
	
	public void RecevoirTL(String twitt) {
		TL.add(twitt);
		while(TL.size()>100){
			TL.remove(0);
		}
	}
	
	public void afficherTL() {
		for (int i = TL.size()-1; i>=0; i--) {
			System.out.print(TL.get(i)+"; ");
		}
	}
	
	// Quand je tweet. J'envoie mon tweet à tout mes followers. 
	public void tweeter(String tweet) {
		for(int i = 0; i <= followers.size()-1 ; i++) {
			followers.get(i).RecevoirTL(tweet);
		}
	}
	
	public void afficherFollowers() {
		for (int i = 0; i <= followers.size()-1; i++) {
			System.out.print(followers.get(i).getPrenom()+"; ");
		}
	}

}
