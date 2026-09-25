package org.example;

public class idadeDef {
    public static void main(String[] args){
        int idade = 17;

        if (idade < 13){
            System.out.println("Criança");
        }

        else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        }

        else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        }

        else {
            System.out.println("Idoso");
        }
    }
}
