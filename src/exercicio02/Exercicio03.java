//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
package exercicio02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String sexo = input.next();

        if (sexo.equalsIgnoreCase("f")){
            System.out.println("A letra informada " + sexo + " - Feminino.");
        } else if (sexo.equalsIgnoreCase("m")) {
            System.out.println("A letra informada " + sexo + " - Masculino.");
        } else {
            System.out.println("Sexo Inválido.");
        }
    }
}
