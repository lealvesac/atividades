/*Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto*/
package exercicio02;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um ano, e lhe informo se ele é Bissexto ou não.\nEX: 1998: ");
        int ano = input.nextInt();

        if ((ano % 4 == 0) && (ano % 100 == 0) && (ano % 400 == 0)){
            System.out.println("O ano de " + ano + " é BISSEXTO!!!");
        } else {
            System.out.println("O ano de " + ano + " não é BISSEXTO!");
        }
    }
}
