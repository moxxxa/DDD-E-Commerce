package use_case;

import model.panier.Panier;
import model.panier.Paniers;
import model.produit.Produit;
import model.user.User;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        Produit nike = new Produit("Nike");
        Produit adidas = new Produit("Adidas");
        Produit puma = new Produit("Puma");
        // add product to basket
        mounaProduits.add(nike);
        mounaProduits.add(adidas);


        // fil up basket
        panierMouna.setProduitList(mounaProduits);


        paniers.put("le panier de mouna", panierMouna);

        //creat user
        User lionel = new User(
                "1",
                "Stan",
                "Durand",
                new Date(10, 10, 1997),
                "stan@gmail.com",
                "adresse"
        );

        // creat basket
        Panier panierlionel = new Panier();

        List<Produit> lionelProduits = new ArrayList<>();

        panierlionel.setUser(lionel);

        // add product to basket
        lionelProduits.add(puma);
        lionelProduits.add(adidas);


        // fil up basket
        panierlionel.setProduitList(lionelProduits);


        paniers.put("le panier de lionel", panierlionel);

    }

    public void testCountProduit() {
        Panier panier1 = findById("1");
        assertEquals(panier1.getProduitList().stream().filter(produit->produit.getName().equals("Nike")).count(), 1);
        assertEquals(panier1.getProduitList().stream().filter(produit->produit.getName().equals("qsdqsd")).count(), 0);
    }

    public void testUser() {
        Panier panier1 = findById("1");
        assertEquals(panier1.getProduitList().stream().filter(user->user.getName().equals("Mouna")).count(), panier1.getProduitList().size());
        assertEquals(panier1.getProduitList().stream().filter(user->user.getName().equals("sdfsdfdsf")).count(), 0);
    }

    @Override
    public Panier findById(String idPanier) {
        return paniers.get(idPanier);
    }
}
