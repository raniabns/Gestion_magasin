package gestion_magasin;

public class vendeur {
	
	package tn.tuniprod.gestionmagasin;

	/**
	 *
	 * @author ACER
	 */
	public class Vendeur extends Employe {

	    float tauxDeVente;

	    public Vendeur(float tauxDeVente, int identifiant, String adresse, String nom, int nbrHeure) {
	        super(identifiant, adresse, nom, nbrHeure);
	        this.tauxDeVente = tauxDeVente;
	    }
}
