package one.digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//signifca que é um controlador que será acessado através de uma API Rest
@RequestMapping("/api/v1/people")
//local onde será acessado a mensagem descrita abaixo, classe people gerencia todo tipo de pessoa
public class PersonController {

    @GetMapping
    // operação get acessa todo tipo de coisa/requisição que será acessada através do browser
    public String getBook() {
        return "API Test!";
    }
}
