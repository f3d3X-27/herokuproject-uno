package com.example.herokuproject.repositories;


import com.example.herokuproject.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends  BaseRepository<Autor, Long> { // Pasamos autor como tipo de entidad y Long como tipo de ID
}
