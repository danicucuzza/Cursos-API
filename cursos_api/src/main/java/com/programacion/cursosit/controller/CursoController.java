package com.programacion.cursosit.controller;

import com.programacion.cursosit.dto.CursoTemaDTO;
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
    public String editCurso(@RequestBody Curso curso) {
        iCursoService.editCurso(curso);
        return "Curso editado Correctamente";
    }

    @GetMapping("/buscar/palabra")
    public List<Curso> findCursoByName(@RequestParam String palabra) {
        return iCursoService.findCursoByName(palabra);
    }

    @GetMapping("/temas/{id_curso}")
    public CursoTemaDTO temaByCurso (@PathVariable Long id_curso) {
        return iCursoService.temasByCurso(id_curso);
    }

    @PostMapping("/asociartemas/{id_curso}")
    public Curso addTemaInCurso(@PathVariable Long id_curso, @RequestBody List<Long> temaIds) {
        return iCursoService.addTemasInCurso(id_curso, temaIds);
    }
}
