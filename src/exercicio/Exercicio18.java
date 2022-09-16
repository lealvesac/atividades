/*Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos)*/
package exercicio;

import java.util.Scanner;

public class Exercicio18 {
    public static void main (String[] args){

        Scanner scan =new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo para download em MB: ");
        double arquivoMB = scan.nextDouble();

        System.out.println("Qual a sua velocidade de internet em Mbps: ");
        double velocidadeInternet = scan.nextDouble();

        double velocidadeMinuto = velocidadeInternet * 60;
        double tempoEstimadoDownload = arquivoMB / velocidadeMinuto;

        System.out.println("Tempos estimado para o download do seu arquivo é de " + tempoEstimadoDownload + " minutos.");

    }
}
