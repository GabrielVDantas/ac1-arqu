package br.com.ac1.ac1.entities;

import jakarta.persistence.*;

@Entity(name = "produtos")
@Table(name = "tbl_produtos")
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private int quantia;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Produto(int id, String nome, int quantia, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.quantia = quantia;
        this.categoria = categoria;
    }

    public Produto(String nome, int quantia, Categoria categoria) {
        this.nome = nome;
        this.quantia = quantia;
        this.categoria = categoria;
    }

    public Produto(String nome, int quantia) {
        this.nome = nome;
        this.quantia = quantia;
    }

    public Produto(int id) {
        this.id = id;
    }

    public Produto() {}

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

    public int getQuantia() {
        return quantia;
    }

    public void setQuantia(int quantia) {
        this.quantia = quantia;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
