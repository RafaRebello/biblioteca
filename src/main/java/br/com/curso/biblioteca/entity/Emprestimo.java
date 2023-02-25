package br.com.curso.biblioteca.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "TB_EMPRESTIMO")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date data;

}
