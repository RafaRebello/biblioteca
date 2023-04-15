package br.com.curso.biblioteca.repository;

import br.com.curso.biblioteca.entity.Emprestimo;
import br.com.curso.biblioteca.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {

    public List<Emprestimo> findByData(Date data);

    public List<Emprestimo> findByUsuario(Usuario usuario);
}
