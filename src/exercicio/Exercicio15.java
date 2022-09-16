/*Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.*/
package exercicio;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor que você ganha por hora: R$");
        double valorHora = scan.nextDouble();

        System.out.print("Informe quantas horas você trabalha por mês: ");
        double horaMes = scan.nextDouble();

        double salarioBruto = valorHora * horaMes;
        double descontoIR = salarioBruto * 11 / 100;
        double descontoINSS = salarioBruto * 8 / 100;
        double descontoSIND = salarioBruto * 5 / 100;
        double totalDesconto = descontoIR + descontoINSS + descontoSIND;
        double salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("Seu salario bruto foi R$" + salarioBruto);
        System.out.println("Você teve os descontos de R$" + descontoIR + " de IMPOSTO DE RENDA.");
        System.out.println("RS" + descontoINSS + " de INSS.");
        System.out.println("R$" + descontoSIND + " de SINDICATO.");
        System.out.println("Teve um total de descontos do seu salario bruto de R$" + totalDesconto);
        System.out.println("Seu salario liquido é de R$" + salarioLiquido);

    }
}
