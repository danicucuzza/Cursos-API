package com.programacion.cursosit.service;

import com.programacion.cursosit.model.Curso;
import com.programacion.cursosit.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService implements ICursoService{

    @Autowired
    private ICursoRepository iCursoRepository;

    @Override
    public List<Curso> getCursos() {
        List<Curso> listaCursos = iCursoRepository.findAll();
        return listaCursos;
    }

    @Override
    public void saveCurso(Curso curso) {
        iCursoRepository.save(curso);
    }

    @Override
    public void deleteCurso(Long id_curso) {
        iCursoRepository.deleteById(id_curso);
    }

    @Override
    public Curso findCurso(Long id_curso) {
        Curso curso = iCursoRepository.findById(id_curso).orElse(null);
        return curso;
    }

    @Override
    public void editCurso(Curso curso) {
        this.saveCurso(curso);
    }
}
