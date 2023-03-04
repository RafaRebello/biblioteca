package br.com.curso.biblioteca.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "TB_EMPRESTIMO")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "id")
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name = "idObra", referencedColumnName = "id")
    private Obra obra;

    @Column(nullable = false)
    private Date data;

    public Emprestimo() {
    }

    public Emprestimo(Long id, Date data) {
        this.id = id;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

}
