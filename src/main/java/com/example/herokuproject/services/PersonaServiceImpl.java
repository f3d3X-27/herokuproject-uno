package com.example.herokuproject.services;


import com.example.herokuproject.entities.Persona;
import com.example.herokuproject.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

     @Autowired
    private PersonaRepository personaRepository;

    // El constructor tmb puede hacerse con @Autowired

    public PersonaServiceImpl(PersonaRepository personaRepository){     //Spring sera el encargado de obtener las dependencias que necesita el servicio
        super(personaRepository);
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {
           List<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
           return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Persona> personas = personaRepository.searchNativo(filtro, pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
