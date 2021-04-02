package model.livraison;

import model.livraison.Livraison;
import model.panier.Panier;

public interface Livraisons {

    Livraison trouverParId(String idLivraison);
    void sauvegarderLivraison(Livraison livraison);
}
