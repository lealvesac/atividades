/*Faça um programa para o cálculo de uma folha de pagamento,sabendo que os descontos são do Imposto de Renda,
que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
    o Desconto do IR:
    o Salário Bruto até 900 (inclusive) - isento
    o Salário Bruto até 1500 (inclusive) - desconto de 5%
    o Salário Bruto até 2500 (inclusive) - desconto de 10%
    o Salário Bruto acima de 2500 - desconto de 20%
Imprima na tela as informações, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora é 5 e a quantidade de hora é 220.
Salário Bruto: (5 * 220) : R$ 1100,00
             (-) IR (5%) : R$ 55,00
         (-) INSS ( 10%) : R$ 110,00
              FGTS (11%) : R$ 121,00
      Total de descontos : R$ 165,00
         Salário Liquido : R$ 935,00*/
package exercicio02;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: R$");
        double valorHora = input.nextDouble();
        System.out.print("Quantas horas voce trabalha no mês: ");
        double horasMes = input.nextDouble();

        double salarioBruto = valorHora * horasMes;
        double fgts = salarioBruto * 0.11;
        double inss = salarioBruto * 0.10;
        double impostoRenda;

        if (salarioBruto > 900.00 && salarioBruto <= 1500.00){
            impostoRenda = 5;
        } else if (salarioBruto > 1500.00 && salarioBruto <= 2500.00) {
            impostoRenda = 10;
        } else if (salarioBruto > 2500.00) {
            impostoRenda = 20;
        } else {
            impostoRenda = 0;
        }
        double descontoIR = (salarioBruto * impostoRenda) / 100;
        double totalDesconto = inss + descontoIR;
        double salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("Salario bruto (" + valorHora + " * " + horasMes + "): R$" + salarioBruto);
        System.out.println("(-) IR (" + (impostoRenda == 0? "ISENTO" : impostoRenda + "%") + ") R$" + descontoIR);
        System.out.println("(-) INSS (10%) R$" + inss);
        System.out.println("FGTS (11%) R$" + fgts);
        System.out.println("Total de descontos R$" + totalDesconto);
        System.out.println("Salario Liquido R$" + salarioLiquido);

    }
}
