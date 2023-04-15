package br.com.curso.biblioteca.repository;

import br.com.curso.biblioteca.entity.Professor;

import java.util.List;

public interface ProfessorRepository extends UsuarioRepository{

    public  List<Professor> findByTitulacao(String titulacao);
}
