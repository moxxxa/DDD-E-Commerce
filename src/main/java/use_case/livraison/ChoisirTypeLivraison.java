package use_case.livraison;

import model.livraison.Livraison;
import model.livraison.Livraisons;

public class ChoisirTypeLivraison {


    private Livraisons livraisons;


    public ChoisirTypeLivraison(Livraisons livraisons){
        this.livraisons = livraisons;
    }

    public Livraison verifierTypeLivraison(String idLivraison){

        Livraison livraison = livraisons.findById(idLivraison);
        livraison.verifierTypeLivraison();
        livraisons.sauvegarderLivraison(livraison);
        return livraison;
    }

}
