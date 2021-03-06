package use_case;

import model.Exception.PrixNonValideException;
import model.produit.IdProduit;
import model.produit.Prix;
import model.produit.Produit;
import model.produit.Produits;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class FakeProduits implements Produits {
    Map<String, Produit> produits;

    public FakeProduits() throws PrixNonValideException {
        produits = new HashMap<>();
        Produit chaussure_nike = new Produit("Nike", "description nike",new Prix(new BigDecimal(10.00)), new IdProduit("chaussure_nike"), 4);
        Produit chassure_adidas = new Produit("Adidas", "Adidas description", new Prix(new BigDecimal(10.00)), new IdProduit("chassure_adidas"), 12);
        Produit chassure_puma = new Produit("Puma", "Puma description", new Prix(new BigDecimal(10.00)), new IdProduit("chassure_puma"),8);

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
        if(produit != null){
            produits.put(produit.getId(), produit);
        }
    }
}
