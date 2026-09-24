# Observer - Telephone

## Objetivo

O objetivo deste projeto é aplicar o padrão de projeto **Observer** em um telefone simulado para uma demonstração acadêmica.

O telefone atua como o sujeito (**Subject**), avisando automaticamente todos os observadores (**Observers**) cadastrados sempre que um novo dígito é inserido no teclado. Dessa forma, a lógica do telefone fica totalmente desacoplada da interface de exibição.

## Funcionamento

O fluxo de execução do sistema acontece nas seguintes etapas:

1. O usuário insere um dígito (simulado pela classe `KeyPad`).
2. O telefone (`PhoneModel`) atualiza seu estado interno armazenando o novo dígito.
3. O telefone avisa todos os observadores cadastrados chamando seu método de atualização.
4. Cada observador executa sua ação de forma independente.

## Estrutura

- **Observer (`PhoneObserver`):** Interface que define quem recebe as notificações do telefone.
- **Telephone (`PhoneModel`):** Subject que armazena os dígitos, mantém a lista de observadores cadastrados e envia notificações sempre que um novo dígito for inserido.
- **Screen (`Screen`):** Classe responsável pela interface e pela criação dos dois observadores:
  - **Observador 1:** Mostra apenas o último dígito inserido (ex.: `8`).
  - **Observador 2:** Mostra o número atual do telefone (ex.: `Agora discando 081999887766...`).
- **KeyPad (`KeyPad`):** Simula a entrada de dígitos como se o usuário estivesse pressionando o teclado do telefone.
- **Main (`Main`):** Ponto de entrada do programa, responsável por inicializar as classes e iniciar a simulação.

## Como executar

No terminal, dentro da pasta do projeto, execute os comandos:

```bash
javac *.java
java Main
```
