package sptech.school.aula2;

import org.springframework.web.bind.annotation.*;

@RestController // Indica que a classe é um controlador REST
@RequestMapping("/frase") // Significa que a URL base para acessar todos os métodos dessa classe é /frase
public class FraseController {

    // Indica que o método responde a requisições HTTP do tipo GET
    // endpoint significa o caminho que o método responde ou seja, a URL que o método responde

    @GetMapping
    public String frase() {
        return "Vai curintia";
    }

    @GetMapping("/saudacao/{nome}") // O {nome} é uma variável que pode ser passada na URL
    public String saudacao(@PathVariable String nome) {
        return "Olá, %s".formatted(nome);
    }
}
