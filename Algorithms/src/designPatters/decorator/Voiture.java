package designPatters.decorator;

public abstract class Voiture {
    private String libelle;
    private int prix;
    private int poids;

    public String getLibelle() {
        return libelle;
    }

    public int getPrix() {
        return prix;
    }
    public int getPoids() {
        return poids;
    }

    protected void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    protected void setPrix(int prix) {
        this.prix = prix;
    }
    protected void setPoids(int poids) {
        this.poids = poids;
    }

    public String toString() {
        return "Voiture : " + getLibelle() + ", Prix : " + getPrix() + ", Poids : " + getPoids();
    }
}
