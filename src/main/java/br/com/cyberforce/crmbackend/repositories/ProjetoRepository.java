package br.com.cyberforce.crmbackend.repositories;

import br.com.cyberforce.crmbackend.models.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
