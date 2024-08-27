package com.programacion.cursosit.controller;

import com.programacion.cursosit.model.Tema;
import com.programacion.cursosit.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/temas")
public class TemaController {

    @Autowired
    private ITemaService iTemaService;

    @GetMapping("/traer")
    public List<Tema> getTemas() {
        return iTemaService.getTemas();
    }

    @PostMapping("/crear")
    public String createTema(@RequestBody Tema tema) {
        iTemaService.saveTema(tema);
        return "El tema fue creado correctamente";
    }

    @DeleteMapping("/eliminar/{id}")
    public String deleteTema(@PathVariable Long id_tema) {
        iTemaService.deleteTema(id_tema);
        return "El tema fue eliminado correctamente";
    }

    @PutMapping("/editar")
    public Tema editTema(@RequestBody Tema tema){
        iTemaService.editTema(tema);
        return iTemaService.findTema(tema.getId_tema());
    }
}
