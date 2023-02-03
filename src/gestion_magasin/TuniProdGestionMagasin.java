package gestion_magasin;

import gestion_magasin.Magasin;
import gestion_magasin.ProduitAliementaire;
import tn.tuniprod.gestionmagasin.Caissier;

public class TuniProdGestionMagasin {
	  public static void main(String[] args) {

	        ProduitAliementaire produit1 = new ProduitAliementaire();
	        ProduitAliementaire produit2 = new ProduitAliementaire(1021, "Lait", "Delice");
	        ProduitAliementaire produit3 = new ProduitAliementaire(2510, "yaourt", "Vitalait");
	        ProduitAliementaire produit4 = new ProduitAliementaire(3250, "Tomate", "Sicam", 1.200f);
	        ProduitAliementaire produit5 = new ProduitAliementaire(3250, "Tomate", "Petit paris", 1.200f);
	        produit2.afficher();
	        produit3.afficher();
	        produit4.afficher();
	        produit5.afficher();
	        Magasin m1 = new Magasin(12345, "El Aouina");
//	        System.out.println(m1);

	        m1.ajouterProduit(produit1);
	        m1.ajouterProduit(produit2);
	        m1.ajouterProduit(produit3);
	        m1.ajouterProduit(produit4);
	        m1.supprimerProduit(new ProduitAliementaire(98798, "qsd", "qsd"));
	        System.out.println(m1);

	        //---------------------------
	        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-ville");
	        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah6");	     
	        Caissier caissierC1 = new Caissier(5, 123456, "Ariana", "Mahamed", 36);
	        Caissier caissierC2 = new Caissier(2, 894679, "Tunis", "Ali", 40);
	  
	  
	  }}
	     
