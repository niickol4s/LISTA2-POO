// Questão 1 - Elabore um programa que leia um número (1 a 9) e imprima a tabuada desse número.

import java.util.Scanner;

public class questao1 {
    public static void main(String [] args) {
        Scanner inputOption = new Scanner(System.in);
        Scanner inputValue = new Scanner(System.in);

        while(true) {

            System.out.print("\nEscolha uma opção:");
            System.out.print("\n1 - Gerar tabuada;");
            System.out.print("\n0 - Encerrar.");

            System.out.print("\nOpção: ");
            int option = inputOption.nextInt();

            switch (option) {
                case 1:
                    System.out.print("\nValor (1 à 9): ");
                    int value = inputValue.nextInt();

                    if(value <= 0 || value > 9) {
                        System.out.print("\nValor inválido.");
                        System.out.print("\nValor (1 à 9): ");
                        // value = inputValue.nextInt();
                        break;
                    } else {
                        System.out.print("Tabuada: ");
                        for(int i = 0; i <= 10; i++) {
                            System.out.print(value + " x " + i + " = ");
                            System.out.println(i * value);
                        }
                    }
                    break;
                case 0:
                    System.out.print("\nPrograma encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }  
            
    }
}