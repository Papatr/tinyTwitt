package fr.univ.nantes.m1alma;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("test");
		
		Personnes twittosphere = new Personnes(10000);
		
		twittosphere.afficherPersonne();
		
		twittosphere.ajouterPersonne(new Personne("MOUSTAFA", "Ossama"));
		twittosphere.ajouterPersonne(new Personne("TRAORE","Papa"));
		twittosphere.ajouterPersonne(new Personne("KONE","Saad Oumar"));
		
		twittosphere.afficherPersonne();
		
		System.out.println("Prénom de la 0ème personne : "+twittosphere.getPersonne(0).getPrenom());
		
		//Personne Ossama = new Personne("test", "retest");
		//Personne autre = new Personne("l'autre", "là bas");
		//Ossama.addfollower(autre);
		
		twittosphere.getPersonne(0).follower(twittosphere.getPersonne(1));
		twittosphere.getPersonne(2).follower(twittosphere.getPersonne(1));
		
		System.out.print("Followers de la première personne : ");
		twittosphere.getPersonne(1).afficherFollowers();
		System.out.println();
		
		twittosphere.getPersonne(1).tweeter("Salut les mecs. ");
		twittosphere.getPersonne(1).tweeter("Vous allez bien ? ");
		twittosphere.getPersonne(0).tweeter("Je n'ai pas de followers... ");
		
		System.out.print("TL de la 0ème personne : ");
		twittosphere.getPersonne(0).afficherTL();
		System.out.println();
		
		System.out.print("TL de la 1ère personne : ");
		twittosphere.getPersonne(1).afficherTL();
		System.out.println();
		
		System.out.print("TL de la 2ème personne : ");
		twittosphere.getPersonne(2).afficherTL();
		System.out.println();	
	}
}
