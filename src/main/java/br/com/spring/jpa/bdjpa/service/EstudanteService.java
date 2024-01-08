package br.com.spring.jpa.bdjpa.service;

import java.util.List;
import java.util.Optional;

import br.com.spring.jpa.bdjpa.persistence.entity.Estudante;

public interface EstudanteService {

  public Estudante create(Estudante estudante);

  public List<Estudante> getAll();

  public Optional<Estudante> getID(long id);

  public void removerID(long id);
  
}
