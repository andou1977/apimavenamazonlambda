package org.example.service;

import org.example.entity.Cliententity;
import org.example.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    public Cliententity addclient(Cliententity clientEntity){
        return clientRepository.save(clientEntity);
    }



    public List<Cliententity> lister(){
        return clientRepository.findAll();
    }
    public Optional<Cliententity> listbyid(int id){
        return clientRepository.findById(id);
    }
}
