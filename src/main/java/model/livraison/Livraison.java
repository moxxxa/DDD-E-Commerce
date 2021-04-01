package model.livraison;

import model.produit.Produit;
import model.user.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Livraison {
    private User user;
    private Date dateLivraison;
    private Date dateEnvoie;
    private boolean isReceived;
    private LivraisonType livraisonType;
    private List<Produit> produits;
    private int dureeLIvraison;

    public int getDureeLIvraison() {
        return dureeLIvraison;
    }

    public Livraison() {
    }

    public Livraison(User user, Date dateLivraison, Date dateEnvoie, boolean isReceived, LivraisonType livraisonType, int dureeLIvraison) {
        this.user = user;
        this.dateLivraison = dateLivraison;
        this.dateEnvoie = dateEnvoie;
        this.isReceived = isReceived;
        this.livraisonType = livraisonType;
         this.dureeLIvraison = dureeLIvraison;
    }

    public User getUser() {
        return user;
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

    public void setUser(User user) {
        this.user = user;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public void setDateEnvoie(Date dateEnvoie) {
        this.dateEnvoie = dateEnvoie;
    }

    public void setReceived(boolean received) {
        isReceived = received;
    }

    public void setLivraisonType(LivraisonType livraisonType) {
        this.livraisonType = livraisonType;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public void setDureeLIvraison(int dureeLIvraison) {
        this.dureeLIvraison = dureeLIvraison;
    }

    public void verifierTypeLivraison(){

        if(getLivraisonType().equals(LivraisonType.EXPRESS)){
            this.setDureeLIvraison(5);
        }
        else if(getLivraisonType().equals(LivraisonType.DEFAULT)){
            this.setDureeLIvraison(10);
        }

    }
}
