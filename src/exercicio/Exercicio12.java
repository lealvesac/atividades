/*Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7 * altura) - 58*/
package exercicio;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a sua altura: ");
        double alturaPessoa = scan.nextDouble();
        double pesoIdeal = (72.7 * alturaPessoa) - 58;
        System.out.println("Seu peso ideal é " + pesoIdeal + "kg.");
    }
}
