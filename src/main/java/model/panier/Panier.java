package model.panier;

import model.produit.Produit;
import model.user.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private Utilisateur utilisateur;
    private List<Produit> produitList;

    public Panier(List<Produit> produitList, Utilisateur utilisateur) {
        this.produitList = produitList;
        this.produitList.addAll(produitList);
        this.utilisateur = utilisateur;
    }

    public Panier(){
        this.produitList = new ArrayList<Produit>();
    };
    public List<Produit> getProduitList() {
        return produitList;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public void ajouterProduit(Produit produit){
        if(produitList == null){
            produitList= new ArrayList<Produit>();
        }
        this.produitList.add(produit);
    }

    public void supprimerProduit(String id) {
        if (null != id && produitList.size() > 0) {
            int index = 0;
            for (Produit p : produitList) {
                if (p.getId().equals(id)) {
                    produitList.remove(index);
                    break;
                }
                index ++;
            }
        }
    }
}
