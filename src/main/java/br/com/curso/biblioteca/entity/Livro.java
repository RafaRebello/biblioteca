package br.com.curso.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "TB_EXEMPLAR_LIVRO")
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

}
