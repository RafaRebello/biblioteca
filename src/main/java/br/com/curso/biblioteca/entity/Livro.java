package br.com.curso.biblioteca.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TB_EXEMPLAR_LIVRO")
@PrimaryKeyJoinColumn(name = "idObra")


@NamedQueries({
        @NamedQuery(name = "buscaTodosOrdenadosTitulo", query = "FROM Livro ORDER BY titulo"),
        @NamedQuery(name = "buscaTodosOrdenadosAutor", query = "FROM Livro ORDER BY autor")
})

@NamedNativeQueries({
        @NamedNativeQuery(name = "buscaMaisAntigo", query = "SELECT \r\n"
                + "o.titulo \r\n"
                + "FROM \r\n"
                + "biblioteca.tb_exemplar_livro l,\r\n"
                + "biblioteca.tb_exemplar_obra o\r\n"
                + "WHERE\r\n"
                + "l.id_obra = o.id\r\n"
                + "ORDER BY\r\n"
                + "o.data_publicacao\r\n"
                + "LIMIT 1")
})
public class Livro extends ObraFisica {
    @Column(nullable = false)
    private String autor;
    @Column(nullable = false)
    private String isbn;

    public Livro() {
    }

    public Livro(Long id, String titulo, Date dataPublicacao, String codLocalizacao, String autor, String isbn) {
        super(id, titulo, dataPublicacao, codLocalizacao);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Livro [id=" + id + ", titulo=" + titulo + ", dataPublicacao=" + dataPublicacao + ", codLocalizacao="
                + codLocalizacao + ", autor=" + autor + ", isbn=" + isbn + "]";
    }

}
