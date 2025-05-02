package br.com.jv.orcasimples.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jv.orcasimples.entity.Despesa;
import br.com.jv.orcasimples.service.DespesaService;

@RestController
@RequestMapping("/despesas")
public class DespesaController {
    
    private DespesaService despesaService;
    
    public DespesaController(DespesaService despesaService) {
        this.despesaService = despesaService;
    }

    @PostMapping
    List<Despesa> create(@RequestBody Despesa despesa) {
        return despesaService.create(despesa);
    } 

    @GetMapping
    List<Despesa> list() {
        return despesaService.list();
    } 

    @PutMapping
    List<Despesa> update(@RequestBody Despesa despesa) {
        return despesaService.update(despesa);
    } 

    @DeleteMapping("{id}")
    List<Despesa> delete(@PathVariable Long id) {
        return despesaService.delete(id);
    } 
}
