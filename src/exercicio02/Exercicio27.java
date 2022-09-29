/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
        Até 5 Kg Acima de 5 Kg
        Morango R$ 2,50 por Kg R$ 2,20 por Kg
        Maçã R$ 1,80 por Kg R$ 1,50 por Kg
        Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
        compra ultrapassar R$ 25,00, receberá ainda um desconto de
        10% sobre este total. Escreva um algoritmo para ler a
        quantidade (em Kg) de morangos e a quantidade (em Kg) de
        maças adquiridas e escreva o valor a ser pago pelo cliente.*/
package exercicio02;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorMorango, valorMaca;

        System.out.print("Quantos Kilos de Morango: ");
        double morangoKg = input.nextDouble();
        if (morangoKg <= 5){
            valorMorango = morangoKg * 2.50;
        } else {
            valorMorango = morangoKg * 2.20;
        }

        System.out.print("Quantos Kilos de Maçã: ");
        double macaKg = input.nextDouble();
        if (macaKg <= 5){
            valorMaca = macaKg * 1.80;
        } else {
            valorMaca = macaKg *1.50;
        }

        double totalPeso = morangoKg + macaKg;
        System.out.println(totalPeso);
        double totalCompra = valorMorango + valorMaca;
        System.out.println(totalCompra);

        if (totalPeso > 8.00 || totalCompra > 25.00){
            double valorFinalCompra = totalCompra + (totalCompra * 10) / 100;
            System.out.println("O valor a ser pago será de R$" + valorFinalCompra);
        } else {
            System.out.println("O valor a ser pago será de R$" + totalCompra);
        }

    }
}
