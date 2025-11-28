package br.com.missio.project.web.clients.controllers;

import br.com.missio.project.core.entities.Client;
import br.com.missio.project.core.services.ClientService;
import br.com.missio.project.web.clients.dto.ClientDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Map;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @RequestMapping("/client")
    public ModelAndView index(){
     var clients = clientService.findAll();
     var clientsDTO = new ArrayList<ClientDTO>();
     for (Client client : clients) {
         var clientDTO = ClientDTO.of(client);
            clientsDTO.add(clientDTO);
     }
     var model = Map.of("clients", clientsDTO);
     return new ModelAndView("clients/index", model);
    }
}
