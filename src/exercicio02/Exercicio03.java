//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
package exercicio02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char sexo = input.next().charAt(0);

        if (sexo == 'F' || sexo =='f'){
            System.out.println("A letra informada " + sexo + " - Feminino.");
        } else if (sexo == 'M' || sexo == 'm') {
            System.out.println("A letra informada " + sexo + " - Masculino.");
        } else {
            System.out.println("Sexo Inválido.");
        }
    }
}
