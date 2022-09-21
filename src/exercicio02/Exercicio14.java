/*Faça um programa que lê as duas notas parciais obtidas por um aluno
        numa disciplina ao longo de um semestre, e calcule a sua média. A
        atribuição de conceitos obedece à tabela abaixo:
        o Média de Aproveitamento Conceito
        o Entre 9.0 e 10.0 A
        o Entre 7.5 e 9.0 B
        o Entre 6.0 e 7.5 C
        o Entre 4.0 e 6.0 D
        o Entre 4.0 e zero E
        O algoritmo deve mostrar na tela as notas, a média, o conceito
        correspondente e a mensagem “APROVADO” se o conceito for
        A, B ou C ou “REPROVADO” se o conceito for D ou E.*/
package exercicio02;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a PRIMEIRA nota: ");
        double nota1 = input.nextDouble();
        System.out.print("Informe a SEGUNDA nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;
        String situacao = "";
        String conceito = "";

        if (media > 6.0){
            situacao = "APROVADO";
            if (media > 9.0){
                conceito = "A";
            } else if (media > 7.5){
                conceito = "B";
            } else {
                conceito = "C";
            }
        } else {
            situacao = "REPROVADO";
            if (media > 4.0 && media < 6.0){
                conceito = "D";
            }else {
                conceito = "E";
            }
        }

        System.out.println("A sua média obtida foi: " + media + ", e você esta " + situacao + "! Com conceito " +
                conceito +"!");

    }
}
