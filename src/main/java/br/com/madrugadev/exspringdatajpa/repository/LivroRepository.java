package br.com.madrugadev.exspringdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.madrugadev.exspringdatajpa.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
