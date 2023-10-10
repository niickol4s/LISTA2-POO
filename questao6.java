// Questão 6 - Escreva um programa Java console que receberá a duração de um evento 
// expresso em segundos e exiba-o expresso em horas, minutos e segundos.

import java.util.Scanner;

public class questao6 {
    public static void main(String [] args) {
        Scanner inputDuration = new Scanner(System.in);

        System.out.print("\nInforme a duração do evento em segundos: ");
        int duration = inputDuration.nextInt();

        int hour = duration / 3600;
        int minutes = (duration % 3600) / 60;
        int remainingSecond = duration % 60;

        System.out.print("\nDuração do evento: " + hour + ":" + minutes + ":" + remainingSecond);
    }
}
