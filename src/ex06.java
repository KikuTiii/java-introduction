//Desenvolva um programa para calcular o salário líquido de um funcionário a partir do seu
//salário bruto. O programa deverá realizar os seguintes passos:

//- Estabelecer a leitura da variável HT (horas trabalhadas no mês);
//- Estabelecer a leitura da variável VH (valor da hora trabalhada);
//- Estabelecer a leitura da variável PD (percentual de desconto);
//- Calcular o salário bruto (SB), sendo este a multiplicação das variáveis HT e VH;
//- Calcular o total de desconto (TD) com base no valor de PD dividido por 100 e
//multiplicado pelo SB;
//- Calcular o salário líquido (SL), deduzindo o desconto total do salário bruto (SB – TD);
//Apresentar os valores dos salários bruto e líquido, além do desconto total: SB, TD e SL.


public class ex06 {
    public static void main(String[] args){
        int ht = 1000;
        int vh = 50;
        int pd = (1000 / 100) * 10;
        int sb = ht * vh;
        int td = (pd / 100) * sb;
        int sl = sb - td;

        System.out.println(sb);
        System.out.println(td);
        System.out.println(sl);
    }
}
