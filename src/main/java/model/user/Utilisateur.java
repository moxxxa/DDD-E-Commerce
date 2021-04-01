package model.user;


import java.sql.Date;

public class Utilisateur {

    private String id;
    private String nom;
    private String prenom;
    private Date dateAnniversaire;
    private String email;
    // Raison de simplicités
    private String adresse;

    public Utilisateur(String id, String name, String prenom, Date dateAnniversaire, String email, String adresse) {
        this.id = id;
        this.nom = name;
        this.prenom = prenom;
        this.dateAnniversaire = dateAnniversaire;
        this.email = email;
        this.adresse = adresse;
    }

    public Utilisateur(){

    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateAnniversaire() {
        return dateAnniversaire;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateAnniversaire(Date dateAnniversaire) {
        this.dateAnniversaire = dateAnniversaire;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
