package application.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.record.LivroDTO;
import application.record.LivroInsertDTO;
import application.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public Iterable<LivroDTO> list() {
        return this.livroService.list();
    }

    @PostMapping
    public LivroDTO insert(@RequestBody LivroInsertDTO livro) {
       return this.livroService.insert(livro);
    }

    @GetMapping("/{id}")
    public LivroDTO getOne(@PathVariable long id) {
        return this.livroService.getOne(id);
    }

    @PutMapping("/{id}")
    public LivroDTO update(@PathVariable long id, @RequestBody LivroDTO livro) {
        return this.livroService.update(id, livro);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        this.livroService.delete(id);
    }
        
}
