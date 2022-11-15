package histoire;

import personnages.Equipement;
import personnages.Gaulois;

public class Musee {
	
	private Trophee tab[] = new Trophee[200];
	private int nbTrophee=0;
	public void donnerTrophee(Gaulois gaulois, Trophee equipement) {
		
		tab[nbTrophee]= equipement;
		nbTrophee+=1;
	}
	public Musee(String nom) {
		this.nom = nom;
	}

}
