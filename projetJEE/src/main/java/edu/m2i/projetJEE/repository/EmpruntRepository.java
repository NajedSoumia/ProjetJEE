package edu.m2i.projetJEE.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.m2i.projetJEE.entity.Emprunt;

public interface EmpruntRepository extends JpaRepository<Emprunt, Integer> {

}
