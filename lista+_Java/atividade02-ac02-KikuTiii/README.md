[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/btlog7WE)
# Exercício Relacionamento 📎

## Orientações Gerais: 🚨
1. Utilize **apenas** tipos **wrapper** para criar atributos e métodos.
2. **Respeite** os nomes de atributos e métodos definidos no exercício.
3. Tome **cuidado** com os **argumentos** especificados no exercício.
   **Não** adicione argumentos não solicitados e mantenha a ordem definida no enunciado.
4. Verifique se **não** há **erros de compilação** no projeto antes de enviar.
5. As classes devem seguir as regras de encapsulamento.
6. Deixe um **construtor vazio** para utilização nos testes unitários.

## Carrinho 

Implemente o seguinte diagrama de classes:

![66b5bd47-3052-4c75-af00-167c4da79c88](https://github.com/linguagem-de-programacao-ads/exercicio-relacionamento/assets/37668247/fcf45397-6f79-43fd-9802-05cf932fd17e)


Métodos da classe `Produto`:

* getters e setters

Métodos da classe `Carrinho`

* getQuantidade
  * **retorna** a quantidade de `Produtos` incluídos no `Carrinho`


* adicionar
  * adiciona o produto recebido na lista de produtos


* existsPorNome
  * **retorna** se um produto existe dentro do `Carrinho` pelo nome
  * deve ignorar letras maiúsculas e minúsculas (Case Insensitive)


* getQuantidadePorCategoria
  * **retorna** a quantidade produtos de uma determinada categoria


* limpar
  * esvazia o carrinho


* removerPorNome
  * remove um produto de dentro do carrinho a partir do nome
  * deve ignorar letras maiúsculas e minúsculas (Case Insensitive)


* getPorNome
  * **retorna** o produto do carrinho a partir do nome
  * caso o produto não seja encontrado retorne null
  * deve ignorar letras maiúsculas e minúsculas (Case Insensitive)


* getValorTotal
  * **retorna** a soma dos preços de todos os produtos
