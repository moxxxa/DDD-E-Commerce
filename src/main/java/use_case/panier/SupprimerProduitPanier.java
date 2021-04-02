package use_case.panier;

import model.panier.Panier;
import model.panier.Paniers;
import model.produit.Produit;
import model.produit.Produits;

public class SupprimerProduitPanier {
    private Paniers paniers;
    private Produits produits;

    public SupprimerProduitPanier(Paniers paniers, Produits produits) {
        this.paniers = paniers;
        this.produits = produits;
    }

    public Panier supprimerProduit(String idPanier, String idProduit) {
        Panier panier = paniers.trouverParId(idPanier);
        Produit produit = produits.trouverParId(idProduit);


        panier.supprimerProduit(produit);

        produits.sauvegarderProduit(produit);
        paniers.sauvegarderPanier(panier);

        return panier;
    }
}
