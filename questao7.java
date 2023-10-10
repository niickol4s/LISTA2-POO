
// Questão 7 - Escreva um programa Java console que lê um valor inteiro e simule o comportamento 
// de um caixa eletrônico, ou seja, calcule qual o menor número possível de notas de 
// 100, 50, 10, 5 e 1 em que o valor a ser sacado pode ser decomposto.

import java.util.Scanner;

public class questao7 {
    public static void main(String [] args) {
        Scanner inputDraftBank = new Scanner(System.in);

        System.out.print("\nInforme o valor do saque (valor inteiro): ");
        int draftBank = inputDraftBank.nextInt();

        int ballot100 = draftBank / 100;
        draftBank %= 100;

        int ballot50 = draftBank / 50;
        draftBank %= 50;

        int ballot10 = draftBank / 10;
        draftBank %= 10;

        int ballot5 = draftBank / 5;

        int ballot1 = draftBank % 5;

        System.out.print("\nO valor do saque pode ser expresso em:\n");
        System.out.print(ballot100 + " cédulas de 100\n");
        System.out.print(ballot50 + " cédulas de 50\n");
        System.out.print(ballot10 + " cédulas de 10\n");
        System.out.print(ballot5 + " cédulas de 5\n");
        System.out.print(ballot1 + " cédulas de 1\n");

    }
}
