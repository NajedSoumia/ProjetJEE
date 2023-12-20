package edu.m2i.projetJEE.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Ouvrage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false)
	private String titre;
	@Column(nullable = false)
	private String auteur;
	private String isbn;
	@Column(nullable = false)
	private int nombreExemplaire;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "id_categorie")
	private Categorie categorie;
	@OneToMany(mappedBy = "ouvrage", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Emprunt> emprunts;
	
	public Ouvrage() {
        super();
    }
	
	public Ouvrage(String titre, String auteur, String isbn, int nombreExemplaire, Categorie categorie) {
        super();
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.nombreExemplaire = nombreExemplaire;
        this.categorie = categorie;
    }

	@Override
	public String toString() {
		return "Ouvrage [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", isbn=" + isbn + ", nombreExemplaire="
				+ nombreExemplaire + ", categorie=" + categorie + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	public int getNombreExemplaire() {
		return nombreExemplaire;
	}

	public void setNombreExemplaire(int nombreExemplaire) {
		this.nombreExemplaire = nombreExemplaire;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public boolean isExist() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean isAvailable() {
		if (this.nombreExemplaire > 0) {
			return true;
		}
		return false;
	}
	
}

