package model.panier;

import model.produit.Produit;
import model.user.User;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Produit> produitList;
    private User user;

    public Panier(){};

    public Panier(List<Produit> produitList) {
        this.produitList = produitList;
    }

    public Panier(List<Produit> produitList, User user) {
        this.produitList = produitList;
        this.user = user;
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

        if(produitList == null){
            produitList= new ArrayList<Produit>();
            this.produitList.add(produit);
        }


    }

    public void supprimerProduit(String id) {
        if (null != id && produitList.size() > 0) {
            //  supprimer le produit en question
            int index = 0;
            for (Produit p : produitList) {
                if (p.getId().equals(id)) {
                    System.out.println("index"+index);
                    produitList.remove(index);
                    break;
                }
                index ++;
            }

            //  produitList.stream().filter(produit -> produit.getId().equals(id));
        }
    }
}
