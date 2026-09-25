package org.example;

public class saldoConta {
    public static void main(String[] args){

    // Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00).
    // Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante.
    // Se não for, mostre "Saldo insuficiente" e quanto está faltando.

        double saldoConta = 500;
        double valorCompra = 320;

        if (valorCompra <= saldoConta){
            System.out.println("Compra aprovada!" + "Saldo restante: R$ " + (saldoConta - valorCompra));
        }

        else {
            System.out.println("Compra insuficiente!" + "Saldo restante: R$ " + (valorCompra - saldoConta));
        }
    }
}
