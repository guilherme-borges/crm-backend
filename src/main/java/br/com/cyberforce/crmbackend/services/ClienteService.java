package br.com.cyberforce.crmbackend.services;

import br.com.cyberforce.crmbackend.models.Cliente;
import br.com.cyberforce.crmbackend.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }
}
