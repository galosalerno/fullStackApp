package coop.tecso.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import coop.tecso.examen.model.Persona;

public interface TitularRepository extends JpaRepository<Persona, Long> {

}

