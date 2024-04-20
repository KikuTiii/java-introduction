[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/3-SFiBsF)
# Atividade 1 - Continuada 1

## Exercício 1 - Calculadora Média

Dentro da classe `Ex1CalculadoraMedia` faça o seguinte:

- Solicite que o usuário digite duas notas, calcule a média das
  notas, como é calculada a média da SPTech (nota1 * 0.4 + nota2 * 0.6).
- Exiba uma frase com o resultado, formatando com interpolação com uma casa decimal

Entrada:
```text
Digite a primeira nota:
8,5

Digite a segunda nota:
10
```

Saída:
```
Média: 9,4
```

## Exercício 2 - Tabuada

Na classe `Ex2Tabuada` faça o seguinte:

- Exiba um menu onde o usuário pode escolher uma operação matemática.
- Pergunte ao usuário com qual número ele deseja realizar a operação.
- Exiba uma tabuada de 1 a 10 de acordo com a operação matemática escolhida e o número
digitado.

Exemplo: supondo que o usuário escolha soma (opção 1), e o número digitado seja 5:

Entrada:
```text
1 - Soma
2 - Multiplicação
3 - Divisão
4 - Subtração
5 - Potenciação
6 - Resto da divisão

Digite o número correspondente a operação desejada:
1

Digite um número inteiro:
5
```

Saída:

```text
5 + 1 = 6
5 + 2 = 7
5 + 3 = 8
5 + 4 = 9
5 + 5 = 10
5 + 6 = 11
5 + 7 = 12
5 + 8 = 13
5 + 9 = 14
5 + 10 = 15
```

## Exercício 3 - Lista de frutas

Utilizando a classe `Ex3ListaFrutas`:

- Contenha uma lista para armazenar nomes de frutas
- Peça para o usuário digitar o nome de várias frutas até que ele digite 0 para sair.
- Em seguida peça ao usuário para digitar o nome da fruta e pesquise se a fruta digitada existe na
lista, essa busca não diferencia maiúsculas e minúsculas.
- Se achar, exiba o texto “A fruta X existe na lista”, caso a fruta
pesquisada não exista, exiba “Não existe a fruta X na lista.”

Entrada:
```text
Digite o nome da fruta 1:
Abacaxi

Digite o nome da fruta 2:
Laranja

Digite o nome da fruta 3:
0

Digite um nome para pesquisar:
Goiaba
```

Saída:
```text
Não existe a fruta Goiaba na lista
```

## Exercício 4 - Desafio Números

Dentro da classe `Ex4DesafioNumeros`:

- Solicite ao usuário que digite números inteiros e os adicione em uma lista. Somente
pare de perguntar um novo número quando o usuário digitar 0.
- Exiba somente os pares da lista.
- Exiba somente os ímpares da lista.
- Exiba a soma de todos os números da lista.
- Exiba somente o menor número da lista.
- Exiba somente o maior número da lista.

Entrada:
```text
Digite 1° Número:
2

Digite 2° Número:
4

Digite 3° Número:
7

Digite 4° Número:
0
```

Saída:
```text
Pares: 2, 4
Ímpares: 7
Soma: 13
Menor número: 2
Maior número: 7
```