package br.com.projeto.utd.projetolivraria.repository;

import br.com.projeto.utd.projetolivraria.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}