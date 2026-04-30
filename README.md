# Jogo da Velha em Python

Um projeto simples do clássico **Jogo da Velha** (Tic-Tac-Toe) desenvolvido em Java. Este programa permite que dois jogadores humanos joguem alternadamente no console, com validação de jogadas e detecção automática de vitória ou empate.

---

## Funcionalidades

- Tabuleiro 3x3 exibido no console.
- Dois jogadores: `X` e `O`.
- Alternância automática entre os jogadores.
- Validação de jogadas:
    - Não permite posições fora do tabuleiro.
    - Não permite jogar em casas já ocupadas.
- Detecção de vitória:
    - Linhas horizontais.
    - Colunas verticais.
    - Diagonais.
- Detecção de empate quando não há mais movimentos possíveis.
- Tratamento de exceções para jogadas inválidas.

---

## Pré-requisitos

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) instalado.
- Terminal ou IDE compatível com Java (como IntelliJ IDEA, Eclipse ou VS Code).

---

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/lucas-yago/Projeto-jogo-da-velha.git

2. Entre no diretório do projeto:
   ```bash
   cd Projeto-jogo-da-velha
   ```
3. Entre na pasta que contém os arquivos Java:
   ```bash
   cd src/main/java
   ```
4. Compile todos os arquivos `.java`:
   ```bash
   javac *.java
   ```
5. Execute a classe principal:
   ```bash
   java Main
   ```

## Como Jogar

1. O programa exibe o tabuleiro no console.
2. Cada jogador digita a linha e a coluna onde deseja jogar, usando o formato:

```
Jogador X, digite sua jogada:
Linha: 0
Coluna: 1
```

3. O tabuleiro será atualizado após cada jogada.
4. O jogo termina quando:
    - Um jogador completa uma linha, coluna ou diagonal (**vitória**).
    - Não há mais casas disponíveis (**empate**).

---

## Exemplo de Tabuleiro

```
      0     1     2   
   ───────────────────
0  |     |  X  |     |  
   ┼─────┼─────┼─────┼
1  |  O  |  O  |     |  
   ┼─────┼─────┼─────┼
2  |  X  |     |     |  
   ───────────────────
```

---

## Estrutura do Projeto

```
JogoDaVelha.java      # Código-fonte com a lógica do jogo
Main.java             # Classe principal que executa o programa
README.md             # Este arquivo
```

---

Feito com ❤️ em Java.
