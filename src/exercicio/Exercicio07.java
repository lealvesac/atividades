//Faça um Programa que calcule a área de um quadrado, em seguida
//mostre o dobro desta área para o usuário.
package exercicio;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o lado do quadrado: ");
        double lado = scan.nextDouble();
        double area = Math.pow(lado, 2);
        double dobro = area * 2;

        System.out.println("A area do quadro é: " + area + ". E o seu dobro é: " + dobro);
    }
}
