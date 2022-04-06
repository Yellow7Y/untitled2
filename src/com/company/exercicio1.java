package com.company;

import java.util.Scanner;

class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        float primeiroNumeroDigitado = scanner.nextFloat();
        System.out.print("Informe o segundo número: ");
        float segundoNumeroDigitado = scanner.nextFloat();
        Boolean primeiroNumeroMaior = primeiroNumeroDigitado > segundoNumeroDigitado;
        if (primeiroNumeroMaior)
            System.out.println ("O valor maior é: " + primeiroNumeroDigitado);
        else
                System.out.println ("O valor maior é: " + segundoNumeroDigitado);
        scanner.close();
    }
}
