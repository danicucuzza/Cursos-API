package com.programacion.cursosit.repository;

import com.programacion.cursosit.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository <Curso, Long> {
}
