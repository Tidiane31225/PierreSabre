package personnage;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;

	public Yakuza(String nom, String boissonFavorite, int argent,String clan) {
		super(nom, boissonFavorite, argent);
		this.clan=clan;
		
	}

	public int getReputation() {
		return reputation;
	}

	public String getClan() {
		return clan;
	}

	public void extorquer(Commercant victime) {
		parler("Ce serait pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+" Si tu tient à la vie donne tes sous !");
		int argent_victime=victime.getArgent();
		gagnerArgent(argent_victime);
		victime.seFaireExtorquer();
		parler("ahahaaah je viens de voler "+argent_victime+" sous à " + victime.getNom());
		reputation+=1;
		}
	
	public void perdre() {
		int argent=getArgent();
		reputation+=-1;
		perdreArgent(argent);
		parler("Oh shit, j'ai perdu mon combat et mes "+ argent +" sous j'ai déshonorer le clan "+ getClan() +" !");
	}
	
	public void gagner() {
		parler("Je l'ai eeu ! Eheh je lui ait pris ces sous");
		reputation+=1;
		gagnerArgent();
	}
}
