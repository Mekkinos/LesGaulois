package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois villageois[];
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;

	public Village(String nom, Chef chef) {
		super()
		this.nom = nom;
		this.chef=chef;
}

	public void setChef(Chef chef) {
		this.chef = chef;
}

	public String getNom() {
		return nom;
}
	
	public Gaulois ajouterHabitant(int nbVillageois) {
		return villageois[nbVillageois];
	}
	
	public static void main(String[] args) {
		
	}
	
}
