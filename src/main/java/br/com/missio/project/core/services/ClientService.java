package br.com.missio.project.core.services;


import br.com.missio.project.core.entities.Client;
import br.com.missio.project.core.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    public void save(Client client){
        clientRepository.save(client);
    }

    public Client findById(Long id){
        return clientRepository.findById(id).orElse(null);
    }
    public Iterable<Client> findAll(){
        return clientRepository.findAll();
    }
}
