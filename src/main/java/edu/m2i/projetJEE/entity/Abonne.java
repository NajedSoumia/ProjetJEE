package edu.m2i.projetJEE.entity;

import java.util.Objects;

public class Abonne {

	private Integer id;
	private String login;
	private String password;
	private String name;
	private String prenom;
	private String adresse;

	public Abonne(String login, String password, String name, String prenom, String adresse) {
		super();
		this.login = login;
		this.password = password;
		this.name = name;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public Abonne() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(adresse, id, login, name, password, prenom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Abonne other = (Abonne) obj;
		return Objects.equals(adresse, other.adresse) && Objects.equals(id, other.id)
				&& Objects.equals(login, other.login) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && Objects.equals(prenom, other.prenom);
	}

	@Override
	public String toString() {
		return "Abonne [id=" + id + ", login=" + login + ", password=" + password + ", name=" + name + ", prenom="
				+ prenom + ", adresse=" + adresse + "]";
	}

}
