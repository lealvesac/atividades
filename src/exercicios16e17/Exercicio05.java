package exercicios16e17;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double paisA, paisB;
        int ano = 0, crescimentoPaisA, crescimentoPaisB;
        boolean isValido = false;

        do {
            System.out.print("Informe a população inicial de Vila Oculta da Folha: ");
            paisA = input.nextDouble();
            if (paisA > 0){
                isValido = true;
            } else {
                System.out.println("DADO INCORRETO!!!");
            }
        } while (!isValido);

        isValido = false;

        do {
            System.out.print("Informe a população inicial de Vila Oculta da Nevoa: ");
            paisB = input.nextDouble();
            if (paisB > 0){
                isValido = true;
            } else {
                System.out.println("DADO INCORRETO!!!");
            }
        } while (!isValido);

        isValido = false;

        do {
            System.out.print("Informe a taxa de crescimento anual da Vila Oculta da Folha: ");
            crescimentoPaisA = input.nextInt();
            if (crescimentoPaisA > 0){
                isValido = true;
            } else {
                System.out.println("DADO INCORRETO!!!");
            }
        }while (!isValido);

        isValido = false;

        do {
            System.out.print("Informe a taxa de crescimento anual da Vila Oculta da Nevoa: ");
            crescimentoPaisB = input.nextInt();
            if (crescimentoPaisB > 0){
                isValido = true;
            } else {
                System.out.println("DADO INCORRETO!!!");
            }
        }while (!isValido);

       if (paisA < paisB && crescimentoPaisA > crescimentoPaisB){
           if (crescimentoPaisA < crescimentoPaisB) {
               System.out.println("Impossível determinar o calculo de equiparação com o crescimento da " +
                       "Vila Oculta da Folha sendo menor que a Vila Oculta da Nevoa");
           } else if (crescimentoPaisA == crescimentoPaisB) {
               System.out.println("Impossível determinar o calculo de equiparação com o crescimento da " +
                       "Vila Oculta da Folha sendo igual que a Vila Oculta da Nevoa");
           } else {
               System.out.println("A população da Vila Oculta da Folha é menor que a da Vila Oculta da Nevoa.");
               while (paisA <= paisB){
                   paisA = paisA + (paisA * crescimentoPaisA) / 100;
                   paisB = paisB + (paisB * crescimentoPaisB) / 100;
                   ano++;
               }
               System.out.println("Será " + ano + " anos.\nPara que a população do Vila Oculta da Folha com total de " + paisA +
                       " habitantes.\nSe equipare ou ultrapasse a população do Vila Oculta da Nevoa de " + paisB + " habitantes.");
           }
       } else if (paisA > paisB && crescimentoPaisA < crescimentoPaisB){
           if (crescimentoPaisA > crescimentoPaisB) {
               System.out.println("Impossível determinar o calculo de equiparação com o crescimento da " +
                       "Vila Oculta da Folha sendo maior que a Vila Oculta da Nevoa");
           } else if (crescimentoPaisA == crescimentoPaisB) {
               System.out.println("Impossível determinar o calculo de equiparação com o crescimento da " +
                       "Vila Oculta da Folha sendo igual que a Vila Oculta da Nevoa");
           } else {
           System.out.println("A população da Vila Oculta da Folha é menor que a da Vila Oculta da Nevoa.");
           while (paisA >= paisB){
               paisA = paisA + (paisA * crescimentoPaisA) / 100;
               paisB = paisB + (paisB * crescimentoPaisB) / 100;
               ano++;
           }
           System.out.println("Será " + ano + " anos.\nPara que a população do Vila Oculta da Folha com total de " + paisA +
                   " habitantes.\nSe equipare ou ultrapasse a população do Vila Oculta da Nevoa de " + paisB + " habitantes.");}
       } else {
           System.out.println("Populações Iguais não tem como fazer equiparação de taxa de crescimento");
       }


    }
}
