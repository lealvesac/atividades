/*Um posto está vendendo combustíveis com a seguinte tabela de descontos:
        . Álcool:
        a. até 20 litros, desconto de 3% por litro
        b. acima de 20 litros, desconto de 5% por litro
        Gasolina:
        c. até 20 litros, desconto de 4% por litro
        d. acima de 20 litros, desconto de 6% por litro
        Escreva um algoritmo que leia o número de litros vendidos, o tipo de
        combustível (codificado da seguinte forma: A-álcool, G-gasolina),
        calcule e imprima o valor a ser pago pelo cliente
        sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
        do litro do álcool é R$ 1,90.*/
package exercicio02;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double precoAlcool = 1.90, precoGasolina = 2.50;

        System.out.println("Informe o combustivel:");
        System.out.println("[ A ] - Álcool\n[ G ] - Gasolina");
        String combustivel = input.next();
        System.out.print("Quantos litros: ");
        double litragem = input.nextDouble();

        if (combustivel.equalsIgnoreCase("a")){
            if (litragem <= 20){
                double valorPago = (precoAlcool - (precoAlcool * 3) / 100) * litragem;
                System.out.println("O valor a ser pago é de R$" + valorPago);
            } else {
                double valorPago = (precoAlcool - (precoAlcool * 5) / 100) * litragem;
                System.out.println("O valor a ser pago é de R$" + valorPago);
            }
        } else if (combustivel.equalsIgnoreCase("g")) {
            if (litragem <= 20){
                double valorPago = (precoGasolina - (precoGasolina * 4) / 100) * litragem;
                System.out.println("O valor a ser pago é de R$" + valorPago);
            } else {
                double valorPago = (precoGasolina - (precoGasolina * 6) / 100) * litragem;
                System.out.println("O valor a ser pago é de R$" + valorPago);
            }
        } else {
                System.out.println("Combustivel INVALIDO!");
        }
    }
}
