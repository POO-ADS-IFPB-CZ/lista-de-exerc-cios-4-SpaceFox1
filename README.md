[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/ybM3WQNb)

1. Determine se cada uma das seguintes afirmações é verdadeira ou falsa. Se uma instrução for falsa, explique por quê.

   -[X] Os construtores de superclasse não são herdados por subclasses.
   -[ ] Um relacionamento tem um é implementado via herança.
   -[ ] Quando uma subclasse redefinir um método de superclasse utilizando a mesma assinatura, diz-se que a subclasse sobrecarrega esse método de superclasse.

2. Alguns programadores preferem não utilizar acesso protected, porque acreditam que ele quebra o encapsulamento da superclasse. Discuta os méritos relativos de usar acesso protected versus acesso private em superclasses.

    O uso do acesso private permite que atributos ou metodos de uma classe sejam "escondidos" de outras classes e subclasses
permitindo isolar esses componentes de serem modificados por meios externos.
   
   Já o uso do acesso protected permite que os atributos ou metodos de uma classe ainda seja "escondidos" mas agora subclasses que herdem da classe principal ainda tem acesso.

   Certos programadores preferem não usar o protected já que pode tornar mudanças confusas já que elas podem ocorrer tanto por comportamentos da classe base quanto por comportamentos da classe herdada.

3. Explique como funciona a chamada de construtores em hierarquias de herança. Por que é obrigatório que o construtor da superclasse seja chamado explicitamente ou implicitamente?

   O construtor da super classe tem que ser explicitamente chamado na classe herdada para que seja explicita a definição dos parametros da classe base.