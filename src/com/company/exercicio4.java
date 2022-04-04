package com.company;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE UM LETRA: ");
        String letra = scanner.nextLine();
        Boolean letraInformadaVogal = letra.equals("A") || letra.equals("a") || letra.equals("E") || letra.equals("e") || letra.equals("I") || letra.equals("i")
                || letra.equals("O") || letra.equals("o") || letra.equals("U") || letra.equals("u");
        if (letraInformadaVogal)
            System.out.println("A LETRA QUE VOCE INFORMOU É UMA VOGAL!");
    }
}
