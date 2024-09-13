package br.com.ac1.ac1.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "categorias")
@Table(name = "tbl_categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos;

    public Categoria(int id, String nome, String descricao, List<Produto> produtos) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.produtos = produtos;
    }

    public Categoria(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Categoria() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
