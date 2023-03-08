package metier.entities;

import java.io.Serializable;

public class Produit implements Serializable {
	/**
	 * 
	 */
	private int idProduit;
	private String nomProduit;
	private double prix;

	public Produit() {
		super();
	}

	public Produit(String nomProduit, double prix) {
		super();
		this.nomProduit = nomProduit;
		this.prix = prix;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int i) {
		this.idProduit = i;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" +

				nomProduit + ", prix=" + prix + "]";
	}
}
