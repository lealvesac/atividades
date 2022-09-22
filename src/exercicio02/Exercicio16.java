/*Faça um programa que calcule as raízes de uma equação do segundo
        grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
        b e c e fazer as consistências, informando ao usuário nas seguintes
        situações:
        a. Se o usuário informar o valor de A igual a zero, a equação não é
        do segundo grau e o programa não deve fazer pedir os demais
        valores, sendo encerrado;
        b. Se o delta calculado for negativo, a equação não possui raizes
        reais. Informe ao usuário e encerre o programa;
        c. Se o delta calculado for igual a zero a equação possui apenas
        uma raiz real; informe-a ao usuário;
        d. Se o delta for positivo, a equação possui duas raiz reais;
        informe-as ao usuário;*/
package exercicio02;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("VAMOS REALIZAR O CALCULO DA EQUAÇÃO DO SEGUNDO GRAU!");
        System.out.print("Informe o valor de a: ");
        int a = input.nextInt();

        if (a == 0){
            System.out.println("O valor informado não é para Equação do segundo grau.\n" +
                    "O programa sera encerrado.");
        }

        System.out.print("Informe o valor de b: ");
        int b = input.nextInt();
        System.out.print("Informe o valor de c: ");
        int c = input.nextInt();
        
        int delta = (b * b) - (4 * a * c);
        
        if (delta < 0){
            System.out.println("O valor de DELTA = " + delta + ". Por tanto não possi raizes real.");
        } else if (delta == 0) {
            double raiz = Math.sqrt(delta);
            System.out.println("O valor de DELTA = " + delta + ". Tem apenas uma raiz que é igual: " + raiz);
        } else if (delta > 0) {
            double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            System.out.println("O valor de X' = " + x1 + "\nO valor de X\" = " + x2);
        }

    }
}
