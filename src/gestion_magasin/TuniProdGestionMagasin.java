package gestion_magasin;

import gestion_magasin.Magasin;
import gestion_magasin.ProduitAliementaire;
import gestion_magasin.Caissier;
import gestion_magasin.Responsable;
import gestion_magasin.Vendeur;

public class TuniProdGestionMagasin {
	  public static void main(String[] args) {

	        ProduitAliementaire produit1 = new ProduitAliementaire();
	        ProduitAliementaire produit2 = new ProduitAliementaire(1021, "Lait", "Delice");
	        ProduitAliementaire produit3 = new ProduitAliementaire(2510, "yaourt", "Vitalait");
	        ProduitAliementaire produit4 = new ProduitAliementaire(3250, "Tomate", "Sicam", 1.200f);
	        ProduitAliementaire produit5 = new ProduitAliementaire(2250, "Tomate", "Petit paris", 1.200f);
	   
	        produit2.afficher();
	        produit3.afficher();
	        produit4.afficher();
	        produit5.afficher();
	        Magasin m1 = new Magasin(12345, "El Aouina");
         System.out.println(m1);

	        m1.ajouterProduit(produit1);
	        m1.ajouterProduit(produit2);
	        m1.ajouterProduit(produit3);
	        m1.ajouterProduit(produit4);
	        m1.supprimerProduit(new ProduitAliementaire(98798, "qsd", "qsd"));
	        System.out.println(m1);
	        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-ville");
	        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah6");	     
	        Vendeur vendeurC1 = new Vendeur(10, 849895, "Charguia", "Nihel", 50);
	        Caissier caissierC1 = new Caissier(5, 123456, "Ariana", "Mahamed", 36);
	        Caissier caissierC2 = new Caissier(2, 894679, "Tunis", "Ali", 40);

	        Caissier caissierM1 = new Caissier(9, 48912, "Tunis", "Kais", 42);
	        Vendeur vendeurM1 = new Vendeur(15, 9485632, "Bizerte", "Abdou", 15);
	        Responsable responsableM1 = new Responsable(1500, 9821421, "Ghazela", "Mouhaned", 170);
	            System.out.println("SALAIRE :"+responsableM1.getSalaireEmploye());
	        monoprix.ajouterEmploye(caissierC1);
	        monoprix.ajouterEmploye(caissierC2);
	        monoprix.ajouterEmploye(vendeurC1);
	        carrefour.ajouterEmploye(caissierM1);
	        carrefour.ajouterEmploye(vendeurM1);
	        carrefour.ajouterEmploye(responsableM1);
	       System.out.println("-------------");
	        monoprix.ajouterProduit(produit2);
	        monoprix.ajouterProduit(produit3);
	        carrefour.ajouterProduit(produit3);
	        carrefour.ajouterProduit(produit4);
	        System.out.println("-------------");
	        System.out.println(monoprix);
	        System.out.println("-------------");
	        System.out.println(carrefour);

	    }

	  }
	     
