package br.com.ac1.ac1.repositories;

import br.com.ac1.ac1.dtos.NovaCategReq;
import br.com.ac1.ac1.entities.Categoria;
import br.com.ac1.ac1.entities.Produto;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriaRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Categoria salvarCategoria(Categoria categoria) {
        return entityManager.merge(categoria);
    }

    @Transactional
    public List<Categoria> buscarTodosCategorias() {
        return entityManager.createQuery("SELECT c FROM categorias c", Categoria.class).getResultList();
    }

    @Transactional
    public void deletarPorId(Categoria categoria) {
        entityManager.remove(Categoria.class);
    }
}
