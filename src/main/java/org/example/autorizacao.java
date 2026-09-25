package org.example;

public class autorizacao {
    public static void main(String[] args) {

        int idade = 17;
        boolean temAutorizacao = true;


        if (idade >= 18 || temAutorizacao) {
            System.out.println("Tem autorização: Pode entrar na festa!");
        } else {
            System.out.println("Não tem autorização: Não pode entrar na festa!");
        }

        System.out.println();

        if (idade >= 18 && temAutorizacao) {
            System.out.println("Tem autorização: Pode entrar na festa!");
        } else {
            System.out.println("Não tem autorização: Não pode entrar na festa!");
        }
    }
}
