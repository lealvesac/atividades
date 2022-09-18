//Faça um Programa que leia três números e mostre o maior deles.
package exercicio02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double maior;

        System.out.println("Informe 3 numeros");
        System.out.print("Numero: 1: ");
        double n1 = input.nextDouble();
        System.out.print("Numero: 2: ");
        double n2 = input.nextDouble();
        System.out.print("Numero: 3: ");
        double n3 = input.nextDouble();

        if (n1 >= n2 && n1 >= n3){
           maior = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        System.out.println("O maior numeiro é " + maior);
    }
}
