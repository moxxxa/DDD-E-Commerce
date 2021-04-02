package use_case.panier;

import model.Exception.StockEpuiserException;
import model.panier.Panier;
import model.panier.Paniers;
import model.produit.Produit;
import model.produit.Produits;

public class AjouterProduitAuPanier {

    private Paniers paniers;
    private Produits produits;

    public AjouterProduitAuPanier(Paniers paniers, Produits produits) {
        this.paniers = paniers;
        this.produits = produits;
    }

    public Panier ajouterProduit(String idPanier, String idProduit) throws StockEpuiserException {
        Panier panier = paniers.trouverParId(idPanier);
        Produit produit = produits.trouverParId(idProduit);

        produit.disponible();
        produit.diminuerStockDeUn();
        panier.ajouterProduit(produit);

        produits.sauvegarderProduit(produit);
        paniers.sauvegarderPanier(panier);
        return panier;
    }

}
