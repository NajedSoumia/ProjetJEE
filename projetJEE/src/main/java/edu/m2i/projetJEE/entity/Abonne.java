package edu.m2i.projetJEE.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Abonne {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String prenom;
	@Column(nullable = false)
	private String adresse;
	@Column(nullable = false)
	private String login;
	@Column(nullable = false)
	private String password;
	@OneToMany(mappedBy = "abonne", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Emprunt> emprunts;

	public Abonne() {
		super();
	}


	public Abonne(String nom, String prenom, String adresse, String login, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.login = login;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Abonne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", login=" + login
				+ ", password=" + password + "]";
	}
	
}
