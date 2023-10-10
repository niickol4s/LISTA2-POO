// Questão 3 - Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro.

import java.util.Scanner;

public class questao3 {
    public static void main(String [] args) {
        Scanner inputTimeSpent = new Scanner(System.in);
        Scanner inputSpeed = new Scanner(System.in);

        System.out.print("\nTempo gasto: ");
        double timeSpent = inputTimeSpent.nextDouble();

        System.out.print("\nVelocidade média: ");
        double timeSpeed = inputSpeed.nextDouble();

        double distance = timeSpent * timeSpeed;
        System.out.print("\nDistância =  " + distance);

        double usedLiters = distance / 12;
        System.out.print("\nLitros usados =  " + usedLiters);

    }
}
