Explorando Padrões de Projeto com Java e Spring Boot
Projeto desenvolvido como parte do Bootcamp Claro - Java com Spring Boot na plataforma da DIO. O objetivo principal é demonstrar a implementação prática de padrões de projeto clássicos em um ecossistema Spring.

⚙️ Tecnologias Utilizadas
Java 17

Spring Boot 3.x

Spring Data JPA

Spring Cloud OpenFeign (Integração com API ViaCEP)

H2 Database (Banco de dados em memória)

SpringDoc OpenAPI (Swagger) (Documentação e testes da API)

🧩 Padrões de Projeto Implementados
Nesta solução, exploramos a tríade de padrões que o Spring Framework incentiva:

Singleton: O Spring gerencia todas as instâncias dos beans (@Service, @Repository, @RestController) como Singleton por padrão, otimizando o uso de memória.

Strategy: Implementado através da interface ClienteService, permitindo múltiplas implementações de lógica de negócio que podem ser trocadas sem afetar o cliente.

Facade: A classe ClienteServiceImpl atua como uma fachada, abstraindo a complexidade de duas sub-rotinas: a consulta de endereço via CEP (API externa) e a persistência de dados no banco local.
