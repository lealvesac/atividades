/*Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.*/
package exercicio;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe PRIMEIRO numero: ");
        int priNumero = scan.nextInt();

        System.out.print("Informe SEGUNDO numero: ");
        int secNumero = scan.nextInt();

        System.out.print("Informe TERCEIRO numero: ");
        double tecNumero = scan.nextDouble();

        int resultadoA = (priNumero * 2) + (secNumero /2);
        double resultadoB = (priNumero * 3) + tecNumero;
        double resultadoC = Math.pow(tecNumero, 3);

        System.out.println(resultadoA);
        System.out.println(resultadoB);
        System.out.println(resultadoC);

    }
}
