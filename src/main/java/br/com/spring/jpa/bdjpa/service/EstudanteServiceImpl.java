package br.com.spring.jpa.bdjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.jpa.bdjpa.persistence.entity.Estudante;
import br.com.spring.jpa.bdjpa.persistence.repository.EstudanteRepository;

@Service
public class EstudanteServiceImpl implements EstudanteService {

  @Autowired
  private EstudanteRepository repository;


  @Override
  public Estudante create(Estudante estudante) {
    return repository.save(estudante);
  }

  @Override
  public List<Estudante> getAll() {
    return repository.findAll();
  }

  @Override
  public Optional<Estudante> getID(long id) {
    return repository.findById(id);
  }

  @Override
  public void removerID(long id) {
    repository.deleteById(id);
  }
  
}
