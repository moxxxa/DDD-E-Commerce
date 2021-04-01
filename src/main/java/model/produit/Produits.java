package model.produit;

public interface Produits {
    Produit trouverParId(String idProduit);

    void sauvegarderProduit(Produit produit);
}
