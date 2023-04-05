package br.com.cyberforce.crmbackend.controllers;

import br.com.cyberforce.crmbackend.models.Oportunidade;
import br.com.cyberforce.crmbackend.repositories.OportunidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/oportunidades")
public class OportunidadeController {

    @Autowired
    private OportunidadeRepository oportunidadeRepository;

    @PostMapping
    public Oportunidade salvar(@RequestBody Oportunidade oportunidade) {
        return oportunidadeRepository.save(oportunidade);
    }

    @GetMapping
    public List<Oportunidade> buscarTodos() {
        return oportunidadeRepository.findAll();
    }
}
