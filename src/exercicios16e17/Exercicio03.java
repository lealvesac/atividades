/*Faça um programa que leia e valide as seguintes informações:
        a. Nome: maior que 3 caracteres;
        b. Idade: entre 0 e 150;
        c. Salário: maior que zero;
        d. Sexo: 'f' ou 'm';
        e. Estado Civil: 's', 'c', 'v', 'd';*/
package exercicios16e17;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;
        double salario = 0;
        String sexo, sexoExtenso = "";
        String estadoCivil, estadoCivilExtenso = "";

        boolean validacao = false;

        do {
            System.out.print("Informe o seu nome: ");
            nome = input.nextLine();
            if (nome.length() < 3){
                System.out.println("ERRO!!!\nSeu nome não deve conter menos que 3 caracteres.");
            } else {
                validacao = true;
            }
        } while (!validacao);

        validacao = false;

        do {
            System.out.print("Informe o sua idade: ");
            idade = input.nextInt();
            if (idade <= 0 || idade > 150){
                System.out.println("ERRO!!!\nIdade INVALIDA!");
            } else {
                validacao = true;
            }
        } while (!validacao);

        validacao = false;

        do {
            System.out.print("Informe o seu salario: ");
            salario = input.nextDouble();
            if (salario < 0){
                System.out.println("ERRO!!!\nSalario Invalido");
            } else {
                validacao = true;
            }
        } while (!validacao);

        validacao = false;

        do {
            System.out.print("Informe o seu SEXO.\nF - FEMININO\nM - MASCULINO.\nOpção: ");
            sexo = input.next();
            if (sexo.equalsIgnoreCase("f")){
                sexoExtenso = "Feminino";
                validacao = true;
            } else if (sexo.equalsIgnoreCase("m")) {
                sexoExtenso = "Masculino";
                validacao = true;
            } else {
                System.out.println("Opção de SEXO Invalida.");
            }
        } while (!validacao);

        validacao = false;

        do {
            System.out.print("Informe o seu estado civil: ");
            estadoCivil = input.next();
            if (estadoCivil.equalsIgnoreCase("s")){
                validacao = true;
                estadoCivilExtenso = "Solteiro";
            } else if (estadoCivil.equalsIgnoreCase("c")){
                validacao = true;
                estadoCivilExtenso = "Casado";
            } else if (estadoCivil.equalsIgnoreCase("v")){
                validacao = true;
                estadoCivilExtenso = "Viúvo";
            } else if (estadoCivil.equalsIgnoreCase("d")){
                validacao = true;
                estadoCivilExtenso = "Divorciado";
            } else {
                System.out.println("Opção de estado civil invalido!");
            }
        } while (!validacao);

        System.out.println("Seu nome: " +nome+ ", tem a idade de " +idade+ ", com salario de R$" +salario+
                ", seu sexo é " +sexoExtenso+ " , e seu estado civil é " +estadoCivilExtenso+ ".");

    }
}
