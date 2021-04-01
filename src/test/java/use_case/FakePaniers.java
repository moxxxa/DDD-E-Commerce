package use_case;

import model.panier.IdPanier;
import model.panier.Panier;
import model.panier.Paniers;
import model.produit.IdProduit;
import model.produit.Produit;
import model.user.IdUtilisateur;
import model.user.Utilisateur;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakePaniers implements Paniers {
    Map<String, Panier> paniers;

    public FakePaniers() {

        paniers = new HashMap<>();

        List<Produit> mounaProduits = new ArrayList<>();

        Produit nike = new Produit("Nike", "Nike description",10, new IdProduit("10"));
        Produit adidas = new Produit("Adidas", "Adidas description", 10, new IdProduit("11"));
        Produit puma = new Produit("Puma", "Puma description", 10, new IdProduit("12"));

        mounaProduits.add(nike);
        mounaProduits.add(adidas);
        mounaProduits.add(puma);

        Panier panierMouna = new Panier(mounaProduits, new Utilisateur(
                new IdUtilisateur("1"),
                "Mouna",
                "Hichri",
                new Date(10, 10, 1997),
                "mouna@gmail.com",
                "adresse"
        ), new IdPanier("panier_non_vide"));
        paniers.put("panier_non_vide", panierMouna);

        List<Produit> stanProduits = new ArrayList<>();

        paniers.put("panier_vide", new Panier(stanProduits, new Utilisateur(
                new IdUtilisateur("2"),
                "stan",
                "Durand",
                new Date(10, 10, 1997),
                "stan@gmail.com",
                "adresse"
        ), new IdPanier("panier_vide")));
    }

    @Override
    public Panier trouverParId(String idPanier) {
        return paniers.get(idPanier);
    }

    @Override
    public void sauvegarderPanier(Panier panier) {
        paniers.put(panier.getId(), panier);
    }

}
