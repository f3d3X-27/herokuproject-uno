package com.example.herokuproject.services;

import com.example.herokuproject.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long>{

    //Metodo que se va a encargar de la busqueda

    List<Persona> search (String filtro) throws Exception;

    Page<Persona> search (String filtro, Pageable pageable) throws Exception;
}
