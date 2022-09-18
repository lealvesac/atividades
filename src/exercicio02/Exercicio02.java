//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
package exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        double valor = scan.nextDouble();

        if (valor > 0){
            System.out.println("O valor informado é POSITIVO!");
        } else if (valor == 0) {
            System.out.println("O valor informado é NEUTRO!");
        } else {
            System.out.println("O valor informado é NEGATIVO!");
        }
    }
}
