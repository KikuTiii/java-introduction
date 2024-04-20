[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/zSVQVArk)
# Lista 3 - Métodos

## Exercício 1

Você foi contratado(a) para criar um software para ajudar o IBGE (Instituto Brasileiro de Geografia e Estatística) a identificar qual a classe social que um determinado entrevistado pertence através da sua renda mensal.

Para exibir corretamente a classe social do indivíduo, utilize a tabela abaixo como referência:

| Classe | N° de salários-mínimos | Renda familiar              | 
|--------|------------------------|-----------------------------|
| A      | Acima de 20 SM         | R$ 20.900,01 ou mais        |
| B      | De 10 a 20 SM          | R$ 10.450,01 a R$ 20.900,00 |
| C      | De 4 a 10 SM           | R$ 4.180,01 a R$ 10.450,00  |
| D      | De 2 a 4 SM            | R$ 2.090,01 a R$ 4.180,00   |
| E      | Até 2 SM               | Até R$ 2.090,00             |

**Obs\* considere o valor do salário-mínimo: R$1.045**

Dentro da classe `Ex1ClasseSocialMetodos` faça o seguinte:

- Crie um método chamado `calcularQtdSalariosMinimos` que **recebe** a renda familiar, calcula e **retorna** a quantidade de salários-mínimos a pessoa ganha aproximadamente.
- Crie outro método chamado `classeSocial` que **recebe** a quantidade de salários-mínimos, identifica e **retorna** qual classe social "Letra" a pessoa pertence.
- No método `main` chame os métodos e exiba as informações ao final da execução, exemplo:

Entrada:
```text
Digite sua renda:  
8500 
```

Saída:
```text
Você recebe aproximadamente 8,1 salários-mínimos.  
Você pertence a classe social: C. 
```

## Exercício 2

Dentro da classe `Ex2CalculoAlunoMetodos` faça:

- Escreva um método chamado `calcularMedia`, que **recebe** duas notas e **retorna** a média das notas, como é calculada a média da Faculdade SPTech((nota1 * 0.4) + (nota2 * 0.6)).
- No método `main`, solicite que o usuário digite 2 notas, chame o método calcularMedia passando as notas digitadas como argumento e exiba o valor retornado pelo método. 

Entrada:
```text
Digite a nota 1:  
8,5

Digite a nota 2:
10
```

Saída:
```text
Média: 9,4
```

## Exercício 3

Dentro da classe `Ex3IdadeMetodos`:

Escreva o método `classificaIdade` (não retorna nada) que recebe uma idade e imprime uma mensagem conforme a faixa etária à qual pertence a idade conforme regra abaixo:

| Faixa Etária      | Mensagem    |
|-------------------|-------------|
| 0 a 2 anos        | Bebê        |
| 3 a 11 anos       | Criança     |
| 12 a 19 anos      | Adolescente |
| 20 a 30 anos      | Jovem       |
| 31 a 60 anos      | Adulto      |
| acima de 60 anos  | Idoso       |

No método `main`, solicite que o usuário digite a idade, chame o método `classificaIdade` para exibir a mensagem correspondente.

Entrada:
```text
Digite a idade:  
25
```

Saída:
```text
Jovem
```

## Exercício 4

Um supermercado criou promoção onde comprando 1 produto o desconto será de 10%, 2 produtos 20% e 3 ou mais produtos 30%.

Para implementar o cálculo da promoção no sistema de caixa, na classe `Ex4DescontoProgressivoMetodos`:  
- Crie um método chamado `calcularDesconto`, que **recebe** o valor e quantidade (nessa ordem), e **retorna** o valor final com desconto.
- Crie um método chamado `exibirNotaFiscal`, que **recebe** o valor, quantidade e valor com desconto (nessa ordem) e exibe no terminal a seguinte saída:

Saída:
```text
------------------------------
Valor do produto: R$20,00
Quantidade: 2
------------------------------
Valor com desconto: R$16,00
```

No método `main` solicite que o usuário digite o valor do produto e a quantidade e exiba a nota fiscal correspondente.

Entrada:
```text
Digite o valor unitário do produto:  
20

Digite a quantidade:
2
```

Saída:
```text
------------------------------
Valor do produto: R$20,00
Quantidade: 2
-----------------------------
Valor com desconto: R$32,00
```

## Exercício 5

Dentro da classe `Ex5CalculoNutricaoMetodos`:

Escreva o método `calculaIMC`, que **recebe** o peso e a altura (nessa ordem) de uma pessoa.

- Este método deverá calcular e exibir o IMC com 2 casas decimais usando interpolação.
- No método `main` solicite que o usuário digite os valores correspondentes e chame o método `calcularIMC` para exibir o resultado.

A fórmula para calcular o IMC é:
> IMC = Peso ÷ (Altura × Altura) 

Entrada:
```text
Digite o peso:  
70

Digite a altura:
1,80
```

Saída:
```text
O IMC é 21,60
```

## Exercício 6

Dentro da classe `Ex6ValidacaoNumericaMetodos`:

Escreva um método chamado `verificarPrimo`, que recebe um número inteiro e exibe se esse número é ou não primo.
> Dica: para saber se o número é primo, veja quantos divisores o número tem, ou seja, verifique se ele é divisível por 1, por 2, por 3, etc. até ele próprio, e conte quantos divisores são. Se o número de divisores for 2, então ele é primo.

No método `main`, solicite que o usuário digite vários valores positivos e chame o método `verificaPrimo` para exibir se o número lido é primo ou não. O programa deve encerrar quando o usuário digitar um valor negativo. 

Exemplo:
```text
Digite um número:  
5

É primo

Digite um número:
4

Não é primo

Digite um número:
-1

Fim da execução
```
