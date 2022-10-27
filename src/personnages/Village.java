package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois villageois[];
	private int nbVillageois=0;

	public Village(String nom,int nbVillageoisMax) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMax];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois g) {
		villageois[nbVillageois] = g;
		nbVillageois ++;
	}
	
	public Gaulois trouverHabitant(int n) {
		return villageois[n];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		for (int i = 0;i<nbVillageois;i++) {
			System.out.println(villageois[i].getNom());
		}
	}
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		Chef Abraracourcix = new Chef("Abraracourcix",6, village);
		village.setChef(Abraracourcix);
		Gaulois Asterix = new Gaulois ("Astérix", 8);
		village.ajouterHabitant (Asterix);
		Gaulois Obelix = new Gaulois ("Obélix", 25);
		village.ajouterHabitant (Obelix);
		village.afficherVillageois();
	}
}

