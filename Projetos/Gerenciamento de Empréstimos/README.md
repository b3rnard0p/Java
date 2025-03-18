# Sistema de Controle de Itens para Universidades e Escolas

Este projeto é um sistema de gerenciamento de itens para instituições de ensino, como universidades e escolas. Ele permite o controle de empréstimos de itens essenciais, tais como ar-condicionado, chaves de sala e canetões.

## 🛠️ Funcionalidades

- Cadastro de itens
- Cadastro de usuários
- Controle de empréstimos e devoluções de itens
- Consulta de histórico de empréstimos e devoluções
- Relatórios de itens emprestados e devolvidos
- Sistema de login e registro de usuários

## 🧰 Tecnologias Utilizadas

- Java 22
- Java Swing (para interface gráfica)
- MySQL (banco de dados)
- JDBC (MySQL Connector)

## 📁 Estrutura do Projeto

Projeto/ ├── src/ │ ├── DAO/ │ │ ├── EmprestimoDAO.java │ │ ├── HistoricoDAO.java │ │ ├── ItemDAO.java │ │ └── UsuarioDAO.java │ ├── beans/ │ │ ├── Emprestimo.java │ │ ├── Historico.java │ │ ├── Item.java │ │ ├── Usuario.java │ │ └── View_HistoricoEmprestimo.java │ ├── conexao/ │ │ └── Conexao.java │ └── interfaces/ │ ├── CadastroItens.java │ ├── CadastroUsuarios.java │ ├── ConsultaHistorico.java │ ├── MenuPrincipal.java │ ├── Registro.java │ ├── RelatorioDevolucoes.java │ └── RelatorioEmprestados.java ├── build.xml ├── manifest.mf └── mysql-connector-j-8.1.0.jar


## ⚙️ Pré-requisitos

- JDK 22 instalado
- MySQL Server configurado e em execução
- Ant (caso deseje compilar via build.xml)
- MySQL Connector/J (já incluso no projeto)

## 🚀 Configuração e Instalação

### 1️⃣ Criar o Projeto

- Abra o NetBeans ou sua IDE de preferência.
- Selecione **"Java with Ant"** e depois **"Java Application"**.

### 2️⃣ Adicionar o MySQL Connector

- O arquivo `mysql-connector-j-8.1.0.jar` já está incluso na pasta do projeto.
- Na IDE, clique com o botão direito em **Libraries**.
- Selecione **"Add JAR/Folder"** e adicione o `mysql-connector-j-8.1.0.jar`.

### 3️⃣ Configurar Banco de Dados

- Crie um banco de dados no MySQL com as tabelas necessárias (Emprestimos, Usuarios, Itens, Historico, etc.).
- Edite o arquivo `Conexao.java` com as credenciais corretas

4️⃣ Compilar e Executar
Compile e execute o projeto diretamente pela IDE ou utilizando o build.xml com o Ant.
📊 Melhorias Futuras
Autenticação com níveis de acesso (admin/professor/aluno)
Exportação de relatórios em PDF ou CSV
Integração com APIs externas (ex: envio de notificações por e-mail)
Melhorias na interface gráfica com padrões modernos
👤 Autor
Desenvolvido por b3nard0p

















