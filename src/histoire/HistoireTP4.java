package histoire;

import personnage.Commercant;
import personnage.Humain;
import personnage.Ronin;
import personnage.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof =new Humain("prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		
		Commercant marco = new Commercant("Marco",20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoirArgent(15);
		marco.boire();
		
		Yakuza yaku = new Yakuza("Yaku le Noir","wisky",30,"Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		Ronin roro= new Ronin("Roro","shohu",60);
		roro.direBonjour();
		roro.donner(marco);
	}

}
