package model.panier;

import model.produit.Produit;
import model.user.User;

import java.security.PublicKey;
import java.util.List;

public class Panier {
    private List<Produit> produitList;
    private User user;

    public Panier(){
    }

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

    public void addProduit(Produit produit){

        if(produit.isValidProduit()){
            return;
        }

        this.produitList.add(produit);
    }
}
