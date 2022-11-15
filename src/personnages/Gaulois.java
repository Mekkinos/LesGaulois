package personnages;

public class Gaulois {private String nom;
	
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	//private String prendreParole() {
	//	return "Le gaulois " + nom + " : ";
	//}

	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}


	//public void frapper(Romain romain) {
	//	System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
	//	romain.recevoirCoup(force / 3);
	//}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
		asterix.parler("WOUHOU");
		Romain romain = new Romain("Romain",1);
		asterix.frapper(romain);
		asterix.boirePotion(3);
	}
public void faireUneDonnation(Musee musee) {
	prendreParole();
	if (trophees.length!=0) {
		System.out.println("Je donne tous mes trophees");
		for (int i=0;i<nbTrophee) {
			musee.donnerTrophee(new Gaulois("Asterix",6)this.Trophee[i];
			
		}else {
			System.out.println("Je n'ai pas de trophees");
		}
	
	}
}
}



