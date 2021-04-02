package use_case.livraison;

import model.livraison.Livraison;
import model.livraison.Livraisons;

public class ModifierTypeLivraison {


    private Livraisons livraisons;

    public ModifierTypeLivraison(Livraisons livraisons) {
        this.livraisons = livraisons;
    }

    public Livraison choisirTypeLivraison(String idLivraison) {
        Livraison livraison = livraisons.trouverParId(idLivraison);
        livraison.getDureeLivraison();
        livraison.getDateLivraison();
        livraisons.sauvegarderLivraison(livraison);
        return livraison;
    }

}
