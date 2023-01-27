package gestion_magasin;

public class Caissier  extends Employe{
    int numeroDeCaisse;

    public Caissier(int numeroDeCaisse, int identifiant, String adresse, String nom, int nbrHeure) {
        super(identifiant, adresse, nom, nbrHeure);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    
    
    
}
