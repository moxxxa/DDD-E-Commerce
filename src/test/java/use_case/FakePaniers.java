package use_case;

import model.panier.Panier;
import use_case.panier.Paniers;
import model.produit.Produit;
import model.user.User;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakePaniers implements Paniers {


    Map<String, Panier> paniers;

    public FakePaniers() {

        paniers = new HashMap<>();

        //creat user
        User mouna = new User(
                "1",
                "Mouna",
                "Hichri",
                new Date(10, 10, 1997),
                "mouna@gmail.com",
                "adresse"
        );
        // creat basket
        Panier panierMouna = new Panier();
        List<Produit> mounaProduits = new ArrayList<>();
        panierMouna.setUser(mouna);
        // create product
        Produit nike = new Produit("1", "Nike", "Nike description", 10);
        Produit adidas = new Produit("2", "Adidas", "Adidas description", 10);
        Produit puma = new Produit("3", "Puma", "Puma description", 10);
        // add product to basket
        mounaProduits.add(nike);
        mounaProduits.add(adidas);
        mounaProduits.add(puma);
        // fil up basket
        panierMouna.setProduitList(mounaProduits);
        paniers.put("panier_non_vide", panierMouna);
        paniers.put("panier_vide", new Panier());
    }

    @Override
    public Panier findById(String idPanier) {
        return paniers.get(idPanier);
    }
}
