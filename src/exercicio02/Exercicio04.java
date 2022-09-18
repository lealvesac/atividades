//Faça um Programa que verifique se uma letra digitada é vogal ou
//consoante.
package exercicio02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Entre com uma letra: ");
        String letra = input.next();

        if (letra.length() > 1){
            System.out.println("Não é uma letra válida!");
        } else {
            switch (letra){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println(letra + " é uma VOGAL.");
                break;
                default:
                    System.out.println(letra + " é uma CONSOANTE.");
            }
        }
    }
}
