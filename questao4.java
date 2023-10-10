// Questão 4 - Faça um programa que:
// - Leia a cotação do dólar
//  - Leia um valor em dólares
//  - Converta esse valor para Real
//  - Mostre o resultado

import java.util.Scanner;

public class questao4 {
    public static void main(String [] args) {
        Scanner inputCotacaoAtual = new Scanner(System.in);
        Scanner inputValorDolar = new Scanner(System.in);

        System.out.print("\nCotação atual do Dólar: ");
        double cotacaoAtual = inputCotacaoAtual.nextDouble();

        System.out.print("\nValor do Dólar: ");
        double valorDolar = inputValorDolar.nextDouble();

        double valorReal = valorDolar * cotacaoAtual;

        System.out.print("\nValor em Real: " + valorReal);

    }
}