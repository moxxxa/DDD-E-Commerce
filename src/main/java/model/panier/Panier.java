package model.panier;

import model.produit.Produit;
import model.user.User;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Panier {
    private User user;
    private List<Produit> produitList;

    public Panier(List<Produit> produitList, User user) {
        this.produitList = produitList;
        this.produitList.addAll(produitList);
        this.user = user;
    }

    public Panier(){
        this.produitList = new ArrayList<Produit>();
    };
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

    public void ajouterProduit(Produit produit){
        if(produitList == null){
            produitList= new ArrayList<Produit>();
        }
        this.produitList.add(produit);
    }

    public void supprimerProduit(String id) {
        if (null != id && produitList != null) {
            System.out.println(produitList == null);
            Optional<Produit> produit = produitList.stream().filter(unproduit -> unproduit.getId().equals(id)).findFirst();

            if (produit.isPresent()) {
                produitList.remove(produitList.indexOf(produit.get()));
            }
        }
    }
}
