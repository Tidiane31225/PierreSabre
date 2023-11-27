package personnage;

public class Humain {
    // Attributs privés
    private String nom;
    private String boissonFavorite;
    private int argent;

    // Constructeur
    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
    }

    // Accesseurs en lecture
    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return argent;
    }

    // Méthode pour faire parler les humains
    public void parler(String texte) {
        System.out.println(texte);
    }

    // Méthode pour dire bonjour
    public void direBonjour() {
        parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
    }

    // Méthode pour boire
    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    // Méthode pour acheter un bien
    public void acheter(String bien, int prix) {
        if (getArgent() >= prix) {
            parler("J'ai "+getArgent()+" sous en poche. Je vais pouvoir  m'offrir "+ bien +" à " + prix + " sous");
            argent = getArgent() - prix;
        } else {
            parler("Je n'ai plus que " + getArgent() +" sous en poche. Je ne peux même pas m'offrir " + bien + " à "+ prix + " sous.");
        }
    }

    // Méthode pour gagner de l'argent
    public void gagnerArgent(int gain) {
        argent = getArgent() + gain;
        //parler("J'ai gagné " + gain + " euros. Ma nouvelle quantité d'argent est de " + getArgent() + " euros.");
    }

    // Méthode pour perdre de l'argent
    public void perdreArgent(int perte) {
        argent = getArgent() - perte;
        //parler("J'ai perdu " + perte + " euros. Ma nouvelle quantité d'argent est de " + getArgent() + " euros.");
    }
}
