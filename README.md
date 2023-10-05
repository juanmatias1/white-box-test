# Etapa 2

## 1. Identificação de Pontos no Código:
![image](https://github.com/juanmatias1/whiteBox_test/assets/82182479/99cd784c-0eb9-44e3-a0e1-2983f4ab77e9)

## 1.1 Nodos identificados:
1. Início
2. Chamada de Função (conectarBD)
   2.1. Ponto de saída (conn)
3. Atribuição (nome="")
4. Atribuição (result=false)
5. Ponto de entrada (login, senha)
6. Chamada de Função (verificarUsuario)
   6.1. Ponto de saída (result, nome)
7. Fim

## 2. Criação do Grafo de Fluxo:
![image](https://github.com/juanmatias1/whiteBox_test/assets/82182479/571e428c-ce55-4a17-abc2-04081f443b1d)

## 3. Cálculo da Complexidade Ciclomática:

A fórmula para calcular a complexidade ciclomática (V(G)) é:

V(G) = E - N + 2P

E = 20 (número de arestas),
N = 21 (número de nodos),
P = 1 (um único componente conexo).

V(G) = 20 - 21 + 2 x 1 = 20

A complexidade ciclomática para o código é V(G) = 20.

## 4. Identificação de Caminhos:

O caminho possível no grafo de fluxo pode ser identificado da seguinte forma:

P1:1→2→3→4→5→6→7→8→9→10→11→12→13→14→15→16→17→18→19→20→21
