package br.com.eduardo.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eduardo.cliente.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

}
