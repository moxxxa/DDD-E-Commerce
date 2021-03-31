package use_case;

import model.panier.Panier;
import model.panier.Paniers;
import model.produit.Produit;
import model.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakePaniers implements Paniers {


    Map<String, Panier> paniers;

    public FakePaniers() {

        paniers = new HashMap<>();

        //creat user
        User mouna = new User();

        // creat basket
        Panier panierMouna = new Panier();

        List<Produit> mounaProduits = new ArrayList<>();

        panierMouna.setUser(mouna);

        // create product
        Produit nike = new Produit();
        Produit adidas = new Produit();
        Produit puma = new Produit();
        // add product to basket
        mounaProduits.add(nike);
        mounaProduits.add(adidas);


        // fil up basket
        panierMouna.setProduitList(mounaProduits);


        paniers.put("le panier de mouna", panierMouna);

        //creat user
        User lionel = new User();

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


    @Override
    public Panier findById(String idPanier) {
        return null;
    }
}
