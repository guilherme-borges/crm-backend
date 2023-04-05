package br.com.cyberforce.crmbackend.repositories;

import br.com.cyberforce.crmbackend.models.Oportunidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OportunidadeRepository extends JpaRepository<Oportunidade, Long> {
}
