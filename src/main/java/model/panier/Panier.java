package model.panier;

import model.produit.IdProduit;
import model.produit.Produit;
import model.user.Utilisateur;

import java.util.ArrayList;
import java.util.List;
//panier root
public class Panier {
    private Utilisateur utilisateur;
    private List<String> produitList;
    private IdPanier idPanier;

    public Panier(List<String> produitList, Utilisateur utilisateur, IdPanier idPanier) {
        this.produitList = produitList;
        this.utilisateur = utilisateur;
        this.idPanier = idPanier;
    }

    public List<String> getProduitList() {
        return produitList;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public String getId() {
        return idPanier.getId();
    }


    public void ajouterProduit(final String idProduit) {
        if (produitList == null) {
            produitList = new ArrayList<String>();
        }
        this.produitList.add(idProduit);
    }

    public void supprimerProduit(final String produitId) {
        if (produitId != null && produitList.size() > 0) {
            produitList.remove(produitId);
        }
    }

}
