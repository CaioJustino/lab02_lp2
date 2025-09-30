# Banco 64Bits

Laboratório 2 - Sistema de Gerenciamento de Contas de Banco Digital: projeto de POO (Programação Orientada a Objetos) desenvolvido em Java para a disciplina de Linguagem de Programação II (LP II).<br><br>

## 📋 Funcionalidades

- depositar()
- saque()
- transferir()
- calcularTributos()<br><br>

## 🛠 Tecnologias

- **Java 17+**
- **Eclipse IDE**<br><br>

## 📂 Estrutura Principal do Projeto

```
src/
├── app/
  └── Main.java
└── lab02_lp2/
  ├── Conta.java
  ├── ContaCorrente.java
  ├── ContaPoupanca.java
  ├── ITributavel.java
  └── ServicoDaConta.java
```

<br>

## ▶️ Como executar

1. Clone este repositório ou baixe os arquivos.<br><br>
2. Abra o projeto no **Eclipse IDE**:
   - `File > Import > Existing Projects into Workspace`
   - Selecione a pasta do projeto.<br><br>
3. Execute a classe `Main.java` com `Run As > Java Application`.<br><br>

## 📌 Exemplo de Uso
```
  ____                           __   _  _   ____  _ _       
 | __ )  __ _ _ __   ___ ___    / /_ | || | | __ )(_) |_ ___ 
 |  _ \ / _` | '_ \ / __/ _ \  | '_ \| || |_|  _ \| | __/ __|
 | |_) | (_| | | | | (_| (_) | | (_) |__   _| |_) | | |_\__ \
 |____/ \__,_|_| |_|\___\___/   \___/   |_| |____/|_|\__|___/
                                                             

Bem-vind@ ao Gestor de Contas do Banco Digital!
Digite o número da função que deseja executar:
 1 | Criar Conta
 2 | Realizar Depósito
 3 | Realizar Saque
 4 | Realizar Transferência
 5 | Listar Contas
 6 | Calcular Total de Tributos
 7 | Sair

Insira a sua opção: 1

=== CRIAR CONTA ===

Digite o nome do cliente: Carlos

Digite o tipo da conta que deseja criar:
 1 | Conta Corrente
 2 | Conta Poupança

Insira a sua opção: 1

Conta criada com sucesso!

  ____                           __   _  _   ____  _ _       
 | __ )  __ _ _ __   ___ ___    / /_ | || | | __ )(_) |_ ___ 
 |  _ \ / _` | '_ \ / __/ _ \  | '_ \| || |_|  _ \| | __/ __|
 | |_) | (_| | | | | (_| (_) | | (_) |__   _| |_) | | |_\__ \
 |____/ \__,_|_| |_|\___\___/   \___/   |_| |____/|_|\__|___/
                                                             

Bem-vind@ ao Gestor de Contas do Banco Digital!
Digite o número da função que deseja executar:
 1 | Criar Conta
 2 | Realizar Depósito
 3 | Realizar Saque
 4 | Realizar Transferência
 5 | Listar Contas
 6 | Calcular Total de Tributos
 7 | Sair

Insira a sua opção: 2

=== REALIZAR DEPÓSITO ===

Digite o número da conta: 100

Digite o valor a ser depositado: 100

Depósito de R$ 100,00 realizado com sucesso!

  ____                           __   _  _   ____  _ _       
 | __ )  __ _ _ __   ___ ___    / /_ | || | | __ )(_) |_ ___ 
 |  _ \ / _` | '_ \ / __/ _ \  | '_ \| || |_|  _ \| | __/ __|
 | |_) | (_| | | | | (_| (_) | | (_) |__   _| |_) | | |_\__ \
 |____/ \__,_|_| |_|\___\___/   \___/   |_| |____/|_|\__|___/
                                                             

Bem-vind@ ao Gestor de Contas do Banco Digital!
Digite o número da função que deseja executar:
 1 | Criar Conta
 2 | Realizar Depósito
 3 | Realizar Saque
 4 | Realizar Transferência
 5 | Listar Contas
 6 | Calcular Total de Tributos
 7 | Sair

Insira a sua opção: 5

=== LISTA DE CONTAS ===

N°: 100
Cliente: Carlos
Saldo: R$ 100,00
Tipo de Conta: Corrente
-----------------------
```
<br>

## 👨‍💻 Autor

Projeto desenvolvido para fins de estudo em Java por Caio Justino.
