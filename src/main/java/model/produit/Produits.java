package model.produit;

public interface Produits {
    Produit findyById(String idProduit);

    void sauvegarderProduit(Produit produit);
}
