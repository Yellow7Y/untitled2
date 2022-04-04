package com.company;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        float primeiroNumero = scanner.nextFloat();
        System.out.print("Informe o segundo número: ");
        float segundoNumero = scanner.nextFloat();
        Boolean primeiroNumeroMaior = (primeiroNumero > segundoNumero);
                if (primeiroNumeroMaior)
                System.out.println ("O valor maior é: " + primeiroNumero);
        Boolean segundoNumeroMaior = (segundoNumero > primeiroNumero);
                if (segundoNumeroMaior)
                System.out.println ("O valor maior é: " + segundoNumero);
    }
}
