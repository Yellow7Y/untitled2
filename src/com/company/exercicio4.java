package com.company;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE UM LETRA: ");
        String letraDigitada = scanner.nextLine();
        Boolean letraInformadaVogal = letraDigitada.equals("A") || letraDigitada.equals("a") || letraDigitada.equals("E") || letraDigitada.equals("e") || letraDigitada.equals("I") ||
                letraDigitada.equals("i") || letraDigitada.equals("O") || letraDigitada.equals("o") || letraDigitada.equals("U") || letraDigitada.equals("u");
        if (letraInformadaVogal)
            System.out.println("A LETRA QUE VOCE INFORMOU É UMA VOGAL!");
        else
            System.out.println("A LETRA QUE VOCE INFORMOU É UMA CONSOANTE!");
    }
}
