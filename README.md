# Sistema de Gestão Financeira Pessoal ☕📊

Este é um sistema de console para controle e monitoramento de finanças pessoais desenvolvido em **Java**. O projeto foi escrito do zero com o objetivo de consolidar conceitos de Programação Orientada a Objetos (POO) e manipulação de fluxos de dados, servindo como base para evolução contínua no ecossistema Java.

## 🚀 Funcionalidades Atuais do Código
* **Entrada de Dados Dinâmica:** Utiliza a classe `Scanner` para capturar o salário do usuário e o limite máximo de despesas desejado direto pelo terminal.
* **Instanciação de Objetos de Domínio:** Organiza despesas individuais (como Cartão de Crédito, Aluguel e Lazer) mapeando atributos como `descricao` e `valor` através de instâncias de uma classe dedicada (`Gasto`).
* **Cálculo de Fluxo de Caixa:** Realiza a soma automatizada do total de despesas e processa o saldo líquido restante a partir do salário informado.
* **Alerta Crítico de Limite:** Avalia o teto financeiro estipulado e dispara um aviso caso o usuário atinja ou ultrapasse o limite de gastos, ou calcula a margem segura que ainda resta para consumo.

## 📈 Conceitos de Java Aplicados
* **Organização em Pacotes (Packages):** Separação de responsabilidades estruturando o código entre classes de execução (`Test`) e classes de modelo/domínio (`Gasto`).
* **Instanciação e Manipulação de Objetos:** Uso do operador `new` para criar instâncias distintas que herdam o comportamento da classe principal.
* **Tipos Primitivos e Operadores Aritméticos:** Uso do tipo `double` para manipulação de valores de ponto flutuante (monetários) precisos.
* **Estruturas Condicionais:** Lógica de decisão baseada em blocos `if / else` para controle de fluxo e regras de negócio.

## 🛠️ Tecnologias e Ferramentas
* **Linguagem Principal:** Java 21 (LTS)
* **IDE utilizada:** IntelliJ IDEA
* **Gerenciamento de Entrada:** `java.util.Scanner`
* **Versionamento:** Git e GitHub
