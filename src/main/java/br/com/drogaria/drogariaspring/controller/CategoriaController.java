package br.com.drogaria.drogariaspring.controller;


import br.com.drogaria.drogariaspring.domain.Categoria;
import br.com.drogaria.drogariaspring.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping()
    public List<Categoria> listarCategoria() {
        return categoriaRepository.findAll();
    }

    @PostMapping
    public Categoria inserirCategoria(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @DeleteMapping("{codigo}")
    public Categoria deletarCategoria(@PathVariable Short codigo) {
        Optional<Categoria> categoria = categoriaRepository.findById(codigo);
        categoriaRepository.delete(categoria.get());
        Categoria categoriaRetorno = categoria.get();
        return categoriaRetorno;

    }
}
