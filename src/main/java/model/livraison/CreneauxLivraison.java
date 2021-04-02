package model.livraison;

import model.Exception.DureeLivraisonNonValideException;
import model.messageErreur.MessagesModel;
import java.util.Calendar;
import java.util.Date;

public class CreneauxLivraison {

    private final int duree;
    private Date dateLivraison;

    public CreneauxLivraison(LivraisonType livraisonType, Date dateCommande ) throws DureeLivraisonNonValideException {
        if(livraisonType.equals(LivraisonType.EXPRESS)) {
            this.duree = 5;
            Calendar c = Calendar.getInstance();
            c.setTime(dateCommande);
            c.add(Calendar.DATE,  this.duree);
            this.dateLivraison = c.getTime();
            return;
        }
        if(livraisonType.equals(LivraisonType.DEFAULT)) {
            this.duree = 10;
        }
        throw new DureeLivraisonNonValideException(MessagesModel.TYPE_LIVRAISON_NON_VALIDE);
    }

    public int getDureeEstimee() {
        return duree;
    }

    public Date getDateLivraison() {
        return this.dateLivraison;
    }
}
