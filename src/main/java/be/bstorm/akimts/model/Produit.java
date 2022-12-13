package be.bstorm.akimts.model;

public class Produit {

    private long id;
    private String nom;
    private double prix;
    private long qttInStock;

    public Produit() {
    }

    public Produit(long id, String nom, double prix, long qttInStock) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.qttInStock = qttInStock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public long getQttInStock() {
        return qttInStock;
    }

    public void setQttInStock(long qttInStock) {
        this.qttInStock = qttInStock;
    }
}
