package br.com.missio.project.web.clients.controllers;

import br.com.missio.project.core.repositories.ClientRepository;
import br.com.missio.project.web.clients.dto.ClientViewModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.Map;


@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class ClientController {

    private final ClientRepository clientRepository;

    @RequestMapping("/clients")
    public ModelAndView index() {
        var clients = clientRepository.findAll()
                .stream()
                .map(ClientViewModel::of)
                .toList();
        var model = Map.of("clients", clients);
        return new ModelAndView("clients/index", model);
    }
}
