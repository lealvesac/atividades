//Faça um Programa que peça um número e então mostre a
//mensagem O número informado foi [número].
package exercicio;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numeroInformado = scan.nextInt();
        System.out.println("O numero informado foi " + numeroInformado + ".");
    }
}
