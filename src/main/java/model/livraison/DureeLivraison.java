package model.livraison;

import model.Exception.DureeLivraisonNonValideException;
import model.messageErreur.MessagesModel;

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
        throw new DureeLivraisonNonValideException(MessagesModel.TYPE_LIVRAISON_NON_VALIDE);
    }

    public String getDureeEstimee() {
        return duree;
    }
}
