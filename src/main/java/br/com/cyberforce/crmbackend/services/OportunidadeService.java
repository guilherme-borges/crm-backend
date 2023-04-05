package br.com.cyberforce.crmbackend.services;

import br.com.cyberforce.crmbackend.models.Oportunidade;
import br.com.cyberforce.crmbackend.repositories.OportunidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OportunidadeService {

    @Autowired
    private OportunidadeRepository oportunidadeRepository;

    public Oportunidade salvar(Oportunidade oportunidade) {
        return oportunidadeRepository.save(oportunidade);
    }

    public List<Oportunidade> buscarTodos() {
        return oportunidadeRepository.findAll();
    }
}
