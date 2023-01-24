## NOTAS

O uso do operador `==` é utilizado para compara _Referências_, para comparar o valor é necessário utilizar o método `equals()`.

**Classes WRAPPERS:**
- para cada primitivo existe uma classe chamada _Wrapper_
- para guardar um primitivo numa coleção é preciso criar um objeto que embrulha o valor
- a criação do objeto Wrapper é chamada de autoboxing
- a retirada do valor primitivo do objeto Wrapper é chamada de _unboxing_
- _autoboxing_ e _unboxing_ acontecem automaticamente.
- as classes wrapper possuem vários métodos auxiliares, por exemplo para o parsing
- todas as classes wrappers que representam um valor numérico possuem a classe `java.lang.Number` como mãe
- 
**Ordenação de listas:**
- para ordenar uma lista é preciso definir um critério de ordenação
- há duas formas de definir esse critério
  - pela interface `Comparator`
  - pela interface `Comparable` (_ordem natural_)
- o algoritmo de ordenação já foi implementado
  - na lista no método `sort`
  - na classe `Collections` pelo método `sort`
- a classe `Collections` é uma fachada com vários métodos auxiliares para trabalhar com as coleções, principalmente listas
