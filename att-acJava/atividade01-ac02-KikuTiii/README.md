[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/29qd5rp4)
# Lista 6 - POO e Encapsulamento 📎

## Orientações Gerais: 🚨
1. Utilize **apenas** tipos **wrapper** para criar atributos e métodos.
2. **Respeite** os nomes de atributos e métodos definidos no exercício.
3. Tome **cuidado** com os **argumentos** especificados no exercício.
   **Não** adicione argumentos não solicitados e mantenha a ordem definida no enunciado.
4. Verifique se **não** há **erros de compilação** no projeto antes de enviar.
5. As classes devem seguir as regras de encapsulamento.

## Exercício 1 - Recursos Humanos 🚩

Crie um programa para gerenciar a promoção e reajuste dos funcionários de uma empresa.  

A classe `Colaborador` precisar conter os seguintes atributos e métodos:

**Atributos:**
* nome (Texto)
* cargo (Texto)
* salario (Número Real)

**Métodos:**
* getters e setters

A classe `RecursosHumanos` precisa conter os seguintes atributos e métodos:

**Atributos:**
* totalPromovidos (Número Inteiro)
* totalReajustados (Número Inteiro)

**Métodos:**

* reajustarSalario:
  * **recebe** o colaborador que terá o salário reajustado (Objeto Colaborador)
  * **recebe** o percentual de reajuste (Número Real Ex: 15.0, 20.0)
  * altera o atributo **salario** do colaborador com o novo salário reajustado
  * atualiza o atributo **totalReajustados**

* promover:
  * **recebe** o colaborador que será promovido (Objeto Colaborador)
  * **recebe** o novo cargo do colaborador
  * **recebe** o valor do novo salário
  * altera o cargo do colaborador para o novo valor
  * altera o salário do colaborador para o novo valor
  * **a promoção não deve acontecer** caso o valor do novo salário seja menor que o salário anterior
  * atualiza o atributo **totalPromovidos**


* getters

Utilize o método `main` na classe `TesteRecursosHumanos` para realizar os testes necessários.

## Exercício 2 - Pokémon 🚩

Crie um programa que simula um treinador Pokémon que pode treinar vários Pokémon.

A classe `Pokemon` precisar conter os seguintes atributos e métodos:

**Atributos:**
* nome (Texto)
* tipo (Texto)
* forca (Número Real)
* doces (Número Inteiro)

**Métodos:**
* getters e setters

A classe `TreinadorPokemon` precisa conter os seguintes métodos:

**Atributos:**
* nome (Texto)
* nivel (Número Real) - Representa a experiência/nível do treinador 

**Métodos:**
* treinarPokemon
  * **recebe** um pokémon
  * aumenta a força do pokémon em 10%
  * aumenta a quantidade de doces do pokémon em 10


* evoluirPokemon
  * **recebe** um pokémon
  * **recebe** o nome da evolução desse pokémon
  * Caso a quantidade de doces do pokemon seja superior ou igual a 50, você deverá
    trocar o nome atual do pokemon pelo nome passado no método, diminuir em 50 a quantidade de doces do pokemon, aumentar a
    experiência do treinador em 10.
  * Caso a quantidade de doces seja inferior, não realize a operação e exiba a frase: “Não foi possível
    realizar operação”.


* getters e setters

Utilize o método `main` na classe `TesteTreinadorPokemon` para realizar os testes necessários.