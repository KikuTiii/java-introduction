package sptech.school.aula2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    public Filme getFavorito(){

        // Jackson é uma biblioteca que converte objetos Java em JSON e vice-versa

        Filme filmeFavorito = new Filme("Interestelar", "Christopher Nolan");
        return filmeFavorito;
    }
}
