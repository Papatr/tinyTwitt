package fr.univ.nantes.m1alma;

import java.util.ArrayList;

public class Personnes {
	
	private int nbPersonne;	// Nombre max de personnes. 
	private ArrayList<Personne> personnes;
	
	public Personnes(int nbPers){
		this.nbPersonne = nbPers;
		this.personnes = new ArrayList<Personne>();
	}
	
	
	public void ajouterPersonne(Personne pers){
		personnes.add(pers);
		
		if(personnes.size()>=nbPersonne){
			System.out.println("Ne plus ajouter de personne");
		}
	}
	
	public void supprimerPersonne(Personne pers){
		personnes.remove(pers);
	}
	
	public void afficherPersonne(){
		int i = 0;
		for(Personne p:personnes){
			System.out.printf("Personne %s : %s %s \n", i, p.getNom(), p.getPrenom() );
			i++;
		}
	}
	
	public Personne getPersonne(int i) {
		return personnes.get(i);
	}	
}
