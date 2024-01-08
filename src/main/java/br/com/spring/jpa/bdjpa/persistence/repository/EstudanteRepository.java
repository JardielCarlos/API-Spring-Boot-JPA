package br.com.spring.jpa.bdjpa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.jpa.bdjpa.persistence.entity.Estudante;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long>{
  
}
