package com.company;

import java.util.Scanner;

class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE A LETRA F OU M: ");
        String letra = scanner.nextLine();
        Boolean LetraInformadaMasculinoLetraMaiuscula = letra.equals("M");
        Boolean LetraInformadaFemininoLetraMaiuscula = letra.equals("F");
        Boolean LetraInformadaMasculinoLetraMinuscula = letra.equals("m");
        Boolean LetraInformadaFemininoLetraMinusculo = letra.equals("f");
        if (LetraInformadaMasculinoLetraMaiuscula) {
            System.out.println("A RESPOSTA EM RELACAO A LETRA DIGITADA É MASCULINO!");
        } else if (LetraInformadaMasculinoLetraMinuscula) {
            System.out.println("A RESPOSTA EM RELACAO A LETRA DIGITADA É MASCULINO!");
        } else if (LetraInformadaFemininoLetraMaiuscula) {
            System.out.println("A RESPOSTA EM RELACAO A LETRA DIGITADA É FEMININO!");
        } else if (LetraInformadaFemininoLetraMinusculo) {
            System.out.println("A RESPOSTA EM RELACAO A LETRA DIGITADA É FEMININO!");
        } else {
            System.out.println("Invalido");
        }
        scanner.close();
    }
}
