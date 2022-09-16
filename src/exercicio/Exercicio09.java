//Faça um Programa que peça a temperatura em graus Farenheit,
//transforme e mostre a temperatura em graus Celsius.
//o C = (5 * (F-32) / 9).
package exercicio;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe uma temperatura em Farenheit para converter em Celsius: ");
        double tempFare = scan.nextDouble();
        double temCelsius = (5 * (tempFare - 32 ) / 9);
        System.out.println("A temperatura de " + tempFare + "F convertido para Celsius é igual à " + temCelsius + "°");
    }
}
