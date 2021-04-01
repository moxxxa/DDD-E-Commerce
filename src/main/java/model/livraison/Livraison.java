package model.livraison;

import model.Exception.DureeLivraisonNonValideException;
import model.produit.Produit;
import model.user.Utilisateur;

import java.util.Date;
import java.util.List;

public class Livraison {

    private IdLivraison idLivraison;
    private Utilisateur utilisateur;

    private Date dateLivraison;
    private Date dateEnvoie;

    private boolean isReceived;

    private LivraisonType livraisonType;
    private List<Produit> produits;
    private DureeLivraison dureeLivraison;

    public Livraison(final IdLivraison idLivraison, final Utilisateur utilisateur, final List<Produit> produits,
     final Date dateLivraison, final Date dateEnvoie, final boolean isReceived, final LivraisonType livraisonType) throws DureeLivraisonNonValideException {
        this.idLivraison = idLivraison;
        this.utilisateur = utilisateur;
        this.dateLivraison = dateLivraison;
        this.dateEnvoie = dateEnvoie;
        this.isReceived = isReceived;
        this.livraisonType = livraisonType;
        this.dureeLivraison = new DureeLivraison(livraisonType);
    }


    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public String getId() {
        return idLivraison.getId();
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public Date getDateEnvoie() {
        return dateEnvoie;
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

    public String getDureeLIvraisonEstimee() {
        return dureeLivraison.getDureeEstimee();
    }
}
