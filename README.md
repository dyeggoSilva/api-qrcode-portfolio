# ✨ Gerador de QR Code com Java + Spring Boot

Este projeto é uma aplicação simples que permite gerar QR Codes a partir de textos ou URLs, com opção de visualização e download da imagem em formato PNG. Desenvolvido com Java 21 e Spring Boot 3, com suporte a Swagger e Docker.

---

## 🔧 Tecnologias Utilizadas

* Java 21
* Spring Boot 3.x
* Spring Web
* Spring DevTools
* ZXing (para geração de QR Codes)
* Swagger OpenAPI 3 (Springdoc)
* Docker
* HTML + JavaScript

---

## ⚙️ Dependências Maven

```xml
<dependencies>
    <!-- Spring Boot Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- ZXing (QRCode) -->
    <dependency>
        <groupId>com.google.zxing</groupId>
        <artifactId>core</artifactId>
        <version>3.5.3</version>
    </dependency>
    <dependency>
        <groupId>com.google.zxing</groupId>
        <artifactId>javase</artifactId>
        <version>3.5.3</version>
    </dependency>

    <!-- Swagger OpenAPI 3 -->
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.5.0</version>
    </dependency>
</dependencies>
```

---

## 🔐 Como clonar o repositório

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio
```

---

## ⚡ Como rodar o projeto localmente

### Usando Maven:

```bash
./mvnw spring-boot:run
```

### Acesse:

```
http://localhost:8080/index.html  --> Interface web	http://localhost:8080/qrcode?texto=teste  --> API simples
```

---

## 🚀 Como rodar com Docker

### 1. Crie a imagem

```bash
docker build -t gerador-qrcode .
```

### 2. Rode o container

```bash
docker run -p 8080:8080 gerador-qrcode
```

> Certifique-se de que a porta 8080 está liberada

---

## 🌐 Swagger / Documentação da API

Após subir a aplicação:

```
http://localhost:8080/swagger-ui/index.html
```
---

## 🚀 Serviço rodando em Cloud(Render)

```
https://api-qrcode-portfolio.onrender.com
```

---

## 🌐 Swagger / Documentação da API em Cloud(Render)

```
https://api-qrcode-portfolio.onrender.com/swagger-ui/index.html
```
---

## 👀 Funcionalidades

* Gerar QR Code a partir de texto ou URL
* Visualização do QR na página HTML
* Download do QR como arquivo `.png`
* API REST para gerar QR por chamada externa
* Documentação com Swagger

---

## 🚧 Em breve...

* Armazenamento de histórico
* QR Codes com cores personalizadas
* Login e autenticação com JWT

---

## ✌️ Autor

Desenvolvido por **Dyeggo Bezerra** - [dyeggosilva.netlify.app](https://dyeggosilva.netlify.app)

---

> Este projeto é open source e você pode usar e melhorar à vontade!

---

📁 **Licença:** MIT
