package model.produit;

import java.math.BigDecimal;

//  Agregate root
public class Produit {
    private String name;
    private String description;
    private Prix prix;
    private long stock;
    private IdProduit idProduit;

    public Produit(final String name, final String description, final Prix prix, final IdProduit idProduit) {
        this.name = name;
        this.description = description;
        this.prix = prix;
        this.idProduit = idProduit;
    }

    public boolean leStockEstSuperieurAZero() {
        return stock > 0;
    }

    public void diminuerStockDeUn() {
        stock -= 1;
    }

    public void incrementStock() { stock += 1;}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return prix.getPrix();
    }

    public String getId() {
        return idProduit.getId();
    }

}
