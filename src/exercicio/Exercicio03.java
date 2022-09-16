//Faça um Programa que peça dois números e imprima a soma.
package exercicio;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe PRIMEIRO numero: ");
        int priNumero = scan.nextInt();
        System.out.print("Informe SEGUNDO numrto: ");
        int secNumero = scan.nextInt();

        int resultado = priNumero + secNumero;
        System.out.println("A soma de " + priNumero + " + " + secNumero + " = " + resultado);
    }
}
