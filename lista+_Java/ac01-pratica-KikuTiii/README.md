[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/zS9rdf8o)
# Avaliação Continuada 01 - Prática

Esta avaliação visa aprimorar suas habilidades em programação com a linguagem Java, focando em métodos úteis para a gestão de uma livraria. Você trabalhará dentro da classe GestaoLivro, implementando métodos essenciais para operações do dia a dia. Preste atenção aos detalhes de cada método e como eles podem ser aplicados no contexto de uma livraria.

### Importante: utilize extamente os mesmos nomes e tipos indicados no enunciado, os nomes de métodos e variáveis serão considerados na avaliação e composição da nota 
- Dica: copie e cole os nomes do enunciado para evitar erros de digitação

##
Na classe chamada ```GestaoLoja```, crie os métodos a seguir, considerando suas especificações:

```Double calcularTroco(Double totalCompra, Double valorEntregue)```:
- Este método calcula o troco a ser devolvido ao cliente. Ele recebe o valor total da compra e o valor entregue pelo cliente. O retorno deve ser o valor do troco a ser devolvido.

```Double calcularVendas(List<Double> vendas)```:
- Recebe uma lista com os valores de cada venda realizada pela livraria. O método deve retornar o valor total obtido com as vendas.

```Double buscarMenorVenda(List<Double> vendas)```:
- Este método analisa uma lista com os valores de vendas realizadas e retorna o menor valor encontrado.

```Boolean verificarFuncionario(List<String> funcionarios, String nomeFuncionario)```:
- Recebe uma lista contendo os nomes dos funcionários da livraria e um nome a ser pesquisado. Retorna true se o funcionário com o nome especificado existe na lista.
- A comparação de nomes deve ser feita de maneira sensível a maiúsculas e minúsculas (case sensitive).

Crie uma classe chamada ```TesteLivraria```, para simular o funcionamento de uma livraria, chamando os métodos implementados na classe GestaoLivro para realizar operações como calcular o troco, totalizar vendas, identificar a menor venda e verificar a existência de funcionários.
- Utilize os resultados desses métodos para exibir mensagens relevantes que reflitam as atividades cotidianas da livraria, facilitando a gestão e melhorando a experiência do cliente.
