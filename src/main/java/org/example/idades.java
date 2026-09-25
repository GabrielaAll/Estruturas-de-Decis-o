package org.example;

import java.util.Scanner; // importa o scanner

public class idades {
    public static void main(String[] args){
        // Crie uma variável idade e mostre a categoria de uma pessoa:
        // menos de 13 anos é "Criança", de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade < 13){
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 17){
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59){
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        scanner.close();
    }
}
