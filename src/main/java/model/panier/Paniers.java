package model.panier;

import model.panier.Panier;

public interface Paniers {
    Panier trouverParId(String idPanier);

    void sauvegarderPanier(Panier panier);
}
