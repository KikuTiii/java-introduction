package school.sptech.ex1;

public class Ex1ClasseSocialMetodos {
    public Double calcularQtdSalariosMinimos (Double rendaFamiliar){
        Double salario = 1045.00;
        
        return rendaFamiliar/salario;
    }

    public String classeSocial (Double qtdSalario){

        if(qtdSalario <= 2)
            return "E";
        else if(qtdSalario <= 4)
            return "D";
        else if(qtdSalario <= 10)
            return "C";
        else if(qtdSalario <= 20)
            return "B";
        else
            return "A"; 
    }
}
