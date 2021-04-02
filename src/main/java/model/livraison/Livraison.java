package model.livraison;

import model.Exception.DureeLivraisonNonValideException;
import model.produit.Produit;
import model.user.Utilisateur;

import java.util.Date;
import java.util.List;

public class Livraison {

    private IdLivraison idLivraison;
    private Utilisateur utilisateur;
    private Date dateCommande;

    private boolean isReceived;

    private LivraisonType livraisonType;
    private List<Produit> produits;
    private CreneauxLivraison creneauxLivraison;

    public Livraison(final IdLivraison idLivraison, final Utilisateur utilisateur, final List<Produit> produits, final Date dateCommande, final boolean isReceived, final LivraisonType livraisonType) throws DureeLivraisonNonValideException {
        this.idLivraison = idLivraison;
        this.utilisateur = utilisateur;
        this.dateCommande = dateCommande;
        this.isReceived = isReceived;
        this.livraisonType = livraisonType;
        this.creneauxLivraison = new CreneauxLivraison(livraisonType,dateCommande);
    }


    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public String getId() {
        return idLivraison.getId();
    }

    public Date getDateEnvoie() {
        return dateCommande;
    }

    public boolean isReceived() {
        return isReceived;
    }

    public LivraisonType getLivraisonType() {
        return livraisonType;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public int getDureeLivraison() {
        return creneauxLivraison.getDureeEstimee();
    }

    public Date getDateLivraison(){
        return creneauxLivraison.getDateLivraison();
    }
}
