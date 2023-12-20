package edu.m2i.projetJEE.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.m2i.projetJEE.entity.Abonne;
import edu.m2i.projetJEE.entity.Categorie;
import edu.m2i.projetJEE.entity.Emprunt;
import edu.m2i.projetJEE.entity.Ouvrage;
import edu.m2i.projetJEE.repository.AbonneRepository;
import edu.m2i.projetJEE.repository.CategorieRepository;
import edu.m2i.projetJEE.repository.EmpruntRepository;
import edu.m2i.projetJEE.repository.OuvrageRepository;
import edu.m2i.projetJEE.service.BiblioService;

@Service
public class BiblioServiceImpl implements BiblioService {
	
	@Autowired
	AbonneRepository abonneRepository;
	
	@Autowired
	CategorieRepository categorieRepository;
	
	@Autowired
	OuvrageRepository ouvrageRepository;
	
	@Autowired
	EmpruntRepository empruntRepository;

	@Override
	public List<Abonne> getAbonnes() {
		return abonneRepository.findAll();
	}

	@Override
	public void addAbonne(Abonne abonne) {
		abonneRepository.save(abonne);
		
	}

	@Override
	public void updateAbonne(Abonne abonne) {
		Abonne abonneToUpdate = abonneRepository.findById(abonne.getId()).get();
		if (abonne.getNom() != null) {
			abonneToUpdate.setNom(abonne.getNom());
		}
		if (abonne.getPrenom() != null) {
			abonneToUpdate.setPrenom(abonne.getPrenom());
		}
		if (abonne.getAdresse() != null) {
			abonneToUpdate.setAdresse(abonne.getAdresse());
		}
		if (abonne.getLogin() != null) {
			abonneToUpdate.setLogin(abonne.getLogin());
		}
		if (abonne.getPassword() != null) {
			abonneToUpdate.setPassword(abonne.getPassword());
		}
		abonneRepository.save(abonneToUpdate);
		
	}

	@Override
	public void deleteAbonne(Integer id) {
	    abonneRepository.deleteById(id);
		
	}

	@Override
	public List<Categorie> getCategories() {
		return categorieRepository.findAll();
		
	}

	@Override
	public void addCategorie(Categorie categorie) {
		categorieRepository.save(categorie);
		
	}

	@Override
	public void updateCategorie(Categorie categorie) {
		Categorie categorieToUpdate = categorieRepository.findById(categorie.getId()).get();
		if (categorie.getType() != null) {
			categorieToUpdate.setType(categorie.getType());
		}
		categorieRepository.save(categorieToUpdate);
		
	}

	@Override
	public void deleteCategorie(Integer id) {
		categorieRepository.deleteById(id);
		
	}

	@Override
	public List<Ouvrage> getOuvrages() {
		return ouvrageRepository.findAll();
	}

	@Override
	public void addOuvrage(Ouvrage ouvrage) {
		ouvrageRepository.save(ouvrage);
		
	}

	@Override
	public void updateOuvrage(Ouvrage ouvrage) {
		Ouvrage ouvrageToUpdate = ouvrageRepository.findById(ouvrage.getId()).get();
		if (ouvrage.getTitre() != null) {
			ouvrageToUpdate.setTitre(ouvrage.getTitre());
		}
		if (ouvrage.getAuteur() != null) {
			ouvrageToUpdate.setAuteur(ouvrage.getAuteur());
		}
		if (ouvrage.getISBN() != null) {
			ouvrageToUpdate.setISBN(ouvrage.getISBN());
		}
		if (String.valueOf(ouvrage.getNombreExemplaire()) != null) {
			ouvrageToUpdate.setNombreExemplaire(ouvrage.getNombreExemplaire());
		}
		ouvrageRepository.save(ouvrageToUpdate);
	}

	@Override
	public Emprunt getEmprunt(Integer id) {
		return empruntRepository.findById(id).get();
	}

	@Override
	public boolean validateEmprunt(Emprunt emprunt) {
		return emprunt.getOuvrage().isExist() && emprunt.getOuvrage().isAvailable();
	}

}
