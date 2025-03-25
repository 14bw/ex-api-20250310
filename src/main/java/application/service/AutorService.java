package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Autor;
import application.record.AutorDTO;
import application.repository.AutorRepository;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public AutorDTO insert(AutorDTO dados) {
        return new AutorDTO(autorRepository.save(new Autor(dados)));
    }

    public Iterable<AutorDTO> findAll() {
        return autorRepository.findAll().stream().map(AutorDTO::new).toList();
    }

    
}
