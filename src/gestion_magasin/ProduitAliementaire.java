package gestion_magasin;

import java.util.Date;
/**
*
* @author rania
*/
public class ProduitAliementaire {
	  private int identifiant;
	    private String libelle, marque;
	    private float prix;
	    private Date dateExpriration ; 
	    
	    

	    public ProduitAliementaire() {
	    }

	    public ProduitAliementaire(int identifiant, String libelle, String marque) {
	        this.identifiant = identifiant;
	        this.libelle = libelle;
	        this.marque = marque;
	    }

	    public ProduitAliementaire(int identifiant, String libelle, String marque, float prix) {
	        this.identifiant = identifiant;
	        this.libelle = libelle;
	        this.marque = marque;
	        this.prix = prix;
	    }

	    public int getIdentifiant() {
	        return identifiant;
	    }

	    public void setIdentifiant(int identifiant) {
	        this.identifiant = identifiant;
	    }
	    public String getLibelle() {
	        return libelle;
	    }

	    public void setLibelle(String libelle) {
	        this.libelle = libelle;
	    }

	    public String getMarque() {
	        return marque;
	    }

	    public void setMarque(String marque) {
	        this.marque = marque;
	    }

	    public float getPrix() {
	        return prix;
	    }

	    public void setPrix(float prix) {
	        this.prix = prix;
	    }
	    public Date getDateExpriration() {
	        return dateExpriration;
	    }

	    public void setDateExpriration(Date dateExpriration) {
	        this.dateExpriration = dateExpriration;
	    }
	    
	    public void afficher(){
	        System.out.println("------------------------");
	        System.out.println("identifiant : "+this.identifiant);
	        System.out.println("libelle : "+this.libelle);
	        System.out.println("marque : "+this.marque);
	        System.out.println("prix : "+this.prix);
	        System.out.println("------------------------");
	    }
	    

}
