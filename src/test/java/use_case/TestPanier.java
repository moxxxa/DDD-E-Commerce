package use_case;

import model.panier.Panier;
import model.produit.Produit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.panier.Paniers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPanier {
    private Paniers paniers;


    @BeforeEach
    public void init() {
        this.paniers = new FakePaniers();
    }

    @Test
    void testAjouterProduitPanier() {
        // Given
        Panier panier = paniers.trouverParId("panier_vide");
        Produit produit = new Produit("1", "Nike", "description nike", 10);
        int NbProduitsDansPanier = 0;
        // When
        panier.ajouterProduit(produit);
        // Then
        assertEquals(panier.getProduitList().size(), NbProduitsDansPanier + 1);
        assertEquals(panier.getProduitList().get(0).getName(), "Nike");
        assertEquals(panier.getProduitList().get(0).getDescription(), "description nike");
        assertEquals(panier.getProduitList().get(0).getPrice(), 10);
    }

    @Test
    void testSupprimerProduitPanier(){
        // Given
        Panier panier = paniers.trouverParId("panier_non_vide");
        int NbProduitsDansPanier = 3;
        // When
        panier.supprimerProduit("1");
        // Then
        assertEquals(panier.getProduitList().size(), NbProduitsDansPanier - 1);
    }

    @Test
    void testSupprimerPanierVide() {
        //  Given
        Panier panier = paniers.trouverParId("panier_vide");
        int NbProduitsDansPanier = 0;
        //  When
        panier.supprimerProduit("1");
        //  Then
        assertEquals(panier.getProduitList().size(), NbProduitsDansPanier);
    }

    @Test
    void testSupprimerProduitNexistePas() {
        //  Given
        Panier panier = paniers.trouverParId("panier_non_vide");
        int NbProduitsDansPanier = 3;
        //  When
        panier.supprimerProduit("nexistepas");
        //  Then
        assertEquals(panier.getProduitList().size(), NbProduitsDansPanier);
    }


}
