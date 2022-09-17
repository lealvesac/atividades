/*Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário a quantidades de latas de tinta a serem compradas e o preço
total*/
package exercicio;

import java.util.Scanner;

public class Exercicio16 {
        public static void main(String[] ags){

            Scanner scan = new Scanner(System.in);

            double valorLataTinta = 80.00;
            double qtdLataTinta = 18.00;
            double metrosQuadradosLataTinta = qtdLataTinta / 3;

            System.out.print("Informe a area em metros quadrados a ser pintada: ");
            double areaPintura = scan.nextDouble();

        }

}
