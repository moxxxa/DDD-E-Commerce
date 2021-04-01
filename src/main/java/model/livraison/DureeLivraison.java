package model.livraison;

import model.Exception.DureeLivraisonNonValideException;
import model.messageErreur.LivraisonMessage;

public class DureeLivraison {
    private final String duree;

    public DureeLivraison(LivraisonType livraisonType) throws DureeLivraisonNonValideException {
        if(livraisonType.equals(LivraisonType.EXPRESS)) {
            duree = "5 jours";
            return;
        }
        if(livraisonType.equals(LivraisonType.DEFAULT)) {
            duree = "10 jours";
        }
        throw new DureeLivraisonNonValideException(LivraisonMessage.TypeLivraisonNexistePas.name());
    }

    public String getDureeEstimee() {
        return duree;
    }
}
