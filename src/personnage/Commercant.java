package personnage;

public class Commercant extends Humain {
	

	public Commercant(String nom, int argent) {
		super(nom,"thé", argent);
		
	}

	
	public int seFaireExtorquer() {
		int argent = getArgent();
		perdreArgent(argent);
		parler("le monde est méchant");
		return argent;
	}
	
	public void recevoirArgent(int argent) {
		gagnerArgent(argent);
		parler(argent +" sous ! Bien vuuu");
	}
}
