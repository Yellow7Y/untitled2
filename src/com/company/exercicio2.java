package com.company;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Infore qualquer número: ");
        float numero = scanner.nextFloat();
        Boolean numeroInformadoPositivo = (numero >= 0);
        if (numeroInformadoPositivo)
            System.out.println("O valor digitado seu " + numero + " é positivo!");
        Boolean numeroInformadoNegativo = (0 > numero);
        if (numeroInformadoNegativo)
            System.out.println("O valor digitado seu " + numero + " é negativo!");
    }
}
