package br.com.curso.biblioteca.repository;

import br.com.curso.biblioteca.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByEmail(String email);

    @Query("FROM Usuario u WHERE u.nome LIKE %:nome% OR u.rg LIKE %:rg%")
    public List<Usuario> findByNomeOuRG(String nome, String rg);

    @Query(name = "buscaTodosUsuariosPorOrdemAlfabetica")
    public List<Usuario> buscaTodosUsuariosPorOrdemAlfabetica();

    @Query(name = "buscaTodosUsuariosPorOrdemDeId")
    public List<Usuario> buscaTodosUsuariosPorOrdemDeId();
}
