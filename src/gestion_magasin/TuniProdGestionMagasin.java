package gestion_magasin;

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
	        produit5.afficher();	  }}
