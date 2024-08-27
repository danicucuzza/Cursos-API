package com.programacion.cursosit.service;

import com.programacion.cursosit.model.Tema;

import java.util.List;

public interface ITemaService {

    //TRAER TODOS LOS TEMAS
    public List<Tema> getTemas();

    //CREAR UN TEMA
    public void saveTema (Tema tema);

    //ELIMINAR UN TEMA
    public void deleteTema (Long id_tema);

    //BUSCAR UN TEMA
    public Tema findTema (Long id_tema);

    //EDITAR TEMA
    public void editTema (Tema tema);
}
