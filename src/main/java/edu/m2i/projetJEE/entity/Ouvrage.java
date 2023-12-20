package edu.m2i.projetJEE.entity;

import java.util.Objects;

public class Ouvrage {

	private Integer id;
	private String titre;
	private String auteur;
	private String isbn;
	private Integer nbrExemplaire;

	public Ouvrage(String titre, String auteur, String isbn, Integer nbrExemplaire) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.isbn = isbn;
		this.nbrExemplaire = nbrExemplaire;
	}

	public Ouvrage() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(auteur, id, isbn, nbrExemplaire, titre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ouvrage other = (Ouvrage) obj;
		return Objects.equals(auteur, other.auteur) && Objects.equals(id, other.id) && Objects.equals(isbn, other.isbn)
				&& Objects.equals(nbrExemplaire, other.nbrExemplaire) && Objects.equals(titre, other.titre);
	}

	@Override
	public String toString() {
		return "Ouvrage [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", isbn=" + isbn + ", nbrExemplaire="
				+ nbrExemplaire + "]";
	}

}
