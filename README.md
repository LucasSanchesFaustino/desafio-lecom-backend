# desafio-lecom-backend
Projeto de uma loja fictícia(ShopAll), modelada em 3 microsserviços(Loja, Catalogo e Transportadora).

# Requisitos do Projeto
Qualquer banco de dados SQL(Recomendo o [MariaDB](https://mariadb.org/download/?t=mariadb&p=mariadb&r=10.6.5&os=windows&cpu=x86_64&pkg=msi&m=fder))
Qualquer IDE compatível com Maven(recomendo Eclipse ou IntelliJ)

# Descrição

Para o backend foram utilizados as seguintes tecnologias: Stack Spring Boot/Cloud, Eureka-Server e Feign-Client.

Já a parte front-end foi toda feita em HTML com o uso do Framework Bootstrap, com algumas funcionalidades implementadas com ajuda do template engine Thymeleaf.

# Banco de dados

As tabelas do banco de dados do projeto são automaticamente geradas e populadas atráves da ferramenta Flyway.
Apenas troque a url e as informações do banco de dados no application.yml dos microsserviços.
