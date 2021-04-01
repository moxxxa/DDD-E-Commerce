package model.messageErreur;

public enum LivraisonMessage {
    TypeLivraisonNexistePas("Le type de livraison sélectionner n'existe pas");

    private final String message;
    LivraisonMessage(String s) {
        this.message = s;
    }

    public Boolean egaleMessage(String autreMessage) {
        //  si autre message est null alors equals renvoie false
        return message.equals(autreMessage);
    }

    public String toString() {
        return this.message;
    }
}
