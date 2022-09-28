/*Faça um Programa que leia 2 números e em seguida pergunte ao
        usuário qual operação ele deseja realizar. O resultado da operação
        deve ser acompanhado de uma frase que diga se o número é:
        . par ou ímpar;
        a. positivo ou negativo;*/

package exercicio02;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe dos numeros.\nNumero 1: ");
        int num1 = input.nextInt();
        System.out.print("Numero 2: ");
        int num2 = input.nextInt();

        System.out.println("Qual das operações abaixo você quer fazer:");
        System.out.println("[ 1 ] - Adição");
        System.out.println("[ 2 ] - Subtração");
        System.out.println("[ 3 ] - Multiplicação");
        System.out.println("[ 4 ] - Divisão");
        int escolha = input.nextInt();
        int resultado = 0;
        boolean stopContinue = true;

        switch (escolha){
            case 1:
                resultado = num1 + num2; break;
            case 2:
                resultado = num1 - num2; break;
            case 3:
                resultado = num1 * num2; break;
            case 4:
                resultado = num1 / num2; break;
            default:
                System.out.println("Opção Invalida");
                stopContinue = false;
        }

        if (stopContinue == true){
            if (resultado % 2 == 0) {
                System.out.println("O resultado é PAR. E é um numero " + (resultado > 0 ? "POSITIVO!" : "NEGATIVO!"));
            } else{
                System.out.println("O resultado é IMPAR. E é um numero " + (resultado > 0 ? "POSITIVO!" : "NEGATIVO!"));
            }
        }
    }
}
