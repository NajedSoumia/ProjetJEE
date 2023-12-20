package edu.m2i.projetJEE.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Emprunt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@Column(nullable = false)
	LocalDate dateDebut;
	@Column(nullable = false)
	Integer duree;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "id_statut")
	Statut statut;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "id_abonne")
	Abonne abonne;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "id_ouvrage")
	Ouvrage ouvrage;
	
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