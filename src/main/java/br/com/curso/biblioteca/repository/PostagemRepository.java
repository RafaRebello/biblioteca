package br.com.curso.biblioteca.repository;

import br.com.curso.biblioteca.entity.Postagem;
import br.com.curso.biblioteca.enums.PlataformaDigital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {

    public List<Postagem> findByPlataforma(PlataformaDigital plataforma);

    public List<Postagem> findByConteudo(String conteudo);

    public Postagem findByUrl(String url);

    public List<Postagem> findByTitulo(String titulo);

    public List<Postagem> findByDataPublicacao(Date dataPublicacao);
}
