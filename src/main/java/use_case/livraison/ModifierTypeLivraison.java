package use_case.livraison;

import model.livraison.Livraison;
import model.livraison.Livraisons;
import model.panier.Panier;
import model.panier.Paniers;
import model.produit.Produit;
import model.produit.Produits;

public class ModifierTypeLivraison {


    private Livraisons livraisons;

    public ModifierTypeLivraison(Livraisons livraisons) {
        this.livraisons = livraisons;
    }

    public Livraison choisirTypeLivraison(String idLivraison) {
        Livraison livraison = livraisons.trouverParId(idLivraison);
        livraison.getDureeLivraisonEstimee();
        return livraison;
    }

}
