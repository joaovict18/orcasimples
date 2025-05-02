package br.com.jv.orcasimples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jv.orcasimples.entity.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Long> {    
}
