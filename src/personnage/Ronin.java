package personnage;

public class Ronin extends Humain {
	private int honneur =1;
	private int force=2*honneur;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		
		
	}
	
	public void donner(Commercant beneficiaire) {
		int argent = getArgent();
		int dons = (int) (argent * 0.10);
		perdreArgent(dons);
		parler(beneficiaire.getNom()+" prend la plata.");
		beneficiaire.recevoirArgent(dons);
		
	}
	public void provoquer(Yakuza adversaire) {
		parler("Ah mon gars tu va payer pour la hagra que ta mis au pti marchand");
		if (force>=adversaire.getReputation()) {
			gagnerArgent(adversaire.getArgent());
			parler("J'lai éteint");
			adversaire.perdre();
			honneur+=1;
		}else {
			honneur-=1;
			perdreArgent(getArgent());
			parler(" AIee il est chow !");
			adversaire.gagner();
			
		}
		
	}

	public int getHonneur() {
		return honneur;
	}
	public int getForce() {
		return force;
	}
}
