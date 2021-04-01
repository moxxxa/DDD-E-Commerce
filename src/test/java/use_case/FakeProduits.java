package use_case;

import model.produit.IdProduit;
import model.produit.Produit;
import model.produit.Produits;
import java.util.HashMap;
import java.util.Map;


public class FakeProduits implements Produits {
    Map<String, Produit> produits;

    public FakeProduits() {
        produits = new HashMap<>();
        Produit chaussure_nike = new Produit("Nike", "Nike description",10, new IdProduit("10"));
        Produit chassure_adidas = new Produit("Adidas", "Adidas description", 10, new IdProduit("11"));
        Produit chassure_puma = new Produit("Puma", "Puma description", 10, new IdProduit("12"));

        produits.put("chaussure_nike", chaussure_nike);
        produits.put("chassure_adidas", chassure_adidas);
        produits.put("chassure_puma", chassure_puma);
    }

    @Override
    public Produit trouverParId(String idProduit) {
        return produits.get(idProduit);
    }

    @Override
    public void sauvegarderProduit(Produit produit) {
    }
}