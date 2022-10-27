/*Supondo que a população de um país A seja da ordem de 80000
        habitantes com uma taxa anual de crescimento de 3% e que a
        população de B seja 200000 habitantes com uma taxa de crescimento
        de 1.5%. Faça um programa que calcule e escreva o número de anos
        necessários para que a população do país A ultrapasse ou iguale a
        população do país B, mantidas as taxas de crescimento.*/
package exercicios16e17;

public class Exercicio04 {
    public static void main(String[] args) {
        double paisA = 80000;
        double paisB = 200000;
        int ano = 0;

        while (paisA <= paisB){
            paisA = paisA + (paisA * 3) / 100;
            paisB = paisB + (paisB * 1.5) / 100;
            ano++;
        }

        System.out.println("Será " + ano + " anos.\nPara que a população do País A com total de " + paisA +
                " habitantes.\nSe equipare ou ultrapasse a população do Pais B de " + paisB + " habitantes.");

    }
}
