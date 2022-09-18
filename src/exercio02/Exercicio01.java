//Faça um Programa que peça dois números e imprima o maior deles.
package exercio02;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double maior;

        System.out.println("Informe um numero: ");
        double num1 = scan.nextDouble();

        System.out.println("Informe outro numero: ");
        double num2 = scan.nextDouble();

        if (num1 > num2){
            maior = num1;
        } else {
            maior = num2;
        }

        System.out.println("Esse é o maior numero: " + maior);
    }
}
