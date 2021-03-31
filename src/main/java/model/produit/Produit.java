package model.produit;

public class Produit {


    private String name;
    private String description;
    private double price;

    public Produit(String name){
        this.name = name;
        this.price = 0;
    }

    public Produit(String name, String descriptionn, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public boolean isValidProduit(){
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
}
