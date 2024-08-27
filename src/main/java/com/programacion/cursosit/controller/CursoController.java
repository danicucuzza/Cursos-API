package com.programacion.cursosit.controller;

import com.programacion.cursosit.model.Curso;
import com.programacion.cursosit.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    @Autowired
    private ICursoService iCursoService;

    @PostMapping("/crear")
    public String crearCurso(@RequestBody Curso curso){
        iCursoService.saveCurso(curso);
        return "El curso fue creado correctamente";
    }

    @GetMapping("/traer")
    public List<Curso> getCursos() {
        return iCursoService.getCursos();
    }

    @DeleteMapping("/eliminar/{id}")
    public String deleteCurso(@PathVariable Long id) {
        iCursoService.deleteCurso(id);
        return "El curso fue eliminado correctamente";
    }

    @PutMapping("/editar")
    public Curso editCurso(@RequestBody Curso curso) {
        iCursoService.editCurso(curso);
        return iCursoService.findCurso(curso.getId_curso());
    }

    @GetMapping("/buscar/palabra")
    public List<Curso> findCursoForName(@RequestParam String palabra) {
        return iCursoService.findCursoForName(palabra);
    }
}
