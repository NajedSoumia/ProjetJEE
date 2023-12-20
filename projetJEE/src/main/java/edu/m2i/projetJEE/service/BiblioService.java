package edu.m2i.projetJEE.service;

import java.util.List;

import edu.m2i.projetJEE.entity.Abonne;
import edu.m2i.projetJEE.entity.Categorie;
import edu.m2i.projetJEE.entity.Emprunt;
import edu.m2i.projetJEE.entity.Ouvrage;

public interface BiblioService {
	List<Abonne> getAbonnes();
	void addAbonne(Abonne abonne);
	void updateAbonne(Abonne abonne);
	void deleteAbonne(Integer id);
	List<Categorie> getCategories();
	void addCategorie(Categorie categorie);
	void updateCategorie(Categorie categorie);
	void deleteCategorie(Integer id);
	List<Ouvrage> getOuvrages();
	void addOuvrage(Ouvrage ouvrage);
	void updateOuvrage(Ouvrage ouvrage);
	Emprunt getEmprunt(Integer id);
	boolean validateEmprunt(Emprunt emprunt);
	
}
