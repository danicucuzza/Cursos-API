package com.programacion.cursosit.repository;

import com.programacion.cursosit.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository <Tema, Long> {
}
