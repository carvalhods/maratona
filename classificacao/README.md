Resolução do problema "Classificação", da Maratona de Programação da Fatec

**Resumo do problema**

- Criar um programa que irá receber uma lista de times de futebol e suas estatísticas no campeonato - nº de pontos, nº de vitórias, saldo de gols de nº de gols marcados, respectivamente. Ao final, o programa deverá exibir a tabela de classificação dos times. Em caso de empate no número de pontos, o desempate é feito pelo maior número de vitórias, persistindo o empate, o desempate é feito pelo maior saldo de gols, e se ainda houver empate, o desempate é feito pelo maior número de gols marcados. Se após ter aplicado todos esses critérios técnicos de desempate ainda persistir o empate, o desempate é feito por ordem alfabética dos nomes dos times.

**Exemplo de entrada de dados:**
<pre>
4
santos 11 3 6 16
sao-paulo 9 2 0 11
corinthians 4 1 -8 4
flamengo 9 3 2 10
3
avai 6 2 0 7
america-rn 6 2 0 7
america-mg 6 2 0 7
0
</pre>

**Exemplo de saída de dados**
<pre>
1 santos
2 flamengo
3 sao-paulo
4 corinthians

1 america-mg
2 america-rn
3 avai
</pre>
