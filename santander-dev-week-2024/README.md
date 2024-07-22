# Santander Dev Week 2024

[Spring Initializr Config](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=3.3.2&packaging=jar&jvmVersion=22&groupId=me.dio&artifactId=santander-dev-week-2024&name=santander-dev-week-2024&description=Java%20RESTFUL%20API&packageName=me.dio&dependencies=web,data-jpa,h2,postgresql)


----

# DIO Docs

## Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway

O Git é um conceito essencial no mercado de trabalho atualmente, por isso sempre reforçamos sua importância em nossa metodologia educacional. Por isso, todo código-fonte desenvolvido durante este conteúdo foi versionado usando :

- [github.com/falvojr/santander-dev-week-2023](https://github.com/falvojr/santander-dev-week-2023): Repositório com todo o código-fonte desenvolvido neste 
  Desafio de 
Projeto (Lab);

- [github.com/digitalinnovationone/santander-dev-week-2023-api](https://github.com/digitalinnovationone/santander-dev-week-2023-api): Aqui você tem acesso a uma versão mais robusta 
desta mesma API, com melhorias e padrões adicionais implementados. Se quiser se desafiar e buscar uma referência mais completa, este é o caminho!

### Configuração

```yml
spring:
  datasource:
    url: jdbc:h2:mem:sdw2024
    username: sdw2024
    password:
  jpa:
    show-sql: true
    open-in-view: false
    hibernate:
      ddl-auto: create # validate | update | create | create-drop
    properties:
      hibernate:
        format_sql: true
  h2:
    console:
      enabled: true
      path: /h2-console
      settings:
        trace: false
        web-allow-others: false
```

- link h2 console: http://localhost:8080/h2-console
