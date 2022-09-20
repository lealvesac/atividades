//Faça um Programa que pergunte em que turno você estuda. Peça
//para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
//mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
//Inválido!", conforme o caso.
package exercicio02;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual turno você estuda?");
        System.out.println("M-matutino");
        System.out.println("V-Vespertino");
        System.out.println("N- Noturno");
        System.out.print("Informe uma letra das opões a cima: ");
        String opcao = input.next();

        if (opcao.equalsIgnoreCase("m")){
            System.out.println("Bom dia!!!");
        } else if (opcao.equalsIgnoreCase("v")) {
            System.out.println("Boa tarde!!!");
        } else if (opcao.equalsIgnoreCase("n")) {
            System.out.println("Boa noite!!!");
        } else {
            System.out.println("OPÇÃO INVALIDA!!!");
        }
    }
}
