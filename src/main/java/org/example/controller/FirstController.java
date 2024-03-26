package org.example.controller;


import org.example.entity.Cliententity;
import org.example.repository.ClientRepository;
import org.example.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FirstController {

    ClientRepository clientRepository;
    ClientService clientService;

    public FirstController(ClientRepository clientRepository, ClientService clientService) {
        this.clientRepository = clientRepository;
        this.clientService = clientService;
    }

    @GetMapping("/")
    public String index(){
        return "My First app with postgres in amazon lambda";
    }

    @PostMapping("/save")
    public Cliententity saveclient(Cliententity entity){
        return clientService.addclient(entity);
    }


    @GetMapping("/list")
    public List<Cliententity> lister(){
        return clientService.lister();
    }

    @GetMapping("/list/{id}")
    public Optional<Cliententity> listebyid(@PathVariable int id){
        return  clientService.listbyid(id);
    }
}
