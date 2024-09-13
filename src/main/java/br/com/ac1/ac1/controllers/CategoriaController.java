package br.com.ac1.ac1.controllers;

import br.com.ac1.ac1.dtos.NovaCategReq;
import br.com.ac1.ac1.dtos.NovoProdutoReq;
import br.com.ac1.ac1.entities.Categoria;
import br.com.ac1.ac1.entities.Produto;
import br.com.ac1.ac1.repositories.CategoriaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping()
    public Categoria novaCategoria(@RequestBody NovaCategReq novaCategReq) {
        Categoria categoria = new Categoria(novaCategReq.nome(), novaCategReq.descricao());
        return categoriaRepository.salvarCategoria(categoria);
    }

    @GetMapping()
    public List<Categoria> verCategorias() {
        return categoriaRepository.buscarTodosCategorias();
    }
}
