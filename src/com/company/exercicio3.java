package com.company;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE A LETRA F OU M: ");
        String letra = scanner.nextLine();
        Boolean LetraInformadaMasculinoLetraMaiuscula = letra.equals("M");
        if (LetraInformadaMasculinoLetraMaiuscula)
            System.out.println("A RESPOSTA EM RELACAO A LETRA DIGITADA É MASCOLINO!");
        Boolean LetraInformadaMasculinoLetraMinuscula = letra.equals("m");
        if (LetraInformadaMasculinoLetraMinuscula)
            System.out.println("A RESPOSTA EM RELACAO A LETRA DIGITADA É MASCOLINO!");
        boolean LetraInformadaFemininoLetraMaiuscula = letra.equals("F");
        if (LetraInformadaFemininoLetraMaiuscula)
            System.out.println("A RESPOSTA EM RELACAO A LETRA DIGITADA É FEMININO!");
        boolean LetraInformadaFemininoLetraMinuscula = letra.equals("f");
        if (LetraInformadaFemininoLetraMinuscula)
            System.out.println("A RESPOSTA EM RELACAO A LETRA DIGITADA É FEMININO!");
    }
}
