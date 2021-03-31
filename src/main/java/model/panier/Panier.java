package model.panier;

import model.produit.Produit;
import model.user.User;

import java.util.List;

public class Panier implements Paniers {
    private List<Produit> produitList;
    private User user;


    public Panier(List<Produit> produitList) {
        this.produitList = produitList;
    }

    public List<Produit> getProduitList() {
        return produitList;
    }

    public User getUser() {
        return user;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
