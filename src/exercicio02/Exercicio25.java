/*Faça um programa que faça 5 perguntas para uma pessoa sobre um
        crime. As perguntas são:
        . "Telefonou para a vítima?"
        a. "Esteve no local do crime?"
        b. "Mora perto da vítima?"
        c. "Devia para a vítima?"
        d. "Já trabalhou com a vítima?"
        O programa deve no final emitir
        uma classificação sobre a participação da pessoa no crime. Se
        a pessoa responder positivamente a 2 questões ela deve ser
        classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
        como "Assassino". Caso contrário, ele será classificado como
        "Inocente"*/
package exercicio02;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int crime = 0;

        System.out.print("Telefonou para a vítima?\n SIM / NÃO: ");
        String resposta1 = input.next();
        if (resposta1.equalsIgnoreCase("sim")){
            crime++;
        }

        System.out.print("Mora perto da vítima?\n SIM / NÃO: ");
        String resposta2 = input.next();
        if (resposta2.equalsIgnoreCase("sim")){
            crime++;
        }

        System.out.print("Devia para vítima?\n SIM / NÃO: ");
        String resposta3 = input.next();
        if (resposta3.equalsIgnoreCase("sim")){
            crime++;
        }

        System.out.print("Ja trabalho com a vítima?\n SIM / NÃO: ");
        String resposta4 = input.next();
        if (resposta4.equalsIgnoreCase("sim")){
            crime++;
        }

        System.out.print("Esteve no local do crime?\n SIM / NÃO: ");
        String resposta5 = input.next();
        if (resposta5.equalsIgnoreCase("sim")){
            crime++;
        }

        if (crime == 2){
            System.out.println("Você é uma pessoa SUSPEITA!!!");
        } else if (crime >= 3 && crime <= 4) {
            System.out.println("Você é CUMPLICE!!!");
        } else if (crime == 5) {
            System.out.println("Você é o ASSASSINO!!!");
        } else {
            System.out.println("Você é INOCENTE!!!");
        }
    }
}
