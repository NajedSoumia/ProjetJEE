package edu.m2i.projetJEE.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Emprunt {

	private Integer id;
	private Integer idAbonne;
	private Integer idOuvrage;
	private LocalDate dateDebut;
	private Integer duree;
	private String statut;

	public Emprunt(Integer idAbonne, Integer idOuvrage, LocalDate dateDebut, Integer duree, String statut) {
		super();
		this.idAbonne = idAbonne;
		this.idOuvrage = idOuvrage;
		this.dateDebut = dateDebut;
		this.duree = duree;
		this.statut = statut;
	}

	public Emprunt() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdAbonne() {
		return idAbonne;
	}

	public void setIdAbonne(Integer idAbonne) {
		this.idAbonne = idAbonne;
	}

	public Integer getIdOuvrage() {
		return idOuvrage;
	}

	public void setIdOuvrage(Integer idOuvrage) {
		this.idOuvrage = idOuvrage;
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

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	@Override
	public int hashCode() {
		return Objects.hash(statut, dateDebut, duree, id, idAbonne, idOuvrage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emprunt other = (Emprunt) obj;
		return Objects.equals(statut, other.statut) && Objects.equals(dateDebut, other.dateDebut)
				&& Objects.equals(duree, other.duree) && Objects.equals(id, other.id)
				&& Objects.equals(idAbonne, other.idAbonne) && Objects.equals(idOuvrage, other.idOuvrage);
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", idAbonne=" + idAbonne + ", idOuvrage=" + idOuvrage + ", dateDebut=" + dateDebut
				+ ", duree=" + duree + ", statut=" + statut + "]";
	}

}
