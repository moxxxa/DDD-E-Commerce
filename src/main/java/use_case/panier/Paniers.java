package use_case.panier;

import model.livraison.Livraison;
import model.panier.Panier;

public interface Paniers {

    Panier findById(String idPanier);
}
