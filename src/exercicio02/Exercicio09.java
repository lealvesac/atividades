//Faça um Programa que leia três números e mostre-os em ordem decrescente.
package exercicio02;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe 3 numeros");

        System.out.print("Numero: 1: ");
        int n1 = input.nextInt();
        System.out.print("Numero: 2: ");
        int n2 = input.nextInt();
        System.out.print("Numero: 3: ");
        int n3 = input.nextInt();

        if (n1 >= n2 && n1 >= n3 && n2 >= n3){
           System.out.println(n1 +  " - " + n2 + " - " + n3);
        } else if (n1 >= n3 && n3 >= n2 && n1 >= n3) {
           System.out.println(n1 + " - " + n3 + " - " + n2);
        } else if (n2 >= n1 && n1 >= n3 && n2 >= n3) {
           System.out.println(n2 + " - " + n1 + " - " + n3);
        } else if (n2 >= n1 && n2 >= n3 && n3 >= n1) {
            System.out.println(n2 + " - " + n3 + " - " + n1);
        } else if (n3 >= n1 && n3 >= n2 && n2 >= n1) {
            System.out.println(n3 + " - " + n2 + " - " + n1);
        } else if (n3 >= n1 && n1 >= n2 && n3 >= n2) {
            System.out.println(n3 + " - " + n1 + " - " + n2);
        }
    }
}
