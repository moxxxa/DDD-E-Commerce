package model.produit;

import model.Exception.PrixNonValideException;
import model.messageErreur.MessagesModel;

import java.math.BigDecimal;

public class Prix {
    private final BigDecimal prix;

    public Prix(BigDecimal prix) throws PrixNonValideException {
        if (prix.compareTo(BigDecimal.ZERO) == 0) {
            throw new PrixNonValideException(MessagesModel.PRIX_NON_VALIDE);
        }
        this.prix = prix;
    }

    public BigDecimal getPrix() {
        return prix;
    }
}
