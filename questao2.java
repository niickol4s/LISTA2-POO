// Questão 2 - Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
// A fórmula de conversão de temperatura a ser utilizada é F = (9 * C + 160) / 5, 
// em que a variável F representa é a temperatura em graus Fahrenheit e a variável C 
// representa a temperatura em graus Celsius.

import java.util.Scanner;

public class questao2 {
    public static void main(String [] args) {
        Scanner inputCelsius = new Scanner(System.in);

        System.out.print("\nTemperatura (Celsius): ");
        double tempCelsius = inputCelsius.nextDouble();

        double tempFahren = (9 * tempCelsius + 160) / 5;

        System.out.print("\nTemperaturas: ");
        System.out.print("\nCelsius = " + tempCelsius);
        System.out.print("\nFahrenheit = " + tempFahren);
    }
} 
