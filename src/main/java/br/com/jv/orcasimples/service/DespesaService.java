package br.com.jv.orcasimples.service;

import br.com.jv.orcasimples.repository.DespesaRepository;
import java.util.List;
import br.com.jv.orcasimples.entity.Despesa;

import org.springframework.stereotype.Service;

@Service
public class DespesaService {

    private DespesaRepository despesaRepository;

    public DespesaService(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    } 
    
    public List<Despesa> create(Despesa despesa) {
        despesaRepository.save(despesa);
        return list();
    }

    public List<Despesa> list() {
        return despesaRepository.findAll();
    }

    public List<Despesa> update(Despesa despesa) {
        despesaRepository.save(despesa);
        return list();
    }

    public List<Despesa> delete(Long id) {
        despesaRepository.deleteById(id);
        return list();
    }
}
