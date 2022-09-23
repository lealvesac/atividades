/*Faça um Programa para leitura de três notas parciais de um aluno. O
        programa deve calcular a média alcançada por aluno e presentar:
        . A mensagem "Aprovado", se a média for maior ou igual a 7,
        com a respectiva média alcançada;
        a. A mensagem "Reprovado", se a média for menor do que 7, com
        a respectiva média alcançada;
        b. A mensagem "Aprovado com Distinção", se a média for igual a
        10.*/
package exercicio02;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CALCULADORA DE MÉDIA DE NOTAS!");
        System.out.print("Informe a NOTA1: ");
        double nota1 = input.nextDouble();
        System.out.print("Informe a NOTA2: ");
        double nota2 = input.nextDouble();
        System.out.print("Informe a NOTA3: ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7 && media < 10) {
            System.out.println("Vocé esta APROVADO com uma média de " + media);
        } else if (media < 7) {
            System.out.println("Você esta REPROVADO com uma média de " + media);
        } else {
            System.out.println("PARABENS APROVADO COM DISTINÇÃO!!!");
        }
    }
}
