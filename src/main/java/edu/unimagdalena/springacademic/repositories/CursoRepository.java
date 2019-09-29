package edu.unimagdalena.springacademic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unimagdalena.springacademic.entities.Curso;

/**
 * CursoRepository
 */
@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

  
}