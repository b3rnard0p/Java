# 🛠️ Sistema de Controle de Itens para Universidades e Escolas com **Java Swing**

## 📌 Sobre o Projeto
Este projeto é um sistema desktop de gerenciamento de itens para instituições de ensino, como universidades e escolas. Ele permite o controle de empréstimos e devoluções de itens essenciais, tais como ar-condicionado, chaves de sala e canetões. O sistema possui uma interface gráfica amigável feita com Java Swing e realiza operações em um banco de dados MySQL.

---

## 🚀 Tecnologias Utilizadas
- Java 22
- Java Swing
- MySQL
- JDBC (MySQL Connector)
- Apache Ant (opcional)

---

## 📂 Estrutura do Projeto

```bash
SistemaControleItens/
│── src/
│   ├── DAO/
│   │   ├── EmprestimoDAO.java
│   │   ├── HistoricoDAO.java
│   │   ├── ItemDAO.java
│   │   └── UsuarioDAO.java
│   ├── beans/
│   │   ├── Emprestimo.java
│   │   ├── Historico.java
│   │   ├── Item.java
│   │   ├── Usuario.java
│   │   └── View_HistoricoEmprestimo.java
│   ├── conexao/
│   │   └── Conexao.java
│   └── interfaces/
│       ├── CadastroItens.java
│       ├── CadastroUsuarios.java
│       ├── ConsultaHistorico.java
│       ├── MenuPrincipal.java
│       ├── Registro.java
│       ├── RelatorioDevolucoes.java
│       └── RelatorioEmprestados.java
│── build.xml
│── manifest.mf
│── mysql-connector-j-8.1.0.jar
```
---

## 🔧 Configuração e Instalação

**1️⃣ Baixar o conector**  
- Entre no projeto e instale o connector

**2️⃣ Configurar o MySQL Connector**
- Na sua IDE (ex: NetBeans):
- Clique com o botão direito em Libraries.
- Selecione Add JAR/Folder e adicione o mysql-connector-j-8.1.0.jar.

**3️⃣ Configurar o Banco de Dados**
- Crie um banco de dados no MySQL com as tabelas necessárias, como Emprestimos, Usuarios, Itens e Historico.
- No arquivo src/conexao/Conexao.java, configure as credenciais de acesso ao banco de dados.

**4️⃣ Compilar e Executar**
- Você pode executar o projeto diretamente pela sua IDE ou utilizar o build.xml com o Ant.

---

## 📌 Funcionalidades

- Cadastro de itens
- Cadastro de usuários
- Controle de empréstimos e devoluções de itens
- Consulta de histórico de empréstimos e devoluções
- Relatórios de itens emprestados e devolvidos
- Sistema de login e registro de usuários

---

## 📊 Melhorias Futuras

- Autenticação com níveis de acesso (admin/professor/aluno)
- Exportação de relatórios em PDF ou CSV
- Integração com APIs externas (ex: envio de notificações por e-mail)

---

🚀 Desenvolvido por b3nard0p
