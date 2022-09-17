/*João Papo-de-Pescador, homem de bem, comprou um
microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido
pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
você faça um programa que leia a variável peso (peso de peixes) e
verifique se há excesso. Se houver, gravar na variável excesso e na
variável multa o valor da multa que João deverá pagar. Caso contrário
mostrar tais variáveis com o conteúdo ZERO.*/
package exercicio;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double qtdQuiloPermitido = 50.0;
        double multa = 0;
        double excesso = 0;

        System.out.print("Informe a quantidade de QUILOS: ");
        double peso = scan.nextDouble();

        if(peso > 50){
            excesso = peso - 50.0;
            multa = excesso * 4.00;
            System.out.println("Você exceder o limite de 50kg. Ultrapassou " + excesso + "kg. " +
                    "A sua multa é de R$" + multa);
        } else {
            System.out.println("Tudo certo, você tem " + excesso + " de excesso. E " + multa + " de multa.");
        }

    }

}
