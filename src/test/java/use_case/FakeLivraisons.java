package use_case;

import model.Exception.DureeLivraisonNonValideException;
import model.Exception.PrixNonValideException;
import model.livraison.IdLivraison;
import model.livraison.Livraison;
import model.livraison.LivraisonType;
import model.livraison.Livraisons;
import model.produit.IdProduit;
import model.produit.Prix;
import model.produit.Produit;
import model.user.IdUtilisateur;
import model.user.Utilisateur;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakeLivraisons implements Livraisons {

    Map<String, Livraison> livraisons;

    public FakeLivraisons() throws PrixNonValideException, DureeLivraisonNonValideException {
        livraisons = new HashMap<>();

        Utilisateur utilisateurA = new Utilisateur(
                new IdUtilisateur("1"),
                "userA",
                "userA",
                new Date(10, 10, 1997),
                "userA@gmail.com",
                "adresse"
        );
        List<Produit> produits = new ArrayList<>();
        produits.add(new Produit(
            "produit 1",
            "description produit 1",
            new Prix(new BigDecimal(10.00)),
            new IdProduit("10")
        ));
        produits.add(new Produit(
            "produit 2",
            "description produit 2",
            new Prix(new BigDecimal(20.00)),
            new IdProduit("20")
        ));
        livraisons.put("Livrasion1", new Livraison(
            new IdLivraison("1012"),
            utilisateurA,
            produits,
            new Date(10,10,2021),
            new Date(8,10,2021),
            false,
            LivraisonType.EXPRESS)
        );
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
    public void sauvegarderLivraison(Livraison livraison) {
        
    }
}
