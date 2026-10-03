# Atividades do Bootcamp Java - Estruturas de Decisão

Este repositório contém as resoluções dos exercícios práticos focados em estruturas de decisão (`if/else`, `switch`), operadores lógicos e manipulação de variáveis em Java.

---

## 📝 Enunciados dos Exercícios

1. **Categorização por Idade:** Crie uma variável `idade` e mostre a categoria de uma pessoa:
   * Menores de 13 anos: "Criança"
   * De 13 a 17 anos: "Adolescente"
   * De 18 a 59 anos: "Adulto"
   * 60 anos ou mais: "Idoso"

2. **Validação de Compra e Saldo:** Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). 
   * Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. 
   * Se não for, mostre "Saldo insuficiente" e quanto está faltando.

3. **Cardápio com Switch:** Crie uma variável `opcao` com um número de 1 a 4 e, usando `switch`, mostre o pedido escolhido no cardápio:
   * `1`: Café
   * `2`: Cappuccino
   * `3`: Chocolate quente
   * `4`: Chá
   * *Qualquer outro número:* "Opção inválida"

4. **Regras de Autorização para Festa:** Crie variáveis `idade` (17) e `temAutorizacao` (true). 
   * Mostre se a pessoa pode entrar na festa exigindo: **precisa ter 18 anos OU ter autorização**. 
   * Faça o mesmo para a regra onde **precisa ter 18 anos E ter autorização**.

---

## 🏆 Desafio: Média de Notas
Crie variáveis para três notas de uma aluna. Calcule a média e mostre:
* **"Aprovada"** se for 7 ou mais.
* **"Recuperação"** entre 5 e 6.9.
* **"Reprovada"** abaixo de 5.
* Mostre também a média na tela. Valores utilizados: `nota1 = 5.3`, `nota2 = 7.8`, `nota3 = 4.5`.

> **💡 Dica Técnica:** 
> 
> Utilize `double` para o valor das notas. 
> 
> Para controlar as casas decimais, use o `printf` com o marcador `%.2f` onde você quer que apareça a média no seu texto (experimente trocar por `3` para ver o número de casas mudar). 
> 
> O texto e a pontuação vão dentro das aspas, e o `\n` no final pula a linha (ele funciona como um *enter* para que tudo não fique colado):
> 
> ```java
> System.out.printf("Sua média é: %.2f\n", media);
> ```
