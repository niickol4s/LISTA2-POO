// Questão 9 - Escreva um programa Java console que leia um número de 3 dígitos e o inverta, 
// escrevendo o número lido e o invertido.


import java.util.Scanner;

public class questao9 {
    public static void main(String [] args) {
        Scanner inputNumber = new Scanner(System.in);

        int minNumber = 100;
        int maxNumber = 999;

        System.out.print("\nInforme um valor inteiro de três dígitos: ");
        int number = inputNumber.nextInt();

        if(number >= minNumber && number <= maxNumber) {
            int firstDigit = number / 100;
            int secondDigit = (number % 100) / 10;
            int thirdDigit = number % 10;

            int invertedNumber = thirdDigit * 100 + secondDigit * 10 + firstDigit;

            System.out.print("\nO valor original é: " + number);
            System.out.print("\nO valor invertido é: " + invertedNumber);

        } else {
            System.out.print("\nInforme um valor inteiro de três dígitos: ");
            number = inputNumber.nextInt();
        }
    }
}
