package gestion_magasin;

public abstract class Employe {
	int identifiant;
    String adress;
    String nom;
    int nbrHeure;

    public Employe(int identifiant, String adresse, String nom, int nbrHeure) {
        this.identifiant = identifiant;
        this.adress = adress;
        this.nom = nom;
        this.nbrHeure = nbrHeure;
    }

    @Override
    public String toString() {
        return "Employe{" + "identifiant=" + identifiant + ", adresse=" + adress + ", nom=" + nom + ", nbrHeure=" + nbrHeure + '}';
    }
    public abstract float getSalaireEmploye();
}
