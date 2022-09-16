//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
package exercicio;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a Primeira NOTA: ");
        double nota1 = scan.nextDouble();
        System.out.print("Informe a Segunda NOTA: ");
        double nota2 = scan.nextDouble();
        System.out.print("Informe a Terceira NOTA: ");
        double nota3 = scan.nextDouble();
        System.out.print("Informe a Quarta NOTA: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média bimestral é igual à " + media);
    }
}
