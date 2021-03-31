package model.produit;

public class Produit {
    private String id;
    private String name;
    private String description;
    private double price;

    public Produit() {
    }

    public Produit(String id, String name, String descriptionn, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public boolean produitEstValide(){
        return this.price < 0;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
