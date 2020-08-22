package br.com.madrugadev.exspringdatajpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.madrugadev.exspringdatajpa.model.Livro;
import br.com.madrugadev.exspringdatajpa.repository.LivroRepository;

@RestController
@RequestMapping("/livros")
public class LivroController {
   
	
  @Autowired
  private LivroRepository livrosRepository;
 
  @GetMapping("/{id}")
  public Optional<Livro> buscarPorId(@PathVariable Long id) {
    return livrosRepository.findById(id);
  }
   
  @GetMapping
  public List<Livro> buscarTodos() {
    return livrosRepository.findAll();
  }
   
  @PostMapping
  public Livro salvar(@RequestBody Livro livro) {
    return livrosRepository.save(livro);
  }
  
  @PutMapping
  public Livro atualizar(@RequestBody Livro livro) {
    return livrosRepository.save(livro);
  }
  
  @DeleteMapping("/{id}")
  public void deletar(@PathVariable Long id) {
	  livrosRepository.deleteById(id);
  }
 
}
