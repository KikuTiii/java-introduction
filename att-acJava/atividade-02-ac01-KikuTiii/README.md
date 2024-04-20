[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/77_S2_Yb)
# Lista 04 - Revisão métodos

## Exercício 1

Dentro da classe `GerenciadorDeNotas` escreva os seguintes métodos:

- `List<Double> lerNotas()`: 
  - Este método pede ao usuário para inserir o número de notas e, em seguida, lê cada nota do console, adicionando-a à lista de notas.
  - Retorna a lista de notas
  - Caso o usuário informe um valor inválido (menor que 1) para a quantidade de notas, retorne uma lista vazia.

- `Double calcularMedia(List<Double> notas)`: 
  - Calcula a média das notas fornecidas, somando todas elas e dividindo pelo número total de notas.
  - Caso a lista esteja nula ou vazia deve retornar null

- `Boolean verificarResultado(Double media)`: 
  - Retorna se o aluno está aprovado ou reprovado, considerando 7.0 como a nota mínima para aprovação.
  - Retorna null caso o valor da média seja nulo ou negativo

Dentro do método `Main` chame os métodos.

