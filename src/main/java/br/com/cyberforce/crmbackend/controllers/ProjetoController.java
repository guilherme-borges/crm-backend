package br.com.cyberforce.crmbackend.controllers;

import br.com.cyberforce.crmbackend.models.Projeto;
import br.com.cyberforce.crmbackend.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public List<Projeto> buscarTodos() {
        return projetoService.buscarTodos();
    }
}
