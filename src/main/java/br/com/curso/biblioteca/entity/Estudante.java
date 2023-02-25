package br.com.curso.biblioteca.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ESTUDANTE")
public class Estudante extends Usuario{
    @Column(nullable = false)
    protected String matricula;

    public Estudante(){

    }

    public Estudante(Long id, String nome, String rg, String email, String matricula) {
        super(id, nome, rg, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
