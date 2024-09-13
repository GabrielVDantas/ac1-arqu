package br.com.ac1.ac1.repositories;

import br.com.ac1.ac1.dtos.NovoProdutoReq;
import br.com.ac1.ac1.entities.Produto;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProdutoRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Produto salvarProduto(Produto produto) {
        return entityManager.merge(produto);
    }

    @Transactional
    public List<Produto> buscarTodosProdutos() {
        return entityManager.createQuery("SELECT p FROM produtos p", Produto.class).getResultList();
    }

    @Transactional
    public Produto buscarPorId(Produto produto) {
        return entityManager.find(Produto.class, produto);
    }

    @Transactional
    public void deletarPorId(Produto produto) {
        entityManager.remove(Produto.class);
    }
}
