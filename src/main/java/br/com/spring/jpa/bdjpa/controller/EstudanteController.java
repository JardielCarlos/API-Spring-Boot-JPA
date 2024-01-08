package br.com.spring.jpa.bdjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import br.com.spring.jpa.bdjpa.persistence.entity.Estudante;
import br.com.spring.jpa.bdjpa.persistence.repository.EstudanteRepository;
import br.com.spring.jpa.bdjpa.service.EstudanteServiceImpl;

@RestController
@RequestMapping("/estudante")
public class EstudanteController {
  
  @Autowired
  private EstudanteServiceImpl service;

  @Autowired
  private EstudanteRepository repository;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<Estudante> getEstudante(){
    return service.getAll();
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Estudante getEstudanteID(@PathVariable long id){
    return service.getID(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Cliente não encontrado!"));
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Estudante CriarEstudante(@RequestBody Estudante estudante){
    return service.create(estudante);
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void atualizarEstudante(@PathVariable("id") long id, @RequestBody Estudante estudanteRequest){
    service.getID(id).map(estudanteBD -> {
      estudanteBD.setNome(estudanteRequest.getNome());
      estudanteBD.setMatricula(estudanteRequest.getMatricula());
      estudanteBD.setIdade(estudanteRequest.getIdade());

      repository.save(estudanteBD);
      
      return Void.TYPE;
    }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Cliente não encontrado!"));
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void removerEstudante(@PathVariable long id){
    service.getID(id).map(estudante -> {
      service.removerID(estudante.getId());
      return Void.TYPE;
    });
  }
}
