package use_case;

import model.livraison.Livraison;
import model.livraison.LivraisonType;
import model.livraison.Livraisons;
import model.produit.Produit;
import model.user.Utilisateur;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakeLivraisons implements Livraisons {

    Map<String, Livraison> livraisons;

    public FakeLivraisons() {
        livraisons = new HashMap<>();

        Utilisateur utilisateurA = new Utilisateur(
                "1",
                "userA",
                "userA",
                new Date(10, 10, 1997),
                "userA@gmail.com",
                "adresse"
        );
        Livraison livraisonA = new Livraison();
        List<Produit> produits = new ArrayList<>();
        produits.add(new Produit(
            "1",
            "produit 1",
            "description produit 1",
            10.00
        ));
        produits.add(new Produit(
                "2",
                "produit 2",
                "description produit 2",
                20.00
        ));
        livraisonA.setDateLivraison(new Date(10,10,2021));
        livraisonA.setLivraisonType(LivraisonType.EXPRESS);
        livraisonA.setProduits(produits);
        livraisons.put("Livrasion1", livraisonA);
    }

    public void test1() {
        Livraison livraison1 = findById("Livrasion1");
        assertEquals(livraison1.getUtilisateur().getNom(), "userA");
        assertEquals(livraison1.getUtilisateur().getPrenom(), "userA");
        assertEquals(livraison1.getUtilisateur().getEmail(), "userA@gmail.com");
        assertEquals(livraison1.getUtilisateur().getAdresse(), "adresse");
    }

    public void test2() {
        Livraison livraison1 = findById("Livrasion1");
        assertEquals(livraison1.getProduits().get(0).getName(), "produit 1");
        assertEquals(livraison1.getProduits().get(0).getDescription(), "description produit 1");
        assertEquals(livraison1.getProduits().get(0).getPrice(), "10.00");
    }

    @Override
    public Livraison findById(String idLivraison) {
        return livraisons.get(idLivraison);
    }

    @Override
    public void sauvegarderPanier(Livraison livraison) {
        
    }
}
