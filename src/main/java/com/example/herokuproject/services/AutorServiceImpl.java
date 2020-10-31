package com.example.herokuproject.services;

import com.example.herokuproject.entities.Autor;
import com.example.herokuproject.repositories.AutorRepository;
import com.example.herokuproject.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements  AutorService{


    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
