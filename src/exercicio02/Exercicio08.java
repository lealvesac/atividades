//Faça um programa que pergunte o preço de três produtos e informe
//qual produto você deve comprar, sabendo que a decisão é sempre
//pelo mais barato.
package exercicio02;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor do PROUTO 1: ");
        double produto1 = input.nextDouble();

        System.out.print("Informe o valor do PROUTO 2: ");
        double produto2 = input.nextDouble();

        System.out.print("Informe o valor do PROUTO 3: ");
        double produto3 = input.nextDouble();

        if (produto1 <= produto2 && produto1 <= produto3){
            System.out.println("Compre o PRODUTO 1, é o mais barato!");
        } else if (produto2 <= produto1 && produto2 <= produto3) {
            System.out.println("Compre o PRODUTO 2, é o mais barato!");
        } else {
            System.out.println("Compre o PRODUTO 3, é o mais barato!");
        }
    }
}
