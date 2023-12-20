package edu.m2i.projetJEE.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emprunt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	Abonne abonne;
	Ouvrage ouvrage;
	LocalDate dateDebut;
	Integer duree;
	Statut statut;
	
	public Emprunt() {
        super();
    }
	
	public Emprunt(Abonne abonne, Ouvrage ouvrage, LocalDate dateDebut, Integer duree, Statut statut) {
        super();
        this.abonne = abonne;
        this.ouvrage = ouvrage;
        this.dateDebut = dateDebut;
        this.duree = duree;
        this.statut = statut;
    }

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", abonne=" + abonne + ", ouvrage=" + ouvrage + ", duree=" + duree + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Abonne getAbonne() {
		return abonne;
	}

	public void setAbonne(Abonne abonne) {
		this.abonne = abonne;
	}

	public Ouvrage getOuvrage() {
		return ouvrage;
	}

	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}
	
}