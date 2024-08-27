package com.programacion.cursosit.service;

import com.programacion.cursosit.dto.CursoTemaDTO;
import com.programacion.cursosit.model.Curso;
import com.programacion.cursosit.model.Tema;
import com.programacion.cursosit.repository.ICursoRepository;
import com.programacion.cursosit.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CursoService implements ICursoService {

    @Autowired
    private ICursoRepository iCursoRepository;

    @Autowired
    private ITemaRepository iTemaRepository;

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


    @Override
    public List<Curso> findCursoByName(String palabra) {
        String palabraLower = palabra.toLowerCase();
        List<Curso> listaCursos = iCursoRepository.findAll();
        List<Curso> listaCursosFiltrados = new ArrayList<>();

        for (Curso curso : listaCursos) {
            String textoComparar = curso.getNombre();
            if (textoComparar != null && textoComparar.toLowerCase().contains(palabraLower)) {
                listaCursosFiltrados.add(curso);
            }
        }
        return listaCursosFiltrados;
    }

    @Override
    public CursoTemaDTO temasByCurso(Long id_curso) {
        Optional<Curso> cursoOptional = iCursoRepository.findById(id_curso);
        if (cursoOptional.isPresent()) {
            Curso curso = cursoOptional.get();
            List<Tema> temas = curso.getListaDeTemas();
            return new CursoTemaDTO(curso.getNombre(), temas);
        }
        throw new RuntimeException("Curso no encontrado");
    }

    @Override
    public Curso addTemasInCurso(Long id_curso, List<Long> temasIds) {
        Optional<Curso> cursoOptional = iCursoRepository.findById(id_curso);
        if (cursoOptional.isPresent()) {
            Curso curso = cursoOptional.get();
            for (Long temaId : temasIds) {
                Optional<Tema> temaOptional = iTemaRepository.findById(temaId);
                if (temaOptional.isPresent()) {
                    Tema tema = temaOptional.get();
                    tema.setCurso(curso);
                    iTemaRepository.save(tema);
                    if (!curso.getListaDeTemas().contains(tema)) {
                        curso.getListaDeTemas().add(tema);
                    }
                }
            }
            iCursoRepository.save(curso);
            return curso;
        }
        throw new RuntimeException("Curso no encontrado");
    }
}
