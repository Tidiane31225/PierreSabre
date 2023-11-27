package personnage;

public class Ronin extends Humain {
	private int honneur =1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		
	}
	
	public void donner(Commercant beneficiaire) {
		int argent = getArgent();
		perdreArgent(argent);
		parler(beneficiaire.getNom()+" prend la plata.");
		beneficiaire.recevoirArgent(argent);
		
		
	}

	public int getHonneur() {
		return honneur;
	}
}
