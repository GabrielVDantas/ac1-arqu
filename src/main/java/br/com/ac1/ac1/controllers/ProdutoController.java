package br.com.ac1.ac1.controllers;

import br.com.ac1.ac1.dtos.NovoProdutoReq;
import br.com.ac1.ac1.dtos.ProdutoEspReq;
import br.com.ac1.ac1.entities.Produto;
import br.com.ac1.ac1.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping()
    public Produto novoProduto(@RequestBody NovoProdutoReq novoProdutoReq) {
        Produto produto = new Produto(novoProdutoReq.nome(), novoProdutoReq.quantia());
         return produtoRepository.salvarProduto(produto);
    }

    @GetMapping()
    public List<Produto> verProdutos() {
        return produtoRepository.buscarTodosProdutos();
    }

    @GetMapping("/{id}")
    public void verUmProduto(@RequestBody ProdutoEspReq produtoEspReq) {
        Produto produto = new Produto(produtoEspReq.id());
        produtoRepository.buscarPorId(produto);
    }
}
