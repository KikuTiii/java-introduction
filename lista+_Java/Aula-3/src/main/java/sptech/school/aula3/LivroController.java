package sptech.school.aula3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private int contador = 0;

    @GetMapping("/cadastrar/")
    public Livro cadastrar(
            @PathVariable String titulo,
            @PathVariable String nomeAutor,
            @PathVariable String dataLancamento
    )
}
