package model.produit;

//  Agregate root
public class Produit {
    private String id;
    private String name;
    private String description;
    private double price;

    public Produit(String id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
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

    public String getId() {
        return id;
    }

}
