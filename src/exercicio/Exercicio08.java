//3. Faça um Programa que pergunte quanto você ganha por hora e o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu
//salário no referido mês.
package exercicio;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora? ");
        double valorHora = scan.nextDouble();
        System.out.print("Quantas horas você trabalha por mês? ");
        double horaMes = scan.nextDouble();
        double salario = valorHora * horaMes;
        System.out.println("Seu salario mensal é de R$" + salario);
    }
}
