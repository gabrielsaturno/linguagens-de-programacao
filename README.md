# 🤞🏻**PROJETO LOTOFÁCIL**

Sistema de jogos de loteria em Java.
Menu de seleção de jogos, com 3 opções de jogos e uma opção para sair do sistema.

Requisitos:
- Menu de seleção com esturuta _switch_ e _do-while_.
- Novas apostas são permitidas após um jogo.
- Sistema encerra caso o usuário digite 0 ou caso entre com uma letra no menu de seleção de jogo.
- Aposta de 0 a 100:
    - Usuário digita um número de 0 a 100, caso o número esteja fora desse intervalo será solicitado um novo número. A verificação ocorre através de esturura _if-else_.
    - Número é sorteado pelo sistema utilizando a biblioteca _Random_.
    - Número escolhido pelo usuário é comparado com o número sorteado e exibida mensagem de conclusão do jogo - vitória ou derrota. A comparação ocorre através de esturura _if-else_.
- Aposta de A a Z:
    - Usuário digita uma letra.
    - Caso seja digitado um número é solicitado que digite uma letra. A verificação ocorre através do método _Character.IsLetter_.
    - A letra digitada é convertida para maiúsculo.
    - A letra é comparada com a letra escolhida como premiada no sistema. A comparação ocorre através de esturura _if-else_.
    - Exibida a mensagem de vitória ou derrota.
- Aposta Par ou Ímpar:
    - Usuário digita um número.
    - Verificação se o número é par ou ímpar. A verificação ocorre através de esturura _if-else_.
    - Exibida mensagem de vitória, caso seja par, ou de derrota, caso seja ímpar.

## Bibliotecas utilizadas

- java.io.IOException

- java.util.Scanner

- java.util.Random

- java.lang.Character

## JDK
- Versão 11.0.16.101
