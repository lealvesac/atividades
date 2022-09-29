/*O Hipermercado Tabajara está com uma promoção de carnes que é
        imperdível. Confira:
         o Até 5 Kg                  Acima de 5 Kg
        o File Duplo R$ 4,90    por Kg R$ 5,80 por Kg
        o Alcatra R$ 5,90 por   Kg R$ 6,80 por Kg
        o Picanha R$ 6,90 por   Kg R$ 7,80 por Kg
        Para atender a todos os clientes, cada cliente poderá levar
        apenas um dos tipos de carne da promoção, porém não há
        limites para a quantidade de carne por cliente. Se compra for
        feita no cartão Tabajara o cliente receberá ainda um desconto
        de 5% sobre o total a compra. Escreva um programa que peça
        o tipo e a quantidade de carne comprada pelo usuário e gere
        um cupom fiscal, contendo as informações da compra: tipo e
        quantidade de carne, preço total, tipo de pagamento, valor do
        desconto e valor a pagar.*/
package exercicio02;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String corteCarne = "", tipoPagamento = "";
        double valorCompra = 0, qtdKgCarne = 0, descCompra = 0;
        double precoTotal = 0;


        System.out.print("TIPOS DE CORTESBOVINOS\n[ 1 ] - Filé Duplo\n[ 2 ] - Alcatra\n" +
                "[ 3 ] - Picanha\nQual carne você deseja levar: ");
        int tipoCarne = input.nextInt();
        if (tipoCarne <= 0 || tipoCarne > 3){
            System.out.println("OPÇÃO INVALIDA, O PROGRAMA SERA ENCERRADO!!!");
        } else {
            System.out.print("São quandos Kilos: ");
            qtdKgCarne = input.nextDouble();

            switch (tipoCarne){
                case 1:
                    corteCarne = "Filé Duplo";
                    if(qtdKgCarne <= 5){
                        valorCompra = qtdKgCarne * 4.90;
                    } else {
                        valorCompra = qtdKgCarne * 5.80;
                    } break;
                case 2:
                    corteCarne = "Alcatra";
                    if(qtdKgCarne <= 5){
                        valorCompra = qtdKgCarne * 5.90;
                    } else {
                        valorCompra = qtdKgCarne * 6.80;
                    } break;
                case 3:
                    corteCarne = "Picanha";
                    if(qtdKgCarne <= 5){
                        valorCompra = qtdKgCarne * 6.90;
                    } else {
                        valorCompra = qtdKgCarne * 7.80;
                    } break;
                default:
            }

            System.out.println("FORMAS DE PAGAMENTO\n[ 1 ] - Cartão Tabajara\n[ 2 ] - Dinheiro");
            int formaPagamento = input.nextInt();
            if (formaPagamento == 1){
                tipoPagamento = "Cartão Tabajara";
                descCompra = (valorCompra * 5) / 100;
                precoTotal = valorCompra - descCompra;
            } else {
                tipoPagamento = "Dinheiro";
                precoTotal = valorCompra;
            }

            System.out.println("RESUMO DE SUA COMPRA");
            System.out.println("Corte da carne: " + corteCarne);
            System.out.println("Quantidade : " + qtdKgCarne + "Kg");
            System.out.println("O valor da compra foi de R$" + valorCompra);
            System.out.println("A forma de pagamento escolhida: " + tipoPagamento);
            System.out.println((descCompra > 0 ? "Teve um desconto de R$" + descCompra : ""));
            System.out.println("Valor a Total a Pagar R$" + precoTotal);
        }

    }
}
