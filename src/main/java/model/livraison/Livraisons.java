package model.livraison;

import model.livraison.Livraison;
import model.panier.Panier;

public interface Livraisons {

    Livraison findById(String idLivraison);
    void sauvegarderLivraison(Livraison livraison);
}
