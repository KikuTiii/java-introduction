package sptech.school.aula2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //serve para indicar que a classe é um controlador
public class FraseController {

    // um controller serve para receber requisições e devolver respostas
    // um endpoint é uma URL que o controller vai responder ou seja um método que vai responder a uma requisição

    @GetMapping("/frase") //indica que o método vai responder a requisições do tipo GET na URL /frase
    public String frase() {
        return "vai curintia";
    }
}
