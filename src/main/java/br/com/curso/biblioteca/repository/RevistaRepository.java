package br.com.curso.biblioteca.repository;

import br.com.curso.biblioteca.entity.Revista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface RevistaRepository extends JpaRepository<Revista, Long> {

    public List<Revista> findByNumero(Integer numero);

    public List<Revista> findByCodLocalizacao(String codLocalizacao);

    public List<Revista> findByTitulo(String titulo);

    public List<Revista> findByDataPublicacao(Date dataPublicacao);
}
