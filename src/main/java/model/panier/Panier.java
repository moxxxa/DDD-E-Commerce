package model.panier;

import model.produit.IdProduit;
import model.produit.Produit;
import model.user.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private Utilisateur utilisateur;
    private List<Produit> produitList;
    private IdPanier idPanier;

    public Panier(List<Produit> produitList, Utilisateur utilisateur, IdPanier idPanier) {
        this.produitList = produitList;
        this.utilisateur = utilisateur;
        this.idPanier = idPanier;
    }

    public List<Produit> getProduitList() {
        return produitList;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public String getId() {
        return idPanier.getId();
    }


    public void ajouterProduit(final Produit produit){
        if (produit.leStockEstSuperieurAZero()) {
            produit.diminuerStockDeUn();
        }
        if(produitList == null) {
            produitList= new ArrayList<Produit>();
        }
        this.produitList.add(produit);
    }

    public void supprimerProduit(final Produit produit) {
        if(produit != null){
            String idAChercher = produit.getId();
            if (null != idAChercher && produitList.size() > 0) {
                int index = 0;
                for (Produit p : produitList) {
                    if (p.getId().equals(idAChercher)) {
                        produitList.remove(index);
                        break;
                    }
                    index ++;
                }
            }
            produit.incrementStock();
        }
    }
}
