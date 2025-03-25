package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.record.AutorDTO;
import application.service.AutorService;

@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @GetMapping
    public Iterable<AutorDTO> list() {
        return autorService.findAll();
    }

    @PostMapping
    public AutorDTO insert(@RequestBody AutorDTO autor) {
        return autorService.insert(autor);
    }
}
