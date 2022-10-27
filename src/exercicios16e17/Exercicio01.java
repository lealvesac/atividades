/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
        mensagem caso o valor seja inválido e continue pedindo até que o
        usuário informe um valor válido.*/
package exercicios16e17;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        double numero = input.nextInt();

        while (numero < 0 || numero > 10){
            System.out.printf("Numero Invalido.\nInforme numero valido: ");
            numero = input.nextInt();
        }
        System.out.printf("Numero valido.");
    }
}
