// Questão 5 - Escreva um programa Java console que solicite ao usuário que informe sua idade em anos, 
// meses e dias, ou seja, sua idade atual em anos e a quantidade de 
// meses e dias decorridos desde seu aniversário.

import java.util.Scanner;

public class questao5 {
    public static void main(String [] args) {
        Scanner inputAgeYear = new Scanner(System.in);
        Scanner inputAgeMonth = new Scanner(System.in);
        Scanner inputAgeDay = new Scanner(System.in);

        System.out.print("\nInforme sua idade em anos, meses e dias:\n");

        System.out.print("\nAnos: ");
        int ageYear = inputAgeYear.nextInt();

        System.out.print("\nMeses: ");
        int ageMonth = inputAgeMonth.nextInt();

        System.out.print("\nDias: ");
        int ageDay = inputAgeDay.nextInt();

        int ageTotalDay = (ageYear * 365) + (ageMonth * 30) + ageDay;

        System.out.print("\nIdade expressa em dias: " + ageTotalDay);
    }
}
