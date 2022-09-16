//Faça um Programa que peça a temperatura em graus Celsius,
//transforme e mostre em graus Farenheit. (0 °C × 9/5) + 32 = 32 °F
package exercicio;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe valor em Celsius para converter para Farenheit:");
        double valorCelsius = scan.nextDouble();
        double valorFaren = (valorCelsius * 9 / 5) + 32;
        System.out.println("O valor de " + valorCelsius + "° em Farenheit é igual à " + valorFaren);
    }
}
