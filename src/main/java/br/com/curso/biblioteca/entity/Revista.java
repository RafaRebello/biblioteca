package br.com.curso.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "TB_EXEMPLAR_REVISTA")
public class Revista extends ObraFisica {
    @Column(nullable = false)
    protected int numero;

    public Revista() {

    }

    public Revista(Long id, String titulo, Date dataPublicacao, String codLocalizacao, int numero) {
        super(id, titulo, dataPublicacao, codLocalizacao);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
