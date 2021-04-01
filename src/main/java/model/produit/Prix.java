package model.produit;

import model.Exception.PrixNonValideException;
import model.messageErreur.PrixMessage;

import java.math.BigDecimal;

public class Prix {
    private final BigDecimal prix;

    public Prix(BigDecimal prix) throws PrixNonValideException {
        if (prix.compareTo(BigDecimal.ZERO) == 0) {
            throw new PrixNonValideException(PrixMessage.prixNonValide.name());
        }
        this.prix = prix;
    }

    public BigDecimal getPrix() {
        return prix;
    }
}
