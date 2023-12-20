package edu.m2i.projetJEE.entity;

import java.util.Objects;

public class Categorie {

	private Integer id;
	private String type;

	public Categorie(String type) {
		super();
		this.type = type;
	}

	public Categorie() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categorie other = (Categorie) obj;
		return Objects.equals(id, other.id) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", type=" + type + "]";
	}

}
