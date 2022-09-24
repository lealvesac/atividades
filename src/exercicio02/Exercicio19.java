/*Faça um Programa que leia um número inteiro menor que 1000 e
        imprima a quantidade de centenas, dezenas e unidades do mesmo.
        o Observando os termos no plural a colocação do "e", da vírgula
        entre outros. Exemplo:
        o 326 = 3 centenas, 2 dezenas e 6 unidades
        o 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320,
        310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16*/
package exercicio02;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero inteiro menor que 1000.\n" +
                "Vamos decompor ele para saber a quantidade de CENTENAS, DEZENAS e UNIDADE:");
        int numInformado = input.nextInt();

        int centena;
        int dezena;
        int unidade;

        if (numInformado < 1000){
            centena = numInformado / 100;
            dezena = (numInformado / 10) % 10;
            unidade = numInformado % 10;
            System.out.println(centena + " , " +  dezena + ", " +  unidade);
        } else {
            System.out.println("Valos Informado INVALIDO!!!");
        }


    }
}
