/*Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
. Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso*/
package exercicio;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe qual é o seu peso: ");
        double peso = scan.nextDouble();

        System.out.print("Informe a sua altura: ");
        double altura = scan.nextDouble();

        System.out.print("Informe o seu sexo 1 - Homem / 2 - Mulher: ");
        int sexo = scan.nextInt();

        if (sexo == 1){
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal para o sexo MASCULINO é:  " + pesoIdeal);
            if (pesoIdeal <= peso){
                System.out.println("Voce esta acima do peso.");
            } else {
                System.out.println("Voce esta no peso ideal.");
            }
        } else if (sexo == 2) {
            double pesoIdeal = (62.1 * altura) - 44.7 ;
            System.out.println("O peso ideal para o sexo FEMINIMO é: " + pesoIdeal);
            if (pesoIdeal <= peso){
                System.out.println("Voce esta acima do peso.");
            } else {
                System.out.println("Voce esta no peso ideal.");
            }
        } else {
            System.out.println("Opção Invalida.");
        }

    }
}
