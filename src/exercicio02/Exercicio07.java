//Faça um Programa que leia três números e mostre o maior e o menor deles
package exercicio02;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe 3 numeros");

        System.out.print("Numero: 1: ");
        double n1 = input.nextDouble();

        System.out.print("Numero: 2: ");
        double n2 = input.nextDouble();

        System.out.print("Numero: 3: ");
        double n3 = input.nextDouble();

        if (n1 >= n2 && n1 >= n3){
            System.out.println(n1 + " É o maior numero");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " É o maior numero");
        } else {
        System.out.println(n3 + " É o maior numero");
        }

        if (n1 <= n2 && n1 <= n3){
            System.out.println(n1 + " É o menor numero");
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.println(n2 + " É o menor numero");
        } else {
            System.out.println(n3 + " É o menor numero");
        }

    }
}
