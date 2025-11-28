package br.com.missio.project.core.repositories;


import br.com.missio.project.core.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
