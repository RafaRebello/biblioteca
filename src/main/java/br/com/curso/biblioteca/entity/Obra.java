package br.com.curso.biblioteca.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TB_EXEMPLAR_OBRA")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Obra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column(nullable = false)
    protected String titulo;
    @Column(nullable = false)
    protected Date dataPublicacao;

    public Obra(){

    }

    public Obra(Long id, String titulo, Date datapublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.dataPublicacao = datapublicacao;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getDatapublicacao() {
        return dataPublicacao;
    }
}
