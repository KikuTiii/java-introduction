package sptech.school.aula2;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//São componentes do Spring:
// @RestController: Indica que a classe é um controlador REST
// @RequestMapping: Significa que a URL base para acessar todos os métodos dessa classe é /calculos
// @PathVariable: Indica que o valor da variável é passado na URL
// @RequestMapping("/calculos"): Significa que a URL base para acessar todos os métodos dessa classe é /calculos
// @RequestMapping("/soma/{a}/{b}"): Significa que a URL para acessar o método soma é /calculos/soma/{a}/{b}
// @PathVariable Integer a: Indica que o valor de a é passado na URL

@RestController
@RequestMapping("/calculos")
public class CalculadoraController {

    @RequestMapping("/soma/{a}/{b}")
    public Integer soma(@PathVariable Integer a,@PathVariable Integer b){
        return a + b;
    }
}
