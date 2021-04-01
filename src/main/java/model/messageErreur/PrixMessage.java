package model.messageErreur;

public enum PrixMessage {
    prixNonValide("Le prix ne doit pas etre égale à zero");

    private final String message;
    PrixMessage(String s) {
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
