package gestion_magasin;
//commentaire
public abstract class Employe {
	int identifiant;
    String adresse;
    String nom;
    int nbrHeure;

    public Employe(int identifiant, String adresse, String nom, int nbrHeure) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.nom = nom;
        this.nbrHeure = nbrHeure;
    }

    @Override
    public String toString() {
        return "Employe{" + "identifiant=" + identifiant + ", adresse=" + adresse + ", nom=" + nom + ", nbrHeure=" + nbrHeure + '}';
    }
    public abstract float getSalaireEmploye();
}
