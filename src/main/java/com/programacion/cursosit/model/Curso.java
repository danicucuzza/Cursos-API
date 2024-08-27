package com.programacion.cursosit.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id_curso;
    private String nombre;
    private String modalidad;
    private String fecha_finalizacion;

    @OneToMany (mappedBy = "curso")
    private List<Tema> listaDeTemas;

    public Curso() {
    }

    public Curso(Long id_curso, String nombre, String modalidad, String fecha_finalizacion, List<Tema> listaDeTemas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;
        this.listaDeTemas = listaDeTemas;
    }
}
