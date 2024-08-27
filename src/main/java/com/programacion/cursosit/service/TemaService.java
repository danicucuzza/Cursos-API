package com.programacion.cursosit.service;

import com.programacion.cursosit.model.Tema;
import com.programacion.cursosit.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService{

    @Autowired
    private ITemaRepository iTemaRepository;

    @Override
    public List<Tema> getTemas() {
        List<Tema> listaTemas = iTemaRepository.findAll();
        return listaTemas;
    }

    @Override
    public void saveTema(Tema tema) {
        iTemaRepository.save(tema);
    }

    @Override
    public void deleteTema(Long id_tema) {
        iTemaRepository.deleteById(id_tema);
    }

    @Override
    public Tema findTema(Long id_tema) {
        Tema tema = iTemaRepository.findById(id_tema).orElse(null);
        return tema;
    }

    @Override
    public void editTema(Tema tema) {
        this.saveTema(tema);
    }

    @Override
    public List<Tema> getTemasByIds(List<Long> ids) {
        return iTemaRepository.findAllById(ids);
    }


}
