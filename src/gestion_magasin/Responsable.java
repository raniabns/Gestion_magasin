package gestion_magasin;
/**
 * author : Mohamed Omar Skhiri **/
public class Responsable extends Employe {
    float prime;
    public Responsable(float prime, int identifiant, String adresse, String nom, int nbrHeure) {
        super(identifiant, adresse, nom, nbrHeure);
        this.prime = prime;
    }

    //getSalary function to do


    @Override
    public String toString() {
        return "Responsable{" + "prime=" + prime + '}' + " " + super.toString();
    }
}
