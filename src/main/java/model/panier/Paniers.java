package model.panier;

import model.panier.Panier;

public interface Paniers {
    Panier findById(String idPanier);

    void sauvegarderPanier(Panier panier);
}
