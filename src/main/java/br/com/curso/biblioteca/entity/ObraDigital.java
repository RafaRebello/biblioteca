package br.com.curso.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.util.Date;
@MappedSuperclass
public class ObraDigital extends Obra{
    @Column(nullable = false)
    protected String url;

    public ObraDigital(){

    }

    public ObraDigital(Long id, String titulo, Date datapublicacao, String url) {
        super(id, titulo, datapublicacao);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
