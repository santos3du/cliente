package br.com.eduardo.cliente.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.eduardo.cliente.dto.ClientDto;
import br.com.eduardo.cliente.entities.Client;
import br.com.eduardo.cliente.repository.ClientRepository;
import br.com.eduardo.cliente.services.exception.EntityNotFoundException;

@Service
public class ClientService {
	@Autowired 
	private ClientRepository repo;
	
	@Transactional(readOnly = true)
	public Page<ClientDto> findAll(Pageable pageable) {
		Page<Client> list = repo.findAll(pageable);
		return list.map(x -> new ClientDto(x));
	}
	
	@Transactional
	public ClientDto insert(ClientDto dto) {
		Client entity = new Client();
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity.setIncome(dto.getIncome());
		entity.setBirthDate(dto.getBirthDate());
		entity.setChildren(dto.getChildren());
		return new ClientDto(entity);
	}
	
	@Transactional(readOnly = true)
	public ClientDto findById(Long id) {
		Optional<Client> obj = repo.findById(id);
		Client entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity client not found"));
		return new ClientDto(entity);
	}
	


}
