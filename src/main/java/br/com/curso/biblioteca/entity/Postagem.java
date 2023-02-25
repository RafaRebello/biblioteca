package br.com.curso.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "TB_POSTAGEM")
public class Postagem extends ObraDigital {
    @Column(nullable = false)
    protected Enum platafora;
    @Column(nullable = false)
    protected String conteudo;

    public Postagem() {

    }

    public Postagem(Long id, String titulo, Date datapublicacao, String url, Enum platafora, String conteudo) {
        super(id, titulo, datapublicacao, url);
        this.platafora = platafora;
        this.conteudo = conteudo;
    }

    public Enum getPlatafora() {
        return platafora;
    }

    public String getConteudo() {
        return conteudo;
    }
}
