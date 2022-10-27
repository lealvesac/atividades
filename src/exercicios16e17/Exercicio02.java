/*Faça um programa que leia um nome de usuário e a sua senha e não
        aceite a senha igual ao nome do usuário, mostrando uma mensagem
        de erro e voltando a pedir as informações.*/
package exercicios16e17;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um nome de usuario: ");
        String userID = input.next();
        System.out.print("Informe a sua senha: ");
        String password = input.next();

        while (userID.equalsIgnoreCase(password)){
            System.out.println("Senha INVALIDA!!!\nInforme a sua senha: ");
            password = input.next();
        }

        System.out.println("Usuario e SENHA cadastrados com SUCESSO.");
    }
}
