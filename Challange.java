// Questão 5: Conversão de Moedas (DESAFIO)
// Crie um conversor de moedas que permite ao usuário escolher entre diferentes opções
// de moedas para conversão. O programa deve perguntar ao usuário o valor a ser
// conver9do e a moeda de origem (BRL, USD, EUR) e a moeda de des9no (BRL, USD, EUR).
// U9lize as taxas de câmbio aproximadas (1 BRL = 0.18 USD, 1 BRL = 0.15 EUR, 1 USD =
// 0.84 EUR). Exiba o valor conver9do

import java.util.Scanner;

class Challange {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println(
      "Digite um valor, a moeda de origem desse valor e a moeda de destino (BRL, USD, EUR)"
    );
    double valor = input.nextDouble();
    input.nextLine();
    String moedaOrigem = input.nextLine();
    String moedaConverter = input.nextLine();
    double valorConvertido;

    switch (moedaOrigem) {
      case "BRL":
        if (moedaConverter.equals("BRL")) {
          System.out.println(
            "O valor " + valor + " " + "ja esta em sua moeda!"
          );
        } else {
          if (moedaConverter.equals("USD")) {
            valorConvertido = valor * 0.18;
            System.out.println(
              "O valor " +
              valor +
              " " +
              "em" +
              " " +
              moedaOrigem +
              " " +
              "convertido para " +
              "USD eh  " +
              valorConvertido
            );
          } else {
            valorConvertido = valor * 0.15;
            System.out.println(
              "O valor " +
              valor +
              " " +
              "em" +
              " " +
              moedaOrigem +
              " " +
              "convertido para " +
              "EUR eh " +
              valorConvertido
            );
          }
        }
        break;
      case "USD":
        if (moedaConverter.equals("BRL")) {
          valorConvertido = valor * 5.03;
          System.out.println(
            "O valor " +
            valor +
            " " +
            "em" +
            " " +
            moedaOrigem +
            " " +
            "convertido para " +
            "BRL eh " +
            valorConvertido
          );
        } else {
          if (moedaConverter.equals("USD")) {
            System.out.println(
              "O valor " + valor + " " + "ja esta em sua moeda!"
            );
          } else {
            valorConvertido = valor * 0.84;
            System.out.println(
              "O valor " +
              valor +
              " " +
              "em" +
              " " +
              moedaOrigem +
              " " +
              "convertido para " +
              "EUR eh " +
              valorConvertido
            );
          }
        }
        break;
      case "EUR":
        if (moedaConverter.equals("BRL")) {
          valorConvertido = valor * 5.46;
          System.out.println(
            "O valor " +
            valor +
            " " +
            "em" +
            " " +
            moedaOrigem +
            " " +
            "convertido para " +
            "BRL eh " +
            valorConvertido
          );
        } else {
          if (moedaConverter.equals("USD")) {
            valorConvertido = valor * 1.09;
            System.out.println(
              "O valor " +
              valor +
              " " +
              "em" +
              " " +
              moedaOrigem +
              " " +
              "convertido para " +
              "USD eh " +
              valorConvertido
            );
          } else {
            System.out.println(
              "O valor " + valor + " " + "ja esta em sua moeda!"
            );
          }
        }
        break;
      default:
        System.out.println("Nao foi encontrada nenhuma moeda para conversao!");
        break;
    }
  }
}
