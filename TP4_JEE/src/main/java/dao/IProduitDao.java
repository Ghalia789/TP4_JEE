package dao;
import java.util.List;

import metier.entities.Produit;
public interface IProduitDao {

		public Produit save(Produit p);

		public List<Produit> produitsParMC(String mc);

		public Produit getProduit(int id);

		public Produit updateProduit(Produit p);

		public void deleteProduit(int id);
}
