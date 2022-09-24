/*Faça um Programa que peça um número inteiro e determine se ele é
        par ou impar. Dica: utilize o operador módulo (resto da divisão)*/
package exercicio02;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com um numero para que descobrir se é IMPAR ou PAR: ");
        int numero = input.nextInt();

        if (numero % 2 == 0){
            System.out.println("Esse numero é PAR!");
        } else {
            System.out.println("Esse numero é IMPAR!");
        }
    }
}
